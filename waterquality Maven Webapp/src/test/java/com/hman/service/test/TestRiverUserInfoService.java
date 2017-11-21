package com.hman.service.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hman.water.model.RiverUserInfo;
import com.hman.water.service.RiverUserInfoServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestRiverUserInfoService {

	private RiverUserInfoServiceI riverUserInfoService;
	
	public RiverUserInfoServiceI getRiverUserInfoService() {
		return riverUserInfoService;
	}
	
	@Autowired
	public void setRiverUserInfoService(RiverUserInfoServiceI riverUserInfoService) {
		this.riverUserInfoService = riverUserInfoService;
	}



	@Test
	public void testSelectRiverUserInfo() {
		RiverUserInfo riverUserInfo = new RiverUserInfo();
		riverUserInfo.setuName("hzx");
		riverUserInfo.setuTelphone("15958957850");
		List<RiverUserInfo> lists = riverUserInfoService.selectRiverUserInfo(riverUserInfo);
		String json = JSON.toJSONString(lists, SerializerFeature.WriteMapNullValue);
//		System.out.println("u.psw" + riverUserInfo.getuPsd());
		System.out.println(json);
	}
	
	@Test
	public void testSelectRiverPointByUserInfo() {
		RiverUserInfo riverUserInfo = new RiverUserInfo();
//		riverUserInfo.setuName("hzx");
		riverUserInfo.setuTelphone("15958957850");
		riverUserInfo.setuPsd("123456");
		RiverUserInfo lists = riverUserInfoService.selectAreaPointInfoByUserInfo(riverUserInfo);
		String json = JSON.toJSONString(lists, SerializerFeature.WriteMapNullValue);
//		System.out.println("u.psw" + riverUserInfo.getuPsd());
		System.out.println(json);
		
	}
	
	@Test
	public void testSelectUserInfoByLogin() {
		RiverUserInfo riverUserInfo = new RiverUserInfo();
//		riverUserInfo.setuName("hzx");
//		riverUserInfo.setuTelphone("1595895785");
		riverUserInfo.setuPsd("123456");
		riverUserInfo = riverUserInfoService.selectUserInfoByLogin(riverUserInfo);
		if (riverUserInfo == null) {
			System.out.println("用户登录不成功");
		} else {
			String json = JSON.toJSONString(riverUserInfo, SerializerFeature.WriteMapNullValue);
//			System.out.println("u.psw" + riverUserInfo.getuPsd());
			System.out.println(json);
		}
		
	}
	
	/*忘记密码*/
	@Test
	public void testForgetPassword() {
		RiverUserInfo riverUserInfo = new RiverUserInfo();
//		riverUserInfo.setuName("hzx");
		riverUserInfo.setuTelphone("15957158059");
		riverUserInfo.setuPsd("123456123");
//		riverUserInfo.setuId(3);
		int i = riverUserInfoService.updatePasswordByTelphoneOrId(riverUserInfo);
		System.out.println(i);
		
	}
	
}
