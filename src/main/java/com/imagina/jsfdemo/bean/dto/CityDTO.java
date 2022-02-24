package com.imagina.jsfdemo.bean.dto;

import java.io.Serializable;

public class CityDTO implements Serializable{


	private static final long serialVersionUID = -4877300990047883413L;
	
	
	
	public CityDTO(Integer id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	private Integer id;
	private String name;
	private String country;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

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
