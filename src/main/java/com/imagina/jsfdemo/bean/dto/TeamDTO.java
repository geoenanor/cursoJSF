package com.imagina.jsfdemo.bean.dto;

import java.io.Serializable;
import java.util.Objects;

public class TeamDTO implements Serializable{
	
	
	private static final long serialVersionUID = 3777947619692511635L;
	
	private Integer id;
	private String code;
	private String name;
	private String city;
	private String coach;
	private byte[] icon;
	

	

	public TeamDTO() {
		super();
	}

	public TeamDTO(Integer id, String code, String name, String city, String coach) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.city = city;
		this.coach = coach;
	}

	public String isBarcelona() {
		return this.city.equals("BCN") ? "Yes":"no";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public byte[] getIcon() {
		return icon;
	}

	public void setIcon(byte[] icon) {
		this.icon = icon;
	}
	
	

}
