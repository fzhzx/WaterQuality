package com.hman.water.model;

public class RiverUserAreaRela {
    private Integer id;

    private Integer uid;

    private Integer apId;
    
    private RiverAreaPointInfo riverAreaPointInfo;

    public RiverAreaPointInfo getRiverAreaPointInfo() {
		return riverAreaPointInfo;
	}

	public void setRiverAreaPointInfo(RiverAreaPointInfo riverAreaPointInfo) {
		this.riverAreaPointInfo = riverAreaPointInfo;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

	public Integer getApId() {
		return apId;
	}

	public void setApId(Integer apId) {
		this.apId = apId;
	}
}