package com.hman.water.model;

public class RiverThresholdInfo {
    private String cId;

    private Double tempmax;

    private Double tempmin;

    private Double turbmax;

    private Double turbmin;

    private Double tdsmax;

    private Double tdsmin;

    private Double docmax;

    private Double docmin;

    private Integer chrormax;

    private Integer chrormin;

    private Integer chrogmax;

    private Integer chrogmin;

    private Integer chrobmax;

    private Integer chrobmin;

    private Double phmax;

    private Double phmin;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public Double getTempmax() {
        return tempmax;
    }

    public void setTempmax(Double tempmax) {
        this.tempmax = tempmax;
    }

    public Double getTempmin() {
        return tempmin;
    }

    public void setTempmin(Double tempmin) {
        this.tempmin = tempmin;
    }

    public Double getTurbmax() {
        return turbmax;
    }

    public void setTurbmax(Double turbmax) {
        this.turbmax = turbmax;
    }

    public Double getTurbmin() {
        return turbmin;
    }

    public void setTurbmin(Double turbmin) {
        this.turbmin = turbmin;
    }

    public Double getTdsmax() {
        return tdsmax;
    }

    public void setTdsmax(Double tdsmax) {
        this.tdsmax = tdsmax;
    }

    public Double getTdsmin() {
        return tdsmin;
    }

    public void setTdsmin(Double tdsmin) {
        this.tdsmin = tdsmin;
    }

    public Double getDocmax() {
        return docmax;
    }

    public void setDocmax(Double docmax) {
        this.docmax = docmax;
    }

    public Double getDocmin() {
        return docmin;
    }

    public void setDocmin(Double docmin) {
        this.docmin = docmin;
    }

    public Integer getChrormax() {
        return chrormax;
    }

    public void setChrormax(Integer chrormax) {
        this.chrormax = chrormax;
    }

    public Integer getChrormin() {
        return chrormin;
    }

    public void setChrormin(Integer chrormin) {
        this.chrormin = chrormin;
    }

    public Integer getChrogmax() {
        return chrogmax;
    }

    public void setChrogmax(Integer chrogmax) {
        this.chrogmax = chrogmax;
    }

    public Integer getChrogmin() {
        return chrogmin;
    }

    public void setChrogmin(Integer chrogmin) {
        this.chrogmin = chrogmin;
    }

    public Integer getChrobmax() {
        return chrobmax;
    }

    public void setChrobmax(Integer chrobmax) {
        this.chrobmax = chrobmax;
    }

    public Integer getChrobmin() {
        return chrobmin;
    }

    public void setChrobmin(Integer chrobmin) {
        this.chrobmin = chrobmin;
    }

    public Double getPhmax() {
        return phmax;
    }

    public void setPhmax(Double phmax) {
        this.phmax = phmax;
    }

    public Double getPhmin() {
        return phmin;
    }

    public void setPhmin(Double phmin) {
        this.phmin = phmin;
    }
}