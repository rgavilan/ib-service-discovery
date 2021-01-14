package es.um.asio.service.model.service.discovery;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TypeEnt.class)
public abstract class Type_ {

	public static volatile SingularAttribute<TypeEnt, String> baseURL;
	public static volatile SingularAttribute<TypeEnt, ServiceEnt> service;
	public static volatile SingularAttribute<TypeEnt, String> name;

	public static final String BASE_UR_L = "baseURL";
	public static final String SERVICE = "service";
	public static final String NAME = "name";

}

