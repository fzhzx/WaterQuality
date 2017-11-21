package com.hman.water.dao;

import com.hman.water.model.RiverInfo;

public interface RiverInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiverInfo record);

    int insertSelective(RiverInfo record);

    RiverInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RiverInfo record);

    int updateByPrimaryKey(RiverInfo record);
}