package com.hman.water.dao;

import com.hman.water.model.WaterUser;

public interface WaterUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WaterUser record);

    int insertSelective(WaterUser record);

    WaterUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WaterUser record);

    int updateByPrimaryKey(WaterUser record);
}