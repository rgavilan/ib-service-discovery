package es.um.asio.service.service;

import es.um.asio.service.model.service.discovery.NodeEnt;
import es.um.asio.service.model.service.discovery.TypeEnt;

import java.util.List;


public interface ServiceDiscoveryService {

    NodeEnt addService(String node, String serviceName, String host, Integer port, String healthEndpoint);

    NodeEnt getNode(String nodeName);

    List<NodeEnt> getServices(String serviceName);

    NodeEnt addType(String nodeName, String serviceName, String typeName, String suffixURL);
}
