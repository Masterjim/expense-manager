/*
 * Copyright (c) eHealth
 */
package be.jeremy.expense.manager.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

/**
 * @author Jeremy Vanpé (eh056)
 */
@Configuration
@EnableJpaRepositories("be.jeremy.expense.manager.repository")
public class PersistenceConfiguration {

    @Autowired
    private DataSource dataSource;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        //JpaVendorAdapteradapter can be autowired as well if it's configured in application properties.
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(false);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        //Add package to scan for entities.
        factory.setPackagesToScan("be.jeremy.expense.manager.domain");
        factory.setDataSource(dataSource);
        return factory;
    }
}
