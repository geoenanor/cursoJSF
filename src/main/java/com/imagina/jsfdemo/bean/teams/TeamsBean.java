package com.imagina.jsfdemo.bean.teams;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.imagina.jsfdemo.bean.dto.CityDTO;
import com.imagina.jsfdemo.bean.dto.TeamComparatorbyName;
import com.imagina.jsfdemo.bean.dto.TeamDTO;

@Named
@ViewScoped
public class TeamsBean implements Serializable {

	private static final long serialVersionUID = 9149473815682239832L;

	private List<TeamDTO> teamsList;
	
	private TeamDTO newTeam;
	
	private String nameSearch;
	
	@PostConstruct
	public void initBean() {
		loadTeamsList();
		initVariables();
	}
	
	private void initVariables() {
		newTeam = new TeamDTO();
	}
	
	public void sortTeamsByName() {
		TeamComparatorbyName comp = new TeamComparatorbyName();
		teamsList.sort(comp);
	}
	
	

	public void addTeam() {
		newTeam.setId(teamsList.size()+1);
		teamsList.add(newTeam);
		newTeam = new TeamDTO();
	}
	
	
	public String goToDetail(String id) {
		return "teamDetail?faces-redirect=true&teamId="+id;
	}
	
	private void loadTeamsList() {
		teamsList = new ArrayList<TeamDTO>();
		
		teamsList.add(createTeam("FCB", "Futbol Club Barcelona", "Barcelona", "Xavi"));
		teamsList.add(createTeam("AM", "Atletico de Madrid", "Madrid", "Cholo"));
		teamsList.add(createTeam("RM", "Real Madrid", "Madrid", "Ancelotti"));
	
	}
	
	private TeamDTO createTeam(String code, String name, String city, String coach) {
		TeamDTO team = new TeamDTO();
		team.setId(teamsList.size()+1);
		team.setCode(code);
		team.setName(name);
		team.setCity(new CityDTO(city, "Spain"));
		team.setCoach(coach);
		return team;
	}

	public List<TeamDTO> getTeamsList() {
		return teamsList;
	}

	public void setTeamsList(List<TeamDTO> teamsList) {
		this.teamsList = teamsList;
	}

	public String getNameSearch() {
		return nameSearch;
	}

	public void setNameSearch(String nameSearch) {
		this.nameSearch = nameSearch;
	}

	public TeamDTO getNewTeam() {
		return newTeam;
	}

	public void setNewTeam(TeamDTO newTeam) {
		this.newTeam = newTeam;
	}


}
