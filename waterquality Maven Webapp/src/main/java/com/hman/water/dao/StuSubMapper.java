package com.hman.water.dao;

import com.hman.water.model.StuSub;

public interface StuSubMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StuSub record);

    int insertSelective(StuSub record);

    StuSub selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StuSub record);

    int updateByPrimaryKey(StuSub record);
}