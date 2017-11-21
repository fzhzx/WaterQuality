package com.hman.water.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hman.water.dao.BackMessage;
import com.hman.water.model.RiverUserInfo;
import com.hman.water.service.RiverUserInfoServiceI;
import com.hman.water.util.ClassPathResource;
import com.hman.water.util.ResponseUtils;
import com.hman.water.util.TextUtils;

@Controller
@RequestMapping("userInfo")
public class RiverUserInfoController {

	private BackMessage bMsg;
	private RiverUserInfoServiceI riverUserInfoService;
	
	public RiverUserInfoServiceI getRiverUserInfoService() {
		return riverUserInfoService;
	}
	
	@Autowired
	public void setRiverUserInfoService(RiverUserInfoServiceI riverUserInfoService) {
		this.riverUserInfoService = riverUserInfoService;
	}
	
	/**
	 * 用户登录
	 * @param uName:登录名; uPsd:登录密码
	 * @author Hman
	 * @throws UnsupportedEncodingException 
	 * */
	@RequestMapping("/login")
	public void login(String uName, String uPsd, String uTelphone, 
			HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		RiverUserInfo userInfo = new RiverUserInfo();
		String json;
		response.setContentType("application/json;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		if (!TextUtils.isEmpty(uName)) {
			userInfo.setuName(uName);			
		}
		if (!TextUtils.isEmpty(uTelphone)) {
			userInfo.setuTelphone(uTelphone);
		}
		userInfo.setuPsd(uPsd);
		
		userInfo = riverUserInfoService.selectUserInfoByLogin(userInfo);
		if (userInfo == null) {
			bMsg = new BackMessage(1,"fail","用户或密码错误");
		} else {
			RiverUserInfo lists = riverUserInfoService.selectAreaPointInfoByUserInfo(userInfo);
			if (lists != null) {
				bMsg = new BackMessage(0,"success","成功");
				bMsg.setObject(lists);
			} else {
				bMsg = new BackMessage(0,"success","no_data");
				bMsg.setObject(userInfo);
			}
		}
		json = JSON.toJSONString(bMsg,  SerializerFeature.WriteMapNullValue);
		System.out.println("login_json:" + json);
		ResponseUtils.renderJson(response,json);
	}
	
	/**
	 * 用户注册
	 * @param uName:登录名;  uPsd:登录密码; rePsd:确定密码
	 * @author Hman
	 * @throws UnsupportedEncodingException 
	 * */
	@RequestMapping("/register")
	public void register(String uName, String uPsd, String rePsd, String uTelphone, 
			HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		String json;
		request.setCharacterEncoding("UTF-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");//通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
         
		if(!ClassPathResource.isPhoneLegal(uTelphone)) {
			bMsg = new BackMessage(1,"fail","电话格式不对");
		} else if(TextUtils.isEmpty(uTelphone) || TextUtils.isEmpty(uPsd) || TextUtils.isEmpty(rePsd)) {
			bMsg = new BackMessage(1,"fail","电话或密码不能为空");
		} else if (!uPsd.equals(rePsd)) {
			bMsg = new BackMessage(1,"fail","密码输入不一致");
		} else {
			RiverUserInfo userInfo = new RiverUserInfo();
			if (TextUtils.isEmpty(uName)) {
				userInfo.setuName(uTelphone);
			} else {
				userInfo.setuName(uName);
			}
			
			userInfo.setuPsd(uPsd);
			if (ClassPathResource.isPhoneLegal(uTelphone)) {
				userInfo.setuTelphone(uTelphone);
			}
			if (riverUserInfoService.selectRiverUserInfo(userInfo).size() <= 0) {
				int i = riverUserInfoService.registRiverUserInfo(userInfo);
				bMsg = new BackMessage(0,"success","成功");
			} else {
				bMsg = new BackMessage(1,"fail","该用户已存在");
			}
			
		}
		json = JSON.toJSONString(bMsg,  SerializerFeature.WriteMapNullValue);
		ResponseUtils.renderJson(response,json);
//		return "user/register";
	}
	
