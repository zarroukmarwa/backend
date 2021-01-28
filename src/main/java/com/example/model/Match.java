package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Match {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MATCH_ID")
	private Integer id;
	
	@Column
	private Integer scoreOne;
	
	@Column
	private Integer scoreTwo;
	
	@Column
	private String teamOne;
	
	@Column
	private String teamTwo;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getScoreOne() {
		return scoreOne;
	}

	public void setScoreOne(Integer scoreOne) {
		this.scoreOne = scoreOne;
	}

	public Integer getScoreTwo() {
		return scoreTwo;
	}

	public void setScoreTwo(Integer scoreTwo) {
		this.scoreTwo = scoreTwo;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	
	
	
}
