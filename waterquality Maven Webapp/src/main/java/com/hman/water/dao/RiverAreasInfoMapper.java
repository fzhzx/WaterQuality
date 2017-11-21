package com.hman.water.dao;

import com.hman.water.model.RiverAreasInfo;

public interface RiverAreasInfoMapper {
    int insert(RiverAreasInfo record);

    int insertSelective(RiverAreasInfo record);
}