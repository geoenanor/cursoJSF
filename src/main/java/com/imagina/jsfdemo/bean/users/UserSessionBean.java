package com.imagina.jsfdemo.bean.users;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class UserSessionBean implements Serializable{


	private static final long serialVersionUID = 7018467133876731878L;
	
	private String userName;
	
	@PostConstruct
	public void initBean() {
		userName = "Oriol";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
