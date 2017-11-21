package com.hman.water.service;

import java.util.List;

import com.hman.water.model.RiverUserInfo;

public interface RiverUserInfoServiceI {
	
	// 查询用户
	public List<RiverUserInfo> selectRiverUserInfo(RiverUserInfo riverUserInfo);

	public int registRiverUserInfo(RiverUserInfo userInfo);
	
	// 用户登录返回检测点
	public RiverUserInfo selectAreaPointInfoByUserInfo(RiverUserInfo riverUserInfo);

	public RiverUserInfo selectUserInfoByLogin(RiverUserInfo userInfo);

	public int updatePasswordByTelphoneOrId(RiverUserInfo userInfo);
	
	public RiverUserInfo selectRiverUserInfoById(RiverUserInfo userInfo);

}
