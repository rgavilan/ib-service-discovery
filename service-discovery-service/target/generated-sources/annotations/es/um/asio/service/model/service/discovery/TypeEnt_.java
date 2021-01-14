package es.um.asio.service.model.service.discovery;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TypeEnt.class)
public abstract class TypeEnt_ {

	public static volatile SingularAttribute<TypeEnt, ServiceEnt> service;
	public static volatile SingularAttribute<TypeEnt, String> name;
	public static volatile SingularAttribute<TypeEnt, Long> id;
	public static volatile SingularAttribute<TypeEnt, String> suffixURL;

	public static final String SERVICE = "service";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String SUFFIX_UR_L = "suffixURL";

}

