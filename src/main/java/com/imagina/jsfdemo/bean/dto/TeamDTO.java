package com.imagina.jsfdemo.bean.dto;

import java.io.Serializable;

public class TeamDTO implements Serializable{
	
	
	private static final long serialVersionUID = 3777947619692511635L;
	
	private Integer id;
	private String code;
	private String name;
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
	
	

}
