package com.hman.water.dao;

public class BackMessage {
	
	private int code; // 0:无异常; 1:代表有错误
	private String message; // success fail
	private String content;
	private Object object;
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public BackMessage(){}
	
	public BackMessage(int code, String message, String content) {
		super();
		this.code = code;
		this.message = message;
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	} 

}
