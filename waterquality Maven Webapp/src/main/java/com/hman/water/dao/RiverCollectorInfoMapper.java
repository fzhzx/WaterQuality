package com.hman.water.dao;

import com.hman.water.model.RiverCollectorInfo;

public interface RiverCollectorInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiverCollectorInfo record);

    int insertSelective(RiverCollectorInfo record);

    RiverCollectorInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RiverCollectorInfo record);

    int updateByPrimaryKey(RiverCollectorInfo record);
}