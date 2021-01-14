package es.um.asio.service.model.service.discovery;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ServiceEnt.class)
public abstract class ServiceEnt_ {

	public static volatile SingularAttribute<ServiceEnt, String> baseURL;
	public static volatile SetAttribute<ServiceEnt, TypeEnt> types;
	public static volatile ListAttribute<ServiceEnt, HealthRequest> healthRequests;
	public static volatile SingularAttribute<ServiceEnt, Integer> port;
	public static volatile SingularAttribute<ServiceEnt, String> name;
	public static volatile SingularAttribute<ServiceEnt, Long> id;
	public static volatile SingularAttribute<ServiceEnt, String> healthEndpoint;
	public static volatile SingularAttribute<ServiceEnt, NodeEnt> nodeEnt;
	public static volatile SingularAttribute<ServiceEnt, Status> status;

	public static final String BASE_UR_L = "baseURL";
	public static final String TYPES = "types";
	public static final String HEALTH_REQUESTS = "healthRequests";
	public static final String PORT = "port";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String HEALTH_ENDPOINT = "healthEndpoint";
	public static final String NODE_ENT = "nodeEnt";
	public static final String STATUS = "status";

}

