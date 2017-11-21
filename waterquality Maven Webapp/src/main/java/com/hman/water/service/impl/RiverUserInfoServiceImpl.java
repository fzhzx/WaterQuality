package com.hman.water.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hman.water.dao.RiverUserInfoMapper;
import com.hman.water.model.RiverUserInfo;
import com.hman.water.service.RiverUserInfoServiceI;

@Service("riverUserInfoService")
public class RiverUserInfoServiceImpl implements RiverUserInfoServiceI {
	
	private RiverUserInfoMapper riverUserInfoMapper;

	public RiverUserInfoMapper getRiverUserInfoMapper() {
		return riverUserInfoMapper;
	}

	@Autowired
	public void setRiverUserInfoMapper(RiverUserInfoMapper riverUserInfoMapper) {
		this.riverUserInfoMapper = riverUserInfoMapper;
	}



	@Override
	public List<RiverUserInfo> selectRiverUserInfo(RiverUserInfo riverUserInfo) {
		// TODO Auto-generated method stub
		return riverUserInfoMapper.selectRiverUserInfo(riverUserInfo);
	}

	@Override
	public int registRiverUserInfo(RiverUserInfo userInfo) {
		// TODO Auto-generated method stub
		return riverUserInfoMapper.insert(userInfo);
	}

	@Override
	public RiverUserInfo selectAreaPointInfoByUserInfo(
			RiverUserInfo riverUserInfo) {
		// TODO Auto-generated method stub
		return riverUserInfoMapper.selectAreaPointInfoByUserInfo(riverUserInfo);
	}

	@Override
	public RiverUserInfo selectUserInfoByLogin(RiverUserInfo userInfo) {
		// TODO Auto-generated method stub
		return riverUserInfoMapper.selectUserInfoByLogin(userInfo);
	}

	@Override
	public int updatePasswordByTelphoneOrId(RiverUserInfo userInfo) {
		// TODO Auto-generated method stub
		return riverUserInfoMapper.updatePasswordByTelphoneOrId(userInfo);
	}

	@Override
	public RiverUserInfo selectRiverUserInfoById(RiverUserInfo userInfo) {
		// TODO Auto-generated method stub
		return riverUserInfoMapper.selectRiverUserInfoById(userInfo);
	}

}
