package com.christoper.jin.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Class DataSourceConfig
 * @Description
 * @Author hyungeun.jin
 * @Since 2020. 5. 13.
 * @Version 1.0
 * @COPYRIGHT © WADIZ ALL RIGHTS RESERVED.
 * ------------------------------------------------------------------------
 * Modification Information
 * ------------------------------------------------------------------------
 * 수정일 || 수정자 || 수정내용
 * ------------------------------------------------------------------------
 * 2020. 5. 13. || 진형은 || 최초생성
 */
@Configuration
@EnableConfigurationProperties
public class DataSourceConfig {

//  @Bean
//  @ConfigurationProperties(prefix="spring.christoper.datasource")
//  public DataSource dataSource(){
//    return DataSourceBuilder.create()
//            .type(HikariDataSource.class)
//            .build();
//  }
//
//  @Bean(name="batchDataSource")
//  @Primary
//  @ConfigurationProperties(prefix = "spring.batch.datasource")
//  public DataSource batchDataSource(){
//    return DataSourceBuilder.create().build();
//  }

}