	/**
	 * 根据用户名或者电话号码获取用户信息
	 * @throws UnsupportedEncodingException 
	 * */
	@RequestMapping("/select_user")
	public void selectRiverUserInfoController(String uName,String uTelphone, 
			HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		String json;
		request.setCharacterEncoding("UTF-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");//通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
        
		RiverUserInfo userInfo = new RiverUserInfo();
		List<RiverUserInfo> lists = new ArrayList<RiverUserInfo>();
		if(!TextUtils.isEmpty(uName)){
			userInfo.setuName(uName);			
		}
		if(!TextUtils.isEmpty(uTelphone)){
			if (ClassPathResource.isPhoneLegal(uTelphone)) {
				userInfo.setuTelphone(uTelphone);
			} else {
				bMsg = new BackMessage(1,"fail","电话号码格式正确");
				json = JSON.toJSONString(bMsg,  SerializerFeature.WriteMapNullValue);
				ResponseUtils.renderJson(response,json);
			}
		}
		
		lists = riverUserInfoService.selectRiverUserInfo(userInfo);
		
		if (lists.size() <= 0) {
			bMsg = new BackMessage(1,"fail","用户不存在");
		} else {
			bMsg = new BackMessage(0,"success","成功");
			bMsg.setObject(lists);
		}
		json = JSON.toJSONString(bMsg, SerializerFeature.WriteMapNullValue);
		System.out.println(json);
		ResponseUtils.renderJson(response,json);
	}
	
	/**
	 * 忘记密码
	 * @param uTelphone, rePsd, rPsd
	 * @author Hman
	 * @throws UnsupportedEncodingException 
	 * */
	@RequestMapping("/forget_password")
	public void forgetPasswrod(String uTelphone,String uPsd, String rePsd, 
			HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		String json;
		request.setCharacterEncoding("UTF-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");//通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
        
		if (TextUtils.isEmpty(uTelphone) || TextUtils.isEmpty(uPsd) || TextUtils.isEmpty(rePsd)) {
			bMsg = new BackMessage(1,"fail","电话或密码不能为空");
		} else if (!ClassPathResource.isPhoneLegal(uTelphone)) {
			bMsg = new BackMessage(1,"fail","电话格式不正确");
		} else if (!uPsd.equals(rePsd)) {
			bMsg = new BackMessage(1,"fail","密码不一致");
		} else {
			RiverUserInfo userInfo = new RiverUserInfo();
			userInfo.setuTelphone(uTelphone);
			userInfo.setuPsd(uPsd);
			int up = riverUserInfoService.updatePasswordByTelphoneOrId(userInfo);
			if (up > 0) {
				bMsg = new BackMessage(0,"success","修改成功");
			} else {
				List<RiverUserInfo> lists = riverUserInfoService.selectRiverUserInfo(userInfo);
				
				if (lists.size() <= 0) {
					bMsg = new BackMessage(1,"fail","用户不存在");
				} else {
					bMsg = new BackMessage(1,"fail","修改失败");
				}
			}
		}
		json = JSON.toJSONString(bMsg,  SerializerFeature.WriteMapNullValue);
		request.setAttribute("forget_json", json);
		ResponseUtils.renderJson(response,json);
	}
	
	/**
	 * 修改密码
	 * @param rePsd, rPsd, id, oldPsd
	 * @author Hman
	 * @throws IOException 
	 * */
	@RequestMapping("/modify_password")
	public void modifyPassword(int uid,String oldPsd,String uPsd, String rePsd, 
			HttpServletRequest request,HttpServletResponse response) throws IOException{
		String json;
		request.setCharacterEncoding("UTF-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");//通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
              
		if (TextUtils.isEmpty(uPsd) || TextUtils.isEmpty(rePsd) || TextUtils.isEmpty(oldPsd)) {
			bMsg = new BackMessage(1,"fail","密码不能为空");
		} else if (!uPsd.equals(rePsd)) {
			bMsg = new BackMessage(1,"fail","密码不一致");
		} else {
			RiverUserInfo userInfo = new RiverUserInfo();
			userInfo.setuId(uid);
			if (riverUserInfoService.selectRiverUserInfoById(userInfo).getuPsd().equals(oldPsd)) {
				userInfo.setuPsd(uPsd);
				int up = riverUserInfoService.updatePasswordByTelphoneOrId(userInfo);
				if (up > 0) {
					bMsg = new BackMessage(0,"success","修改成功");
				} else {
					bMsg = new BackMessage(1,"fail","修改失败");
				}
			} else {
				bMsg = new BackMessage(1,"fail","旧密码错误");
			}
			
		}
		json = JSON.toJSONString(bMsg,  SerializerFeature.WriteMapNullValue);
		ResponseUtils.renderJson(response,json);
	}
	
}
