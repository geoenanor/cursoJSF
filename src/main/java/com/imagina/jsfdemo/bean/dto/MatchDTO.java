package com.imagina.jsfdemo.bean.dto;

import java.io.Serializable;
import java.util.Date;

public class MatchDTO implements Serializable{


	private static final long serialVersionUID = -4197003936135220607L;
	
	private Integer id;
	private Date date;
	private TeamDTO local;
	private TeamDTO visitor;
	private String result;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public TeamDTO getLocal() {
		return local;
	}
	public void setLocal(TeamDTO local) {
		this.local = local;
	}
	public TeamDTO getVisitor() {
		return visitor;
	}
	public void setVisitor(TeamDTO visitor) {
		this.visitor = visitor;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	


}
