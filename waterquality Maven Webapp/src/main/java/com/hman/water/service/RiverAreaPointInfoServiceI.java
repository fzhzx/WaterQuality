package com.hman.water.service;

import java.util.List;

import com.hman.water.model.RiverAreaPointInfo;

public interface RiverAreaPointInfoServiceI {
	
	public RiverAreaPointInfo getRiverAreaPointInfoById(Integer id);
	
	public RiverAreaPointInfo getRapiByAreaid(String areaid);
	
	public List<RiverAreaPointInfo> getRiverAreaPointInfoList(String cId);

}
