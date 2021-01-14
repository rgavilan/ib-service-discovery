package es.um.asio.service.repository;


import es.um.asio.service.model.service.discovery.HealthRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface HealthRequestRepository extends JpaRepository<HealthRequest, Long>, JpaSpecificationExecutor<HealthRequest> {

}
