package com.christoper.jin.stock.processor;

import com.christoper.jin.stock.entity.Corporation;
import com.christoper.jin.stock.entity.CorporationRaw;
import org.springframework.batch.item.ItemProcessor;

/**
 * @Class CorporationProcessor
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
public class CorporationProcessor implements ItemProcessor<CorporationRaw, Corporation>
{
  @Override
  public Corporation process(CorporationRaw item) throws Exception {
    return new Corporation(item);
  }
}
