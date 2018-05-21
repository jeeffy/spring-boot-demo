package com.jeeffy.demo.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class DataSourceConfig {
    @Autowired
    private Environment env;

    @Bean(name="dataSource")
    public HikariDataSource dataSourceHikari() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(env.getProperty("spring.datasource.url"));
        config.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
        config.setUsername(env.getProperty("spring.datasource.username"));
        config.setPassword(env.getProperty("spring.datasource.password"));
        config.setAutoCommit(true);
        config.setMaximumPoolSize(20);
        return new HikariDataSource(config);
    }
}
