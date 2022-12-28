package com.crud;

import javax.activation.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
    
    @Bean
    public javax.sql.DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("mysql.jdbc.cj");
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/temp");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("0000");
        return dataSourceBuilder.build();
    }
}