package com.hman.water.dao;

import java.util.List;

import com.hman.water.model.RiverUserInfo;

public interface RiverUserInfoMapper {
    int insert(RiverUserInfo record);

    int insertSelective(RiverUserInfo record);
    
    List<RiverUserInfo> selectRiverUserInfo(RiverUserInfo riverUserInfo);

	int registRiverUserInfo(RiverUserInfo userInfo);
	
	RiverUserInfo selectAreaPointInfoByUserInfo(RiverUserInfo riverUserInfo);

	RiverUserInfo selectUserInfoByLogin(RiverUserInfo userInfo);

	int updatePasswordByTelphoneOrId(RiverUserInfo userInfo);
	
	RiverUserInfo selectRiverUserInfoById(RiverUserInfo userInfo);
}