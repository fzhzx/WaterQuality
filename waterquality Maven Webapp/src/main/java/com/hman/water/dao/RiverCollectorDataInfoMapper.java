package com.hman.water.dao;

import java.util.List;

import com.hman.water.model.RiverCollectorDataInfo;

public interface RiverCollectorDataInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiverCollectorDataInfo record);

    int insertSelective(RiverCollectorDataInfo record);

    RiverCollectorDataInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RiverCollectorDataInfo record);

    int updateByPrimaryKey(RiverCollectorDataInfo record);
    
    List<RiverCollectorDataInfo> selectCollectorDataOneLate(RiverCollectorDataInfo record);

	List<RiverCollectorDataInfo> selectCollectorDataHistory(RiverCollectorDataInfo record);
	
	List<RiverCollectorDataInfo> searchCollectorDataByTime(RiverCollectorDataInfo record);
}