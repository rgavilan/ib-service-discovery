package es.um.asio.service.model.service.discovery;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(NodeEnt.class)
public abstract class Node_ {

	public static volatile SingularAttribute<NodeEnt, String> name;
	public static volatile SetAttribute<NodeEnt, ServiceEnt> services;

	public static final String NAME = "name";
	public static final String SERVICES = "services";

}

