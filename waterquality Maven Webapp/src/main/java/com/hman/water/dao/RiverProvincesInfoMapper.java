package com.hman.water.dao;

import com.hman.water.model.RiverProvincesInfo;

public interface RiverProvincesInfoMapper {
    int insert(RiverProvincesInfo record);

    int insertSelective(RiverProvincesInfo record);
}