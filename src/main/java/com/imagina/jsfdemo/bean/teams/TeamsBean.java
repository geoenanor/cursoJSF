package com.imagina.jsfdemo.bean.teams;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.imagina.jsfdemo.bean.dto.TeamDTO;

@Named
@ViewScoped
public class TeamsBean implements Serializable {

	private static final long serialVersionUID = 9149473815682239832L;

	private List<TeamDTO> teamsList;
	
	private TeamDTO newTeam;
	
	private String nameSearch;
	
	private List<SelectItem> cityList;

	
	@PostConstruct
	public void initBean() {
		loadTeamsList();
		initVariables();
		initDropdowns();
	}
	
	private void initVariables() {
		newTeam = new TeamDTO();
	}
	
	private void initDropdowns() {
		cityList = new ArrayList<SelectItem>();
		cityList.add(new SelectItem("Barcelona", "Barcelona"));
		cityList.add(new SelectItem("Madrid", "Madrid"));
		cityList.add(new SelectItem("Sev", "Sevilla"));
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
		
		TeamDTO team = new TeamDTO();
		team.setId(teamsList.size()+1);
		team.setCode("FCB");
		team.setName("Futbol Club Barcelona");
		team.setCity("BCN");
		team.setCoach("Xavi");
		teamsList.add(team);
		
		team = new TeamDTO();
		team.setId(teamsList.size()+1);
		team.setCode("RM");
		team.setName("Real Madrid");
		team.setCity("Madrid");
		team.setCoach("Ancelotti");
		teamsList.add(team);
		
		team = new TeamDTO();
		team.setId(teamsList.size()+1);
		team.setCode("AM");
		team.setName("Atletico de Madrid");
		team.setCity("Madrid");
		team.setCoach("Cholo");
		teamsList.add(team);

		
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

	public List<SelectItem> getCityList() {
		return cityList;
	}

	public void setCityList(List<SelectItem> cityList) {
		this.cityList = cityList;
	}


	
	

}
