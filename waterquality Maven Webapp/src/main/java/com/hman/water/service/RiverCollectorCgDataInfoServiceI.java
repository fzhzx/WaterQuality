package com.hman.water.service;

import java.util.List;

import com.hman.water.model.RiverCollectorCgDataInfo;

public interface RiverCollectorCgDataInfoServiceI {

	public List<RiverCollectorCgDataInfo> selectLateCollectCgDataByIp(RiverCollectorCgDataInfo record);

	public List<RiverCollectorCgDataInfo> selectCollectorDataHistory(RiverCollectorCgDataInfo record);

	public List<RiverCollectorCgDataInfo> searchCollectorDataByTime(RiverCollectorCgDataInfo record);
}
