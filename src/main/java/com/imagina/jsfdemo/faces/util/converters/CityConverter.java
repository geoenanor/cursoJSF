package com.imagina.jsfdemo.faces.util.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.imagina.jsfdemo.bean.dto.CityDTO;

@FacesConverter(value="cityConverter")
public class CityConverter implements Converter<CityDTO>{

	@Override
	public CityDTO getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null) {
			return new CityDTO(value, "España");
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, CityDTO value) {
		if (value != null) {
			return value.getName();
		}
		return null;
	}

}
