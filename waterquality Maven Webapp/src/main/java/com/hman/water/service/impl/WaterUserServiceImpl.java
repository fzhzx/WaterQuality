package com.hman.water.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hman.water.dao.WaterUserMapper;
import com.hman.water.model.WaterUser;
import com.hman.water.service.WaterUserServiceI;
@Service("waterUserService")
public class WaterUserServiceImpl implements WaterUserServiceI {

	private WaterUserMapper waterUserMapper;
	
	public WaterUserMapper getWaterUserMapper() {
		return waterUserMapper;
	}
	
	@Autowired
	public void setWaterUserMapper(WaterUserMapper waterUserMapper) {
		this.waterUserMapper = waterUserMapper;
	}


	@Override
	public WaterUser getUserById(String id) {
		// TODO Auto-generated method stub
		return waterUserMapper.selectByPrimaryKey(Integer.valueOf(id));
	}

}
