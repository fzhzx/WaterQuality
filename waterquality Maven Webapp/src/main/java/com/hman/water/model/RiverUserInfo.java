package com.hman.water.model;

import java.util.List;

public class RiverUserInfo {
    private Integer uId;

    private String uName;

    private String uPsd;

    private String uRealName;

    private String uTelphone;

    private String uEmail;
    
    private List<RiverUserAreaRela> riverUserAreaRelaLists;

	public List<RiverUserAreaRela> getRiverUserAreaRelaLists() {
		return riverUserAreaRelaLists;
	}

	public void setRiverUserAreaRelaLists(
			List<RiverUserAreaRela> riverUserAreaRelaLists) {
		this.riverUserAreaRelaLists = riverUserAreaRelaLists;
	}

	public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPsd() {
        return uPsd;
    }

    public void setuPsd(String uPsd) {
        this.uPsd = uPsd == null ? null : uPsd.trim();
    }

    public String getuRealName() {
        return uRealName;
    }

    public void setuRealName(String uRealName) {
        this.uRealName = uRealName == null ? null : uRealName.trim();
    }

    public String getuTelphone() {
        return uTelphone;
    }

    public void setuTelphone(String uTelphone) {
        this.uTelphone = uTelphone == null ? null : uTelphone.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }
}