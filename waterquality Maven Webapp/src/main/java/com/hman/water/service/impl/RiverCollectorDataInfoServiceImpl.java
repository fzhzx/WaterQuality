package com.hman.water.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hman.water.dao.RiverCollectorDataInfoMapper;
import com.hman.water.model.RiverCollectorDataInfo;
import com.hman.water.service.RiverCollectorDataInfoServiceI;

@Service("riverCollectorDataInfoService")
public class RiverCollectorDataInfoServiceImpl implements
		RiverCollectorDataInfoServiceI {

	public RiverCollectorDataInfoMapper riverCollectorDataInfoMapper;
	
	public RiverCollectorDataInfoMapper getRiverCollectorDataInfoMapper() {
		return riverCollectorDataInfoMapper;
	}

	@Autowired
	public void setRiverCollectorDataInfoMapper(
			RiverCollectorDataInfoMapper riverCollectorDataInfoMapper) {
		this.riverCollectorDataInfoMapper = riverCollectorDataInfoMapper;
	}

	@Override
	public List<RiverCollectorDataInfo> selectCollectorDataOneLate(
			RiverCollectorDataInfo record) {
		// TODO Auto-generated method stub
		return riverCollectorDataInfoMapper.selectCollectorDataOneLate(record);
	}

	@Override
	public List<RiverCollectorDataInfo> selectCollectorDataHistory(RiverCollectorDataInfo record) {
		// TODO Auto-generated method stub
		return riverCollectorDataInfoMapper.selectCollectorDataHistory(record);
	}

	@Override
	public List<RiverCollectorDataInfo> searchCollectorDataByTime(RiverCollectorDataInfo riverCollectorDataInfo) {
		// TODO Auto-generated method stub
		return riverCollectorDataInfoMapper.searchCollectorDataByTime(riverCollectorDataInfo);
	}

}
