package com.christoper.jin.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Class JpaConfig
 * @Description
 * @Author hyungeun.jin
 * @Since 2020. 5. 14.
 * @Version 1.0
 * @COPYRIGHT © WADIZ ALL RIGHTS RESERVED.
 * ------------------------------------------------------------------------
 * Modification Information
 * ------------------------------------------------------------------------
 * 수정일 || 수정자 || 수정내용
 * ------------------------------------------------------------------------
 * 2020. 5. 14. || 진형은 || 최초생성
 */
//@Slf4j
//@Configuration
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "entityManagerFactory",
//        transactionManagerRef = "transactionManager",
//        basePackages = {
//                "com.christoper.jin.*.repository"
//        }
//)
//@EnableJpaAuditing
//@EnableTransactionManagement
public class JpaConfig {
  /**
   * JPA Setting
   */
//  @Primary
//  @Bean
//  public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//          EntityManagerFactoryBuilder builder, DataSource dataSource){
//    return builder.dataSource(dataSource)
//            .packages("com.christoper.jin.*.entity")
//            .build();
//  }
//
//
//
//  @Primary
//  @Bean
//  public PlatformTransactionManager transactionManager(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
//    return new JpaTransactionManager(entityManagerFactory.getObject());
//  }
}
