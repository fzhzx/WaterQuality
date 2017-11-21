package com.hman.water.controller;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hman.water.dao.BackMessage;
import com.hman.water.model.RiverCollectorCgDataInfo;
import com.hman.water.model.RiverCollectorDataInfo;
import com.hman.water.service.RiverCollectorCgDataInfoServiceI;
import com.hman.water.service.RiverCollectorDataInfoServiceI;
import com.hman.water.util.ResponseUtils;
import com.hman.water.util.TextUtils;

@Controller
@RequestMapping("collector_data")
public class RiverCollectorDataInfoController {

	private BackMessage bMsg;
	private RiverCollectorDataInfoServiceI riverCollectorDataInfoService;
	public RiverCollectorCgDataInfoServiceI riverCollectorCgDataInfoService;
	
	public RiverCollectorDataInfoServiceI getRiverCollectorDataInfoService() {
		return riverCollectorDataInfoService;
	}

	@Autowired
	public void setRiverCollectorDataInfoService(
			RiverCollectorDataInfoServiceI riverCollectorDataInfoService) {
		this.riverCollectorDataInfoService = riverCollectorDataInfoService;
	}

	public RiverCollectorCgDataInfoServiceI getRiverCollectorCgDataInfoService() {
		return riverCollectorCgDataInfoService;
	}

	@Autowired
	public void setRiverCollectorCgDataInfoService(
			RiverCollectorCgDataInfoServiceI riverCollectorCgDataInfoService) {
		this.riverCollectorCgDataInfoService = riverCollectorCgDataInfoService;
	}
	
