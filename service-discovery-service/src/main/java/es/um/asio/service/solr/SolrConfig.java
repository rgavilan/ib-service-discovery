package es.um.asio.service.solr;

import es.um.asio.service.solr.repository.UserSolrRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

/**
 * Solr APP configuration.
 */
@Configuration
@ConditionalOnProperty(prefix = "app.solr", name = "enabled", havingValue = "true", matchIfMissing = false)
@EnableSolrRepositories(basePackageClasses = UserSolrRepository.class)
@ComponentScan
public class SolrConfig {

}
