package com.hman.water.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hman.water.dao.RiverCollectorCgDataInfoMapper;
import com.hman.water.model.RiverCollectorCgDataInfo;
import com.hman.water.service.RiverCollectorCgDataInfoServiceI;

@Service("riverCollectorCgDataInfoService")
public class RiverCollectorCgDataInfoServiceImpl implements
		RiverCollectorCgDataInfoServiceI {
	
	public RiverCollectorCgDataInfoMapper riverCollectorCgDataInfoMapper;

	public RiverCollectorCgDataInfoMapper getRiverCollectorCgDataInfoMapper() {
		return riverCollectorCgDataInfoMapper;
	}
	
	@Autowired
	public void setRiverCollectorCgDataInfoMapper(
			RiverCollectorCgDataInfoMapper riverCollectorCgDataInfoMapper) {
		this.riverCollectorCgDataInfoMapper = riverCollectorCgDataInfoMapper;
	}

	@Override
	public List<RiverCollectorCgDataInfo> selectLateCollectCgDataByIp(
			RiverCollectorCgDataInfo record) {
		// TODO Auto-generated method stub
		return riverCollectorCgDataInfoMapper.selectLateCollectCgDataByIp(record);
	}

	@Override
	public List<RiverCollectorCgDataInfo> selectCollectorDataHistory(
			RiverCollectorCgDataInfo record) {
		// TODO Auto-generated method stub
		return riverCollectorCgDataInfoMapper.selectCollectorDataHistoryByIp(record);
	}

	@Override
	public List<RiverCollectorCgDataInfo> searchCollectorDataByTime(
			RiverCollectorCgDataInfo record) {
		// TODO Auto-generated method stub
		return riverCollectorCgDataInfoMapper.selectRearchCollectorDataByTime(record);
	}

}
