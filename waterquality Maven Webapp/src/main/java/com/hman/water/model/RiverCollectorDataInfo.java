package com.hman.water.model;

import java.util.Date;

public class RiverCollectorDataInfo {
    private Integer id;

    private String cId;

    private Double tempvalue;

    private Double turbvalue;

    private Double tdsvalue;

    private Double docvalue;

    private Integer chroR;

    private Integer chroG;

    private Integer chroB;

    private Double phvalue;

    private String gpsLat;

    private String gpsLong;

    private Date savetime;

    private RiverThresholdInfo riverThresholdInfo;
    
    // 开始 结束时间
    private Date startTime;
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

	public RiverThresholdInfo getRiverThresholdInfo() {
		return riverThresholdInfo;
	}

	public void setRiverThresholdInfo(RiverThresholdInfo riverThresholdInfo) {
		this.riverThresholdInfo = riverThresholdInfo;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public Double getTempvalue() {
        return tempvalue;
    }

    public void setTempvalue(Double tempvalue) {
        this.tempvalue = tempvalue;
    }

    public Double getTurbvalue() {
        return turbvalue;
    }

    public void setTurbvalue(Double turbvalue) {
        this.turbvalue = turbvalue;
    }

    public Double getTdsvalue() {
        return tdsvalue;
    }

    public void setTdsvalue(Double tdsvalue) {
        this.tdsvalue = tdsvalue;
    }

    public Double getDocvalue() {
        return docvalue;
    }

    public void setDocvalue(Double docvalue) {
        this.docvalue = docvalue;
    }

    public Integer getChroR() {
        return chroR;
    }

    public void setChroR(Integer chroR) {
        this.chroR = chroR;
    }

    public Integer getChroG() {
        return chroG;
    }

    public void setChroG(Integer chroG) {
        this.chroG = chroG;
    }

    public Integer getChroB() {
        return chroB;
    }

    public void setChroB(Integer chroB) {
        this.chroB = chroB;
    }

    public Double getPhvalue() {
        return phvalue;
    }

    public void setPhvalue(Double phvalue) {
        this.phvalue = phvalue;
    }

    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat == null ? null : gpsLat.trim();
    }

    public String getGpsLong() {
        return gpsLong;
    }

    public void setGpsLong(String gpsLong) {
        this.gpsLong = gpsLong == null ? null : gpsLong.trim();
    }

    public Date getSavetime() {
        return savetime;
    }

    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }
}