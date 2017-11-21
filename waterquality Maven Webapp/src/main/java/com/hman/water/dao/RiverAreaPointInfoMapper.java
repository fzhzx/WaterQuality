package com.hman.water.dao;

import java.util.List;

import com.hman.water.model.RiverAreaPointInfo;

public interface RiverAreaPointInfoMapper {
    int deleteByPrimaryKey(Integer apId);

    int insert(RiverAreaPointInfo record);

    int insertSelective(RiverAreaPointInfo record);

    RiverAreaPointInfo selectByPrimaryKey(Integer apId);

    int updateByPrimaryKeySelective(RiverAreaPointInfo record);

    int updateByPrimaryKey(RiverAreaPointInfo record);
    
    List<RiverAreaPointInfo> queryRiverRoleList(String cId);
}