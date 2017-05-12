package com.onlineinteract.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class ExtendableBean {
	public String name;
	private Map<String, String> properties;
	
	public ExtendableBean(String name) {
		this.name = name;
		properties = new HashMap<String, String>();
	}

	@JsonAnyGetter
	public Map<String, String> getProperties() {
		return properties;
	}

	public void add(String key, String value) {
		properties.put(key, value);		
	}
}