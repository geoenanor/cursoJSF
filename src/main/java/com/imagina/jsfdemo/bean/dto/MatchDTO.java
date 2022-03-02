package com.imagina.jsfdemo.bean.dto;

import java.io.Serializable;
import java.util.Date;

public class MatchDTO implements Serializable{


	private static final long serialVersionUID = -4197003936135220607L;
	
	private Integer id;
	private Date date;
	private String local;
	private String visitor;
	private String result;
	
	
	
	public MatchDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MatchDTO(Integer id, Date date, String local, String visitor, String result) {
		super();
		this.id = id;
		this.date = date;
		this.local = local;
		this.visitor = visitor;
		this.result = result;
	}
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
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getVisitor() {
		return visitor;
	}
	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	


}
