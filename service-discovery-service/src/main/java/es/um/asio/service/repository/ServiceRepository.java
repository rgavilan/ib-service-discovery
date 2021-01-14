package es.um.asio.service.repository;


import es.um.asio.service.model.service.discovery.ServiceEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface ServiceRepository extends JpaRepository<ServiceEnt, String>, JpaSpecificationExecutor<ServiceEnt> {
    /**
     * Finds a Node using the name field.
     *
     * @param name
     *            The username to search for
     * @return an {@link ServiceEnt} entity stored in the database or {@literal Optional#empty()} if none found
     */
    Optional<List<ServiceEnt>> findByName(String name);
}
