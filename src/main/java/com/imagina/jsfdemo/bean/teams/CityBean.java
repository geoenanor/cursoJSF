package com.imagina.jsfdemo.bean.teams;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

import com.imagina.jsfdemo.bean.dto.TeamDTO;

@Named
@ApplicationScoped
public class CityBean {

	private List<SelectItem> cityList;
	
	@PostConstruct
	public void initBean() {
		initDropdowns();
	}
	
	
	private void initDropdowns() {
		cityList = new ArrayList<SelectItem>();
		cityList.add(new SelectItem("Barcelona", "Barcelona"));
		cityList.add(new SelectItem("Madrid", "Madrid"));
		cityList.add(new SelectItem("Sev", "Sevilla"));
	}


	public List<SelectItem> getCityList() {
		return cityList;
	}
	
}
