package com.christoper.jin.stock.config;

import com.christoper.jin.stock.entity.Corporation;
import com.christoper.jin.stock.entity.CorporationRaw;
import com.christoper.jin.stock.processor.CorporationProcessor;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import java.io.File;

/**
 * @Class StockStepConfiguration
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
@Configuration
@EnableBatchProcessing
public class StockStepConfiguration {
  @Autowired
  public StepBuilderFactory stepBuilderFactory;

  @Value("${christoper.base.path}")
  private String basePath;

  @Bean
  public FlatFileItemReader<CorporationRaw> corporationFileReader(){
    return new FlatFileItemReaderBuilder<CorporationRaw>()
            .name("corporationFileReader")
            .resource(new FileSystemResource(basePath + File.separator + "KED5002.txt"))
            .strict(false)
            .encoding("EUC-KR")
            .delimited()
            .delimiter("|")
            .quoteCharacter('╊')
            .names(new String[]{
                    "corporationCode",
                    "name",
                    "nameByTrade",
                    "nameByEnglish",
                    "type",
                    "scale",
                    "graduatedDate",
                    "shape",
                    "establishedShape",
                    "status",
                    "statusChangedDate",
                    "governmentDivision",
                    "isVentureYn",
                    "temp1",
                    "industryCodeBy10",
                    "financeIndustry",
                    "groupCode",
                    "groupName",
                    "businessRegNumber",
                    "establishDate",
                    "openCode",
                    "tradeRegNumber",
                    "listingDate",
                    "deListingDate",
                    "majorBankCode",
                    "majorBankName",
                    "bankCode",
                    "bankName",
                    "settlementDate",
                    "homepageUrl",
                    "email",
                    "reportDate",
                    "corporationRegNumber",
                    "postCode",
                    "location",
                    "locationDetail",
                    "phoneNumber",
                    "faxNumber",
                    "workforce",
                    "productName",
                    "industryCodeBy9",
                    "referenceCorporationCode",
                    "referenceCorporationEstablishDate",
                    "tempPostCode",
                    "tempLocation",
                    "tempLocationDetail",
                    "tempCheck",
                    "tempCheck2"
            })
            .fieldSetMapper(new BeanWrapperFieldSetMapper<CorporationRaw>(){
              {setTargetType(CorporationRaw.class);}
            })
            .build();
  }

  @Bean
  public CorporationProcessor corporationProcessor(){
    return new CorporationProcessor();
  }

  @Bean
  public FlatFileItemWriter<Corporation> corporationFileWriter(){
    return new FlatFileItemWriterBuilder<Corporation>()
            .name("corporationFileWriter")
            //.resource(new ClassPathResource("KED5002.csv"))
            .resource(new FileSystemResource(basePath + File.separator + "result.csv"))
            .encoding("EUC-KR")
            .delimited()
            .delimiter("|")
            .names(new String[]{
                    "corporationCode",
                    "name",
                    "nameByTrade",
                    "nameByEnglish",
                    "type",
                    "scale",
                    "graduatedDate",
                    "shape",
                    "establishedShape",
                    "status",
                    "statusChangedDate",
                    "governmentDivision",
                    "isVenture",
                    "industryCodeBy10",
                    "financeIndustry",
                    "groupCode",
                    "groupName",
                    "businessRegNumber",
                    "establishDate",
                    "openCode",
                    "tradeRegNumber",
                    "listingDate",
                    "deListingDate",
                    "majorBankCode",
                    "majorBankName",
                    "bankCode",
                    "bankName",
                    "settlementDate",
                    "homepageUrl",
                    "email",
                    "reportDate",
                    "corporationRegNumber",
                    "postCode",
                    "location",
                    "locationDetail",
                    "phoneNumber",
                    "faxNumber",
                    "workforce",
                    "productName",
                    "industryCodeBy9",
                    "referenceCorporationCode",
                    "referenceCorporationEstablishDate"
            })
            .build();
  }
}
