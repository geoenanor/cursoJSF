package com.imagina.jsfdemo.bean.teams;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.component.fileupload.FileUpload;
import org.primefaces.model.file.UploadedFile;

import com.imagina.jsfdemo.bean.dto.TeamComparatorbyName;
import com.imagina.jsfdemo.bean.dto.TeamDTO;


@Named
@ViewScoped
public class TeamsBean implements Serializable {

	private static final long serialVersionUID = 9149473815682239832L;

	private List<TeamDTO> teamsList;
	
	private List<TeamDTO> filteredList;

	private TeamDTO newTeam;
	
	private String nameSearch;
	
	private String coachFilter;
		
	private UploadedFile iconUpload;
	
	@PostConstruct
	public void initBean() {
		loadTeamsList();
	}
	

	

	public void filterCoach() {
		if (coachFilter == null || coachFilter.isEmpty()) {
			filteredList = new ArrayList<TeamDTO>(teamsList);
		}
		else {
			filteredList = teamsList.stream()
					.filter(team ->team.getCoach().toLowerCase().contains(coachFilter.toLowerCase()))
					.collect(Collectors.toList());
		}	
	}

	public void prepareToAddTeam() {
		newTeam = new TeamDTO();
		newTeam.setId(teamsList.size()+1);
		newTeam.setCode("xxx");
	}
	
	public void addTeam() {		
		newTeam.setIcon(iconUpload.getContent());
		teamsList.add(newTeam);
		newTeam = new TeamDTO();
		filteredList = new ArrayList<TeamDTO>(teamsList);
	}
	
	public void deleteTeam(Integer id) {
		
		teamsList.stream()
			.filter(t -> t.getId().equals(id))
			.findFirst().map(t -> teamsList.remove(t));
		/*
		for (TeamDTO team : teamsList) {
			if (team.getId().equals(id)) {
				teamsList.remove(team);
				break;
			}
		}
		*/
		filteredList = new ArrayList<TeamDTO>(teamsList);
		
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

		filteredList = new ArrayList<TeamDTO>(teamsList);
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

	public String getCoachFilter() {
		return coachFilter;
	}

	public void setCoachFilter(String coachFilter) {
		this.coachFilter = coachFilter;
	}

	public List<TeamDTO> getFilteredList() {
		return filteredList;
	}

	public void setFilteredList(List<TeamDTO> filteredList) {
		this.filteredList = filteredList;
	}




	public UploadedFile getIconUpload() {
		return iconUpload;
	}




	public void setIconUpload(UploadedFile iconUpload) {
		this.iconUpload = iconUpload;
	}



}