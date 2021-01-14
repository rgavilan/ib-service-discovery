package es.um.asio.service.service.impl;

import com.google.gson.JsonArray;
import es.um.asio.service.model.service.discovery.NodeEnt;
import es.um.asio.service.model.service.discovery.ServiceEnt;
import es.um.asio.service.model.service.discovery.TypeEnt;
import es.um.asio.service.service.ServiceDiscoveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceDiscoveryServiceImpl implements ServiceDiscoveryService {

    @Autowired
    NodeServiceImp nodeService;

    @Autowired
    ServiceServiceImp serviceService;

    @Autowired
    TypeServiceImp typeService;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Override
    public NodeEnt addService(String nodeName, String serviceName, String host, Integer port, String healthEndpoint) {

        NodeEnt node = nodeService.getNodeByName(nodeName);
        if (node==null) {
            node = new NodeEnt(nodeName);
        }
        node.addService(
                new ServiceEnt(
                        node,serviceName,host,port,healthEndpoint
                )
        );
        nodeService.save(node);
        return node;
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Override
    public NodeEnt getNode(String nodeName) {
        return nodeService.getNodeByName(nodeName);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Override
    public List<NodeEnt> getServices(String serviceName) {
        Map<Long,NodeEnt> nodes = new HashMap<>();
        List<ServiceEnt> services = serviceService.getServiceByName(serviceName);
        if (services!=null) {
            for (ServiceEnt service :services) {
                NodeEnt node;
                if (nodes.get(service.getNodeEnt().getId())==null) { // Si no estaba en el map
                    node = new NodeEnt();
                    node.setId(service.getNodeEnt().getId());
                    node.setName(service.getNodeEnt().getName());
                    nodes.put(node.getId(),node);
                } else {
                    node = nodes.get(service.getNodeEnt().getId());
                }
                node.addService(service);
            }
        }
        return new ArrayList<>(nodes.values());
    }

    @Override
    public NodeEnt addType(String nodeName, String serviceName, String typeName, String suffixURL) {
        NodeEnt nodeEnt = nodeService.getNodeByName(nodeName);
        if (nodeEnt!=null) {
            for (ServiceEnt service : nodeEnt.getServices()) {
                if (service.getName().equals(serviceName)) {
                    TypeEnt type = new TypeEnt(service,typeName,suffixURL);
                    service.getTypes().add(type);
                }
            }
        }
        nodeService.save(nodeEnt);
        return nodeEnt;
    }
}
