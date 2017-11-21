package com.hman.water.dao;

import java.util.List;

import com.hman.water.model.RiverCollectorCgDataInfo;

public interface RiverCollectorCgDataInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiverCollectorCgDataInfo record);

    int insertSelective(RiverCollectorCgDataInfo record);

    RiverCollectorCgDataInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RiverCollectorCgDataInfo record);

    int updateByPrimaryKey(RiverCollectorCgDataInfo record);
    
    List<RiverCollectorCgDataInfo> selectLateCollectCgDataByIp(RiverCollectorCgDataInfo record);

	List<RiverCollectorCgDataInfo> selectCollectorDataHistoryByIp(RiverCollectorCgDataInfo record);

	List<RiverCollectorCgDataInfo> selectRearchCollectorDataByTime(RiverCollectorCgDataInfo record);
}