package com.hman.service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hman.water.model.RiverAreaPointInfo;
import com.hman.water.service.RiverAreaPointInfoServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestRiverAreaPointInfoService {
	
	public RiverAreaPointInfoServiceI riverAreaPointInfoService;
	
//	public ApplicationContext ac;
//	
//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
//		riverAreaPointInfoService = (RiverAreaPointInfoServiceI) ac.getBean("riverAreaPointInfoService");
//	}
	
	public RiverAreaPointInfoServiceI getRiverAreaPointInfoService() {
		return riverAreaPointInfoService;
	}

	@Autowired
	public void setRiverAreaPointInfoService(
			RiverAreaPointInfoServiceI riverAreaPointInfoService) {
		this.riverAreaPointInfoService = riverAreaPointInfoService;
	}


	@Test
	public void testGetRiverAreaPointInfoById() {
//		org.springframework.http.converter.json.MappingJacksonHttpMessageConverter d = 
//		MappingJackson2HttpMessageConverter
//		RiverAreaPointInfo rapi = riverAreaPointInfoService.getRiverAreaPointInfoById("12345766");
//		System.out.println(JSON.toJSONString(rapi,SerializerFeature.WriteMapNullValue));
//		JSON.toJavaObject(, RiverAreaPointInfo.class);
//		System.out.println("id:" + riverAreaPointInfoService.getRiverAreaPointInfoById("12345766").getcName());
	}
	
	@Test
	public void testGetRapiByAreaid() {
		System.out.println("areaid:" + riverAreaPointInfoService.getRapiByAreaid("330106").getcId());
	}

}
