package com.imagina.jsfdemo.bean.dto;

import java.io.Serializable;

public class CityDTO implements Serializable{


	private static final long serialVersionUID = -4877300990047883413L;
	
	
	public CityDTO() {
		super();

	}
	
	public CityDTO(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	
	private String name;
	private String country;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
