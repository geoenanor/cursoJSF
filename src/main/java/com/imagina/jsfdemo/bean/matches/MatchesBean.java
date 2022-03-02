package com.imagina.jsfdemo.bean.matches;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.component.fileupload.FileUpload;
import org.primefaces.model.file.UploadedFile;

import com.imagina.jsfdemo.bean.dto.MatchDTO;
import com.imagina.jsfdemo.bean.dto.TeamComparatorbyName;
import com.imagina.jsfdemo.bean.dto.TeamDTO;


@Named
@ViewScoped
public class MatchesBean implements Serializable {

	private static final long serialVersionUID = 9149473815682239832L;

	private List<MatchDTO> matchesList;

	
	@PostConstruct
	public void initBean() {
		loadMatchesList();
	}
	

	
	private void loadMatchesList() {
		matchesList = new ArrayList<>();
		
		MatchDTO match = new MatchDTO();
		match.setId(matchesList.size()+1);
		match.setResult("5-0");
		match.setLocal(new TeamDTO(1, "FCB", "Futbol Club Barcelona", "Barcelona", "Xavi"));
		match.setVisitor(new TeamDTO(2, "RM", "Real Madrid", "Madrid", "Acnelotti"));
		match.setDate(new Date());
		
		matchesList.add(match);
	}



	public List<MatchDTO> getMatchesList() {
		return matchesList;
	}



	public void setMatchesList(List<MatchDTO> matchesList) {
		this.matchesList = matchesList;
	}

	
}