package es.um.asio.service.repository;


import es.um.asio.service.model.service.discovery.ServiceEnt;
import es.um.asio.service.model.service.discovery.TypeEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<TypeEnt, String>, JpaSpecificationExecutor<TypeEnt> {
    /**
     * Finds a Node using the name field.
     *
     * @param name
     *            The username to search for
     * @return an {@link ServiceEnt} entity stored in the database or {@literal Optional#empty()} if none found
     */
    Optional<TypeEnt> findByName(String name);
}
