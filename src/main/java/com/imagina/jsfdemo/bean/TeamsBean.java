package com.imagina.jsfdemo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.imagina.jsfdemo.bean.dto.TeamDTO;

@Named
@RequestScoped
public class TeamsBean {
	
	private List<TeamDTO> teamsList;
	
	@PostConstruct
	public void initBean() {
		loadTeamsList();
	}
	
	private void loadTeamsList() {
		teamsList = new ArrayList<TeamDTO>();
		
		TeamDTO team = new TeamDTO();
		team.setId(1);
		team.setCode("FCB");
		team.setName("Futbol Club Barcelona");
		teamsList.add(team);
		
		team = new TeamDTO();
		team.setId(2);
		team.setCode("RM");
		team.setName("Real Madrid");
		teamsList.add(team);
		
		team = new TeamDTO();
		team.setId(3);
		team.setCode("VCF");
		team.setName("Valencia Club");
		teamsList.add(team);
		
	}

	public List<TeamDTO> getTeamsList() {
		return teamsList;
	}

	public void setTeamsList(List<TeamDTO> teamsList) {
		this.teamsList = teamsList;
	}
	
	

}
