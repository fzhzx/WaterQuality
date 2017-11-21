package com.hman.service.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.hman.water.model.RiverCollectorDataInfo;
import com.hman.water.service.RiverCollectorDataInfoServiceI;
import com.sun.mirror.declaration.Declaration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestRiverCollectorDataInfoService {

	private RiverCollectorDataInfoServiceI riverCollectorDataInfoService;

	public RiverCollectorDataInfoServiceI getRiverCollectorDataInfoService() {
		return riverCollectorDataInfoService;
	}

	@Autowired
	public void setRiverCollectorDataInfoService(
			RiverCollectorDataInfoServiceI riverCollectorDataInfoService) {
		this.riverCollectorDataInfoService = riverCollectorDataInfoService;
	}
	
	@Test
	public void selectOneLateData() {
		RiverCollectorDataInfo riverCollectorDataInfo = new RiverCollectorDataInfo();
		riverCollectorDataInfo.setcId("12345678");
//		List<RiverCollectorDataInfo> lists = riverCollectorDataInfoService.selectCollectorDataOneLate(riverCollectorDataInfo);
		List<RiverCollectorDataInfo> lists = riverCollectorDataInfoService.selectCollectorDataHistory(riverCollectorDataInfo);
		
		String json = JSON.toJSONString(lists, SerializerFeature.WriteMapNullValue);
		System.out.println(json);
	}
	
	@Test
	public void selectDataByTime() {
		RiverCollectorDataInfo riverCollectorDataInfo = new RiverCollectorDataInfo();
		riverCollectorDataInfo.setcId("12345678");
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date start, end;
		try {
			start = dateformat.parse("2017-08-29 10:58:26");
			riverCollectorDataInfo.setStartTime(start);
			end = dateformat.parse("2017-08-30 10:58:26");
			riverCollectorDataInfo.setEndTime(end);
			List<RiverCollectorDataInfo> lists = riverCollectorDataInfoService.searchCollectorDataByTime(riverCollectorDataInfo);
			String json = JSON.toJSONString(lists, SerializerFeature.WriteMapNullValue);
			System.out.println(json);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
