package com.christoper.jin.stock.entity;

import com.christoper.jin.stock.constant.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

/**
 * @Class Corporation
 * @Description
 * @Author hyungeun.jin
 * @Since 2020. 4. 19.
 * @Version 1.0
 * @COPYRIGHT © WADIZ ALL RIGHTS RESERVED.
 * ------------------------------------------------------------------------
 * Modification Information
 * ------------------------------------------------------------------------
 * 수정일 || 수정자 || 수정내용
 * ------------------------------------------------------------------------
 * 2020. 4. 19. || 진형은 || 최초생성
 */
@Setter
@Getter
@NoArgsConstructor
public class CorporationRaw {
  private String corporationCode;
  private String name;
  private String nameByTrade;
  private String nameByEnglish;

  private String type;//유형

  private String scale;//규모

  private String graduatedDate;

  private String shape;//형태코드

  private String establishedShape;//설립형태

  private String status;

  private String statusChangedDate;//상태변경일자

  private String governmentDivision;//공공기관구분

  private String isVentureYn;

  private String industryCodeBy10;//업종코드(표준산업분류 10차)
  private String industryCodeBy9;//업종코드(표준산업분류 9차)

  private String financeIndustry;//재무코드

  private String groupCode;
  private String groupName;
  private String businessRegNumber;//사업자등록번호
  private String corporationRegNumber;//법인번호

  private String establishDate;//설립일

  private String openCode;//공개코드

  private String tradeRegNumber;//무역업신고번호

  private String listingDate;//상장 일자
  private String deListingDate;//상장폐지 일자

  private String majorBankCode;
  private String majorBankName;
  private String bankCode;
  private String bankName;
  private String settlementDate;//결산기준(월일)

  private String homepageUrl;
  private String email;

  private String reportDate;

  private String postCode;
  private String location;
  private String locationDetail;

  private String phoneNumber;
  private String faxNumber;

  private Integer workforce;

  private String productName;

  private String referenceCorporationCode;
  private String referenceCorporationEstablishDate;

  private String temp1;
  private String tempPostCode;
  private String tempLocation;
  private String tempLocationDetail;
  private String tempCheck;
  private String tempCheck2;

}
