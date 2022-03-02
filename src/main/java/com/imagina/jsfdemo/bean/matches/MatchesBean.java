package com.imagina.jsfdemo.bean.matches;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.component.fileupload.FileUpload;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.file.UploadedFile;

import com.imagina.jsfdemo.bean.dto.MatchDTO;
import com.imagina.jsfdemo.bean.dto.TeamComparatorbyName;
import com.imagina.jsfdemo.bean.dto.TeamDTO;


@Named
@ViewScoped
public class MatchesBean implements Serializable {

	private static final long serialVersionUID = 9149473815682239832L;

	private List<MatchDTO> matchesList;
	
	private MatchDTO newMatch;
	
	private LocalDate matchMaxDate;
	
	private MatchDTO matchDetail;

	
	@PostConstruct
	public void initBean() {
		loadMatchesList();
		defineMaxMatchDate();
	}
	
	private void defineMaxMatchDate() {
		matchMaxDate = LocalDate.now();
	}

	
	private void loadMatchesList() {
		matchesList = new ArrayList<>();
		
		MatchDTO match = new MatchDTO();
		match.setId(matchesList.size()+1);
		match.setResult("5-0");
		match.setLocal("Barcelona");
		match.setVisitor("Real Madrid");
		match.setDate(new Date());
		
		matchesList.add(match);
	}

	
	public void prepareToAddMatch() {
		newMatch = new MatchDTO();
		newMatch.setId(matchesList.size()+1);
	}
	
	public void addMatch() {
		matchesList.add(newMatch);
		newMatch = new MatchDTO();
	}
	
	public void onMatchSelect(SelectEvent<MatchDTO> event) {
		matchDetail = event.getObject();
    }


	public List<MatchDTO> getMatchesList() {
		return matchesList;
	}



	public void setMatchesList(List<MatchDTO> matchesList) {
		this.matchesList = matchesList;
	}




	public MatchDTO getNewMatch() {
		return newMatch;
	}




	public MatchDTO getMatchDetail() {
		return matchDetail;
	}

	public void setMatchDetail(MatchDTO matchDetail) {
		this.matchDetail = matchDetail;
	}

	public void setNewMatch(MatchDTO newMatch) {
		this.newMatch = newMatch;
	}

	public LocalDate getMatchMaxDate() {
		return matchMaxDate;
	}

	
}