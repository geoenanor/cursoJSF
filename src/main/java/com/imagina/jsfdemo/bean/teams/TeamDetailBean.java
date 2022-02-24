package com.imagina.jsfdemo.bean.teams;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.imagina.jsfdemo.bean.dto.TeamDTO;

@Named
@RequestScoped
public class TeamDetailBean {
	
	
	private String id;
	
	private TeamDTO teamDTO;
	
	@PostConstruct
	public void initBean( ) {
		if (FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().containsKey("teamId")) {
			id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("teamId");
			loadTeamData(Integer.valueOf(id));
		};
		
	}
	
	private void loadTeamData(Integer id) {
		teamDTO = new TeamDTO();
		teamDTO.setId(id);
		teamDTO.setCode("FCB");
		teamDTO.setName("Futbol Club Barcelona");
		teamDTO.setCity("BCN");
	}

	public TeamDTO getTeamDTO() {
		return teamDTO;
	}

	public void setTeamDTO(TeamDTO teamDTO) {
		this.teamDTO = teamDTO;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

}
