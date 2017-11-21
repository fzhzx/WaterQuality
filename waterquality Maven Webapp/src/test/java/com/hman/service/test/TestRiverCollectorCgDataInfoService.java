package com.hman.service.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hman.water.model.RiverCollectorCgDataInfo;
import com.hman.water.service.RiverCollectorCgDataInfoServiceI;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestRiverCollectorCgDataInfoService {


	public RiverCollectorCgDataInfoServiceI riverCollectorCgDataInfoService;

	public RiverCollectorCgDataInfoServiceI getRiverCollectorCgDataInfoService() {
		return riverCollectorCgDataInfoService;
	}

	@Autowired
	public void setRiverCollectorCgDataInfoService(
			RiverCollectorCgDataInfoServiceI riverCollectorCgDataInfoService) {
		this.riverCollectorCgDataInfoService = riverCollectorCgDataInfoService;
	}
	
	@Test
	public void testLateData() {
		RiverCollectorCgDataInfo record = new RiverCollectorCgDataInfo();
		record.setIp("192.168.0.7");
//		record.setId("12345678");
		List<RiverCollectorCgDataInfo> lists = riverCollectorCgDataInfoService.selectLateCollectCgDataByIp(record);
		System.out.println(JSON.toJSONString(lists, SerializerFeature.WriteMapNullValue));
	}
}
