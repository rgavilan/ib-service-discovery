package es.um.asio.service.solr.repository;

import es.um.asio.service.solr.model.UserSolr;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.Date;

/**
 * Spring Data Solr repository for {@link UserSolr}
 */
public interface UserSolrRepository extends SolrCrudRepository<UserSolr, String>, UserSolrRepositoryCustom {
    /**
     * Delete all documents older than an specific date.
     *
     * @param indexDate
     *            Date.
     */
    void deleteByIndexDateLessThan(Date indexDate);
}
