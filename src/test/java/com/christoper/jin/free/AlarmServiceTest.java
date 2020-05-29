package com.christoper.jin.free;

import com.christoper.jin.free.entity.FreeArticle;
import com.christoper.jin.free.service.AlarmService;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jettison.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Class AlarmServiceTest
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
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlarmServiceTest {
  @Autowired
  private AlarmService alarmService;

  @Test
  public void test() throws JSONException {
    alarmService.send(FreeArticle.builder().articleUrl("http://naver.com").title("테스트").build());
  }
}
