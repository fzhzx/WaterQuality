package com.hman.water.model;

import java.util.Date;

public class RiverCollectorCgDataInfo {
    private Integer id;

    private String ip;

    private Double cgValue;

    private Date savetime;

    // 开始 结束时间
    private Date startTime;
    
    // 结束时间
    private Date endTime;
    
    public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Double getCgValue() {
        return cgValue;
    }

    public void setCgValue(Double cgValue) {
        this.cgValue = cgValue;
    }

    public Date getSavetime() {
        return savetime;
    }

    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }
}