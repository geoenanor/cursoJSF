package com.imagina.jsfdemo.bean.dto;

import java.util.Comparator;

public class TeamComparatorbyName implements Comparator<TeamDTO>{

	@Override
	public int compare(TeamDTO team1, TeamDTO team2) {
		return team1.getName().compareTo(team2.getName());
	}



}
