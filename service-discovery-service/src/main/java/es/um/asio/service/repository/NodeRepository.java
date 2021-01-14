package es.um.asio.service.repository;

import es.um.asio.service.model.service.discovery.NodeEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface NodeRepository extends JpaRepository<NodeEnt, String>, JpaSpecificationExecutor<NodeEnt> {
    /**
     * Finds a Node using the name field.
     *
     * @param name
     *            The username to search for
     * @return an {@link NodeEnt} entity stored in the database or {@literal Optional#empty()} if none found
     */
    Optional<NodeEnt> findByName(String name);

}
