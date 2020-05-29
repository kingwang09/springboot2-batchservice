package com.christoper.jin.free.tasklet;

import com.christoper.jin.free.constant.FreeArticleType;
import com.christoper.jin.free.entity.FreeArticle;
import com.christoper.jin.free.repository.FreeArticleRepository;
import com.christoper.jin.free.service.AlarmService;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * @Class JunggonaraScrapper
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
@RequiredArgsConstructor
public class JunggonaraScrapper implements Tasklet {

  private final AlarmService alarmService;
  private final FreeArticleRepository repository;
  @Override
  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
    FreeArticleType junngonara = FreeArticleType.JUNNGONARA;

    Document document = Jsoup.connect(junngonara.getMainURL()).get();
    Element targetElement = document.getElementById(junngonara.getTargetElement());
    Element articleDiv = targetElement.nextElementSibling();

    Elements articleList = articleDiv.select("a.article");
    for(Element article : articleList){
      FreeArticle freeArticle = FreeArticle.builder()
              .type(junngonara)
              .title(article.ownText())
              .articleUrl(article.attr("href"))
              .build();
      boolean isExist = repository.existsById(freeArticle.getArticleUrl());
      if(!isExist){
        repository.save(freeArticle);
        alarmService.send(freeArticle);
      }
    }
    return RepeatStatus.FINISHED;
  }
}
