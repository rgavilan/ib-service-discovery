package es.um.asio.service.service;

import com.izertis.abstractions.service.DeleteService;
import com.izertis.abstractions.service.QueryService;
import com.izertis.abstractions.service.SaveService;
import es.um.asio.service.filter.NodeFilter;
import es.um.asio.service.model.service.discovery.NodeEnt;

import java.util.List;

public interface NodeService
        extends QueryService<NodeEnt, String, NodeFilter>, SaveService<NodeEnt>, DeleteService<NodeEnt, String> {

    List<NodeEnt> getAllNodes();

    NodeEnt getNodeByName(String name);

}
