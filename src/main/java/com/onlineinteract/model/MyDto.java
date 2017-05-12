package com.onlineinteract.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

// @JsonIgnoreProperties(value = { "intValue" })
public class MyDto {
	private String stringValue;
	@JsonIgnore
	private int intValue;
	private boolean booleanValue;

	public MyDto() {
		super();
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public boolean isBooleanValue() {
		return booleanValue;
	}

	public void setBooleanValue(boolean booleanValue) {
		this.booleanValue = booleanValue;
	}

}