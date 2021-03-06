package es.um.asio.back;

import es.um.asio.back.solr.SolrBackConfig;
import es.um.asio.service.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@Import({ ServiceConfig.class, SolrBackConfig.class })
@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "*..solr..*") })
@EnableScheduling
public class Application {
    /**
     * Main method for embedded deployment.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
