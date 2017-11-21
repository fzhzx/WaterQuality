package com.hman.water.model;

import java.math.BigDecimal;
import java.util.List;

public class RiverAreaPointInfo {
    private Integer apId;
    
    private Integer typeId;

    private String ip;
    
    private String cId;

    private String cName;

    private String areaid;

    private String functionary;

    private String telphone;

    private String email;
    
    private BigDecimal longitude;// 经度

    private BigDecimal latitude;// 纬度
    
    private List<RiverUserAreaRela> riverUserAreaRelas;

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public List<RiverUserAreaRela> getRiverUserAreaRelas() {
		return riverUserAreaRelas;
	}

	public void setRiverUserAreaRelas(List<RiverUserAreaRela> riverUserAreaRelas) {
		this.riverUserAreaRelas = riverUserAreaRelas;
	}

	public Integer getApId() {
		return apId;
	}

	public void setApId(Integer apId) {
		this.apId = apId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getFunctionary() {
        return functionary;
    }

    public void setFunctionary(String functionary) {
        this.functionary = functionary == null ? null : functionary.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}