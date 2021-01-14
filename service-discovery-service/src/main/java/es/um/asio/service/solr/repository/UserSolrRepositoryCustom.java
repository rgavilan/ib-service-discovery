package es.um.asio.service.solr.repository;

import com.izertis.libraries.solr.query.FilteredQueryRepository;
import es.um.asio.service.filter.UserFilter;
import es.um.asio.service.solr.model.UserSolr;

/**
 * Custom Spring Data Solr repository for {@link UserSolr}
 */
public interface UserSolrRepositoryCustom extends FilteredQueryRepository<UserFilter, UserSolr> {

}
