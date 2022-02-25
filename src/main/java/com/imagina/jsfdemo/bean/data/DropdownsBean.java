package com.imagina.jsfdemo.bean.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

import com.imagina.jsfdemo.bean.dto.CityDTO;

@Named
@ApplicationScoped
public class DropdownsBean implements Serializable {


	private static final long serialVersionUID = 2767894226114205195L;
	
	private List<CityDTO> cityList;
	
	@PostConstruct
	public void initBean() {
		initDropdowns();
	}
	
	private void initDropdowns() {
		cityList = new ArrayList<CityDTO>();
		cityList.add(new CityDTO("Barcelona", "España"));
		cityList.add(new CityDTO("Madrid", "España"));
		cityList.add(new CityDTO("Sevilla", "España"));		
	}

	public List<CityDTO> getCityList() {
		return cityList;
	}
	
	
}
