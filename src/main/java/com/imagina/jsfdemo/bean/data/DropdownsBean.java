package com.imagina.jsfdemo.bean.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named
@ApplicationScoped
public class DropdownsBean implements Serializable {


	private static final long serialVersionUID = 2767894226114205195L;
	
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