	/**
	 * 最新一条监测点数据信息
	 * @param cId 编号ID, typeId 1代表水质监测点 2代表水位监测点 ,ip地址
	 * @author Hman
	 * @throws UnsupportedEncodingException 
	 * */
	@RequestMapping("/late_data")
	public void selectCollectDataTheOneLate(String cId, String typeId, String ip, 
			HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		String json;
		response.setContentType("application/json;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		
		if (TextUtils.isEmpty(typeId)) {
			bMsg = new BackMessage(1,"fail","采集点类型不能为空");
		} else {
			//水质监测点
			if (Integer.valueOf(typeId) == 1) {
				if (TextUtils.isEmpty(cId)) {
					bMsg = new BackMessage(1,"fail","无编号错误");
				} else {
					RiverCollectorDataInfo riverCollectorDataInfo = new RiverCollectorDataInfo();
					riverCollectorDataInfo.setcId(cId);
					List<RiverCollectorDataInfo> lists  = riverCollectorDataInfoService.selectCollectorDataOneLate(riverCollectorDataInfo);
					if(lists.size() == 1) {
						bMsg = new BackMessage(0,"success","成功");
						bMsg.setObject(lists);	
					} else {
						bMsg = new BackMessage(1,"fail","无数据");
					}
					
				}
			// 水位监测点
			} else if (Integer.valueOf(typeId) == 2) {
				if(TextUtils.isEmpty(ip)) {
					bMsg = new BackMessage(1,"fail","ip不能为空");
				} else {
					RiverCollectorCgDataInfo record = new RiverCollectorCgDataInfo();
					record.setIp(ip);
					List<RiverCollectorCgDataInfo> recordLists = riverCollectorCgDataInfoService.selectLateCollectCgDataByIp(record);
					if(recordLists.size() == 1) {
						bMsg = new BackMessage(0,"success","成功");
						bMsg.setObject(recordLists);
					} else {
						bMsg = new BackMessage(1,"fail","无数据");
					}
					
				}
			}
		}
		json = JSON.toJSONString(bMsg,  SerializerFeature.WriteMapNullValue);
		System.out.println(json);
		ResponseUtils.renderJson(response,json);
	}
	
	/**
	 * 监测点历史数据
	 * @param cId 编号ID ,typeId 1代表水质监测点 2代表水位监测点 , ip地址
	 * @author Hman
	 * @throws UnsupportedEncodingException 
	 * */
	@RequestMapping("/history_data")
	public void selectCollectDataHistory(String cId, String typeId, String ip, 
			HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		String json;
		response.setContentType("application/json;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		
		if (TextUtils.isEmpty(typeId)) {
			bMsg = new BackMessage(1,"fail","采集点类型不能为空");
		} else {
			//水质监测点
			if (Integer.valueOf(typeId) == 1) {
				if (TextUtils.isEmpty(cId)) {
					bMsg = new BackMessage(1,"fail","无编号错误");
				} else {
					RiverCollectorDataInfo riverCollectorDataInfo = new RiverCollectorDataInfo();
					riverCollectorDataInfo.setcId(cId);
					List<RiverCollectorDataInfo> lists = riverCollectorDataInfoService.selectCollectorDataHistory(riverCollectorDataInfo);
					if (lists.size() > 0) {
						bMsg = new BackMessage(0,"success","成功");
						bMsg.setObject(lists);	
					} else {
						bMsg = new BackMessage(1,"fail","无数据");
					}
					
				}
			}else if (Integer.valueOf(typeId) == 2) {
				if(TextUtils.isEmpty(ip)) {
					bMsg = new BackMessage(1,"fail","ip不能为空");
				} else {
					RiverCollectorCgDataInfo record = new RiverCollectorCgDataInfo();
					record.setIp(ip);
					List<RiverCollectorCgDataInfo> lists = riverCollectorCgDataInfoService.selectCollectorDataHistory(record);
					if (lists.size() > 0) {
						bMsg = new BackMessage(0,"success","成功");
						bMsg.setObject(lists);	
					} else {
						bMsg = new BackMessage(1,"fail","无数据");
					}
				}
			}
		}
		json = JSON.toJSONString(bMsg,  SerializerFeature.WriteMapNullValue);
		System.out.println(json);
		ResponseUtils.renderJson(response,json);
	}
	
	/**
	 * 按时间搜索监测点数据
	 * @param cId 编号ID, endTime 结束时间, startTime 开始时间,typeId 1代表水质监测点 2代表水位监测点 , ip地址
	 * @author Hman
	 * @throws UnsupportedEncodingException 
	 * */
	@RequestMapping("/search_data")
	public void selectCollectDataByTime(String cId, String typeId, String ip, String startTime, String endTime, 
			HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		String json;
		response.setContentType("application/json;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 2017-08-30 10:58:26
		if (TextUtils.isEmpty(typeId)) {
			bMsg = new BackMessage(1,"fail","采集点类型不能为空");
		} else {
			//水质监测点
			if (Integer.valueOf(typeId) == 1) {
				if (TextUtils.isEmpty(cId)) {
					bMsg = new BackMessage(1,"fail","无编号错误");
				} else {
					RiverCollectorDataInfo riverCollectorDataInfo = new RiverCollectorDataInfo();
					riverCollectorDataInfo.setcId(cId);
					Date start, end;
					try {
						start = dateformat.parse(startTime);
						riverCollectorDataInfo.setStartTime(start);
						end = dateformat.parse(endTime);
						riverCollectorDataInfo.setEndTime(end);
						List<RiverCollectorDataInfo> lists = riverCollectorDataInfoService.searchCollectorDataByTime(riverCollectorDataInfo);
						if(lists.size() > 0) {
							bMsg = new BackMessage(0,"success","成功");
							bMsg.setObject(lists);
						} else {
							bMsg = new BackMessage(1,"fail","无数据");
						}
						
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} else if (Integer.valueOf(typeId) == 2) {
				RiverCollectorCgDataInfo record = new RiverCollectorCgDataInfo();
				record.setIp(ip);
				Date start, end;
				try {
					start = dateformat.parse(startTime);
					record.setStartTime(start);
					end = dateformat.parse(endTime);
					record.setEndTime(end);
					List<RiverCollectorCgDataInfo> lists = riverCollectorCgDataInfoService.searchCollectorDataByTime(record);
					if(lists.size() > 0) {
						bMsg = new BackMessage(0,"success","成功");
						bMsg.setObject(lists);
					} else {
						bMsg = new BackMessage(1,"fail","无数据");
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		json = JSON.toJSONString(bMsg,  SerializerFeature.WriteMapNullValue);
		System.out.println(json);
		ResponseUtils.renderJson(response,json);
	}
	
	/**
	 * 按cId和字段获取历史数据
	 * */
}
