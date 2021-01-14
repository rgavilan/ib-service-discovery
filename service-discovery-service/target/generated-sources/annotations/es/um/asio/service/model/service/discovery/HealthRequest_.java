package es.um.asio.service.model.service.discovery;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HealthRequest.class)
public abstract class HealthRequest_ {

	public static volatile SingularAttribute<HealthRequest, ServiceEnt> service;
	public static volatile SingularAttribute<HealthRequest, Long> requestDate;
	public static volatile SingularAttribute<HealthRequest, Long> id;
	public static volatile SingularAttribute<HealthRequest, Status> status;

	public static final String SERVICE = "service";
	public static final String REQUEST_DATE = "requestDate";
	public static final String ID = "id";
	public static final String STATUS = "status";

}

