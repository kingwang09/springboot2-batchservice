package com.chistoper.jin.free;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

/**
 * @Class FreeScraperTest
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

public class FreeScraperTest {
  public static void main(String[] args) throws IOException {
    //Document document = Jsoup.connect("https://cafe.naver.com/joonggonara?iframe_url=/ArticleList.nhn%3Fsearch.clubid=10050146%26search.menuid=96%26search.boardtype=L%26search.totalCount=151%26search.page=1").get();
    Document document = Jsoup.connect("https://cafe.naver.com/ArticleList.nhn?search.clubid=10050146&search.menuid=96&search.boardtype=L&search.totalCount=151&search.page=1").get();


    //System.out.println(document);
    Element targetElement = document.getElementById("upperArticleList");
    Element articleDiv = targetElement.nextElementSibling();

    Elements articleList = articleDiv.select("a.article");
    for(Element article : articleList){
      System.out.println(article.ownText()+", "+article.attr("href"));

    }

  }
}
