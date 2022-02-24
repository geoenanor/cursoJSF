package com.imagina.jsfdemo.bean.dto;

import java.util.Comparator;

public class TeamComparatorbyName implements Comparator<TeamDTO>{

	boolean orderAsc;
	
	
	
	public TeamComparatorbyName(boolean orderAsc) {
		super();
		this.orderAsc = orderAsc;
	}



	@Override
	public int compare(TeamDTO team1, TeamDTO team2) {
		
		int res = team1.getName().compareTo(team2.getName());
		
		if(!this.orderAsc) {
			res *=-1;
		}
		return res;
	}



}
