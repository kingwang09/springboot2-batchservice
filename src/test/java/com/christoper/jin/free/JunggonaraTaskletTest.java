package com.christoper.jin.free;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Class JunggonaraTaskletTest
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
@RunWith(SpringRunner.class)
@SpringBootTest
public class JunggonaraTaskletTest {

  @Test
  public void test() throws Exception {
    JobLauncherTestUtils jobLauncherTestUtils = new JobLauncherTestUtils();
    JobExecution jobExecution = jobLauncherTestUtils.launchJob() ;
  }
}
