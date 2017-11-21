package com.hman.water.dao;

import com.hman.water.model.RiverCitiesInfo;

public interface RiverCitiesInfoMapper {
    int insert(RiverCitiesInfo record);

    int insertSelective(RiverCitiesInfo record);
}