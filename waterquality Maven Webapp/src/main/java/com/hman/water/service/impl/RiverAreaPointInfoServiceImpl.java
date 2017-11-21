package com.hman.water.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hman.water.dao.RiverAreaPointInfoMapper;
import com.hman.water.model.RiverAreaPointInfo;
import com.hman.water.service.RiverAreaPointInfoServiceI;

@Service("riverAreaPointInfoService")
public class RiverAreaPointInfoServiceImpl implements
		RiverAreaPointInfoServiceI {
	
	public RiverAreaPointInfoMapper riverAreaPointInfoMapper;
	
	public RiverAreaPointInfoMapper getRiverAreaPointInfoMapper() {
		return riverAreaPointInfoMapper;
	}

	@Autowired
	public void setRiverAreaPointInfoMapper(
			RiverAreaPointInfoMapper riverAreaPointInfoMapper) {
		this.riverAreaPointInfoMapper = riverAreaPointInfoMapper;
	}

	@Override
	public RiverAreaPointInfo getRiverAreaPointInfoById(Integer id) {
		// TODO Auto-generated method stub
		return riverAreaPointInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public RiverAreaPointInfo getRapiByAreaid(String areaid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RiverAreaPointInfo> getRiverAreaPointInfoList(String cId) {
		// TODO Auto-generated method stub
		return riverAreaPointInfoMapper.queryRiverRoleList(cId);
	}


}
