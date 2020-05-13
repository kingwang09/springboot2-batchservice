package com.christoper.jin.config;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @Class BachJobConfiguration
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
@EnableBatchProcessing
public class BachJobConfiguration {

  @Autowired
  private JobBuilderFactory jobBuilderFactory;


}
