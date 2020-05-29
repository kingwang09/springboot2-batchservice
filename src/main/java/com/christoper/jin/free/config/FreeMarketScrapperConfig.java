package com.christoper.jin.free.config;

import com.christoper.jin.free.repository.FreeArticleRepository;
import com.christoper.jin.free.service.AlarmService;
import com.christoper.jin.free.tasklet.JunggonaraScrapper;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Class FreeMarketScrapperConfig
 * @Description
 * @Author hyungeun.jin
 * @Since 2020. 5. 29.
 * @Version 1.0
 * @COPYRIGHT © WADIZ ALL RIGHTS RESERVED.
 * ------------------------------------------------------------------------
 * Modification Information
 * ------------------------------------------------------------------------
 * 수정일 || 수정자 || 수정내용
 * ------------------------------------------------------------------------
 * 2020. 5. 29. || 진형은 || 최초생성
 */
@Configuration
@EnableBatchProcessing
public class FreeMarketScrapperConfig {
  @Autowired
  private JobBuilderFactory jobBuilderFactory;

  @Autowired
  private StepBuilderFactory stepBuilderFactory;

  @Bean
  Step junggonaraScrarpperStep(){
    return stepBuilderFactory.get("junggonaraScarpperStep")
            .tasklet(junggonaraScrapper(null, null))
            .build();
  }

  @Bean
  Tasklet junggonaraScrapper(AlarmService alarmService, FreeArticleRepository repository){
    return new JunggonaraScrapper(alarmService, repository);
  }

  @Bean
  public Job junggonaraScrapperJob(){
    return jobBuilderFactory.get("junggonaraScrapperJob")
            .start(junggonaraScrarpperStep()).build();
  }
}
