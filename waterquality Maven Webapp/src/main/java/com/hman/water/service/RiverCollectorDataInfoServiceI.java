package com.hman.water.service;

import java.util.List;

import com.hman.water.model.RiverCollectorDataInfo;

public interface RiverCollectorDataInfoServiceI {

	public List<RiverCollectorDataInfo> selectCollectorDataOneLate(RiverCollectorDataInfo record);

	public List<RiverCollectorDataInfo> selectCollectorDataHistory(RiverCollectorDataInfo riverCollectorDataInfo);

	public List<RiverCollectorDataInfo> searchCollectorDataByTime(RiverCollectorDataInfo riverCollectorDataInfo);

}
