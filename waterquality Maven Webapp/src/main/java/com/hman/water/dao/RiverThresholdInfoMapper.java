package com.hman.water.dao;

import com.hman.water.model.RiverThresholdInfo;

public interface RiverThresholdInfoMapper {
    int deleteByPrimaryKey(String cId);

    int insert(RiverThresholdInfo record);

    int insertSelective(RiverThresholdInfo record);

    RiverThresholdInfo selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(RiverThresholdInfo record);

    int updateByPrimaryKey(RiverThresholdInfo record);
}