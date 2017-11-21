package com.hman.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hman.water.model.WaterUser;
import com.hman.water.service.WaterUserServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestMbatis {
	
//	ApplicationContext ac;
	private WaterUserServiceI waterUserService;
//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml", "spring-mybatis.xml"});
//		waterUserService = (WaterUserServiceI) ac.getBean("waterUserService");
//		
//	}
	
	public WaterUserServiceI getWaterUserService() {
		return waterUserService;
	}

	@Autowired
	public void setWaterUserService(WaterUserServiceI waterUserService) {
		this.waterUserService = waterUserService;
	}

	
	@Test
	public void test1() {
		WaterUser waterUser = waterUserService.getUserById("1");
		System.out.println("iii:" + waterUser.getUsername());
		
	}


}
