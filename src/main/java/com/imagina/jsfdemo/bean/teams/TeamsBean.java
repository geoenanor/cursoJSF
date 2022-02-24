package com.imagina.jsfdemo.bean.teams;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.imagina.jsfdemo.bean.dto.TeamDTO;

@Named
@RequestScoped
public class TeamsBean {
	
	private List<TeamDTO> teamsList;
	
	private String nameSearch;

	private Integer id;
	private String code;
	private String name;
	private String city;

	
	public void addTeam() {
		TeamDTO team = new TeamDTO();
		team.setId(id);
		team.setCode(code);
		team.setName(name);
		team.setCity(city);
		teamsList.add(team);
	}
	
	@PostConstruct
	public void initBean() {
		loadTeamsList();
	}
	
	public String goToDetail(String id) {
		return "teamDetail?faces-redirect=true&teamId="+id;
	}
	
	private void loadTeamsList() {
		teamsList = new ArrayList<TeamDTO>();
		
		TeamDTO team = new TeamDTO();
		team.setId(1);
		team.setCode("FCB");
		team.setName("Futbol Club Barcelona");
		team.setCity("BCN");
		teamsList.add(team);
		
		team = new TeamDTO();
		team.setId(2);
		team.setCode("RM");
		team.setName("Real Madrid");
		team.setCity("Madrid");
		teamsList.add(team);
		
		team = new TeamDTO();
		team.setId(3);
		team.setCode("AM");
		team.setName("Atletico de Madrid");
		team.setCity("Madrid");
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	

}
