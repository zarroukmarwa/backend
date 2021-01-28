package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPlayer;
	private String playerName;
	private Integer numPlayer;
	@Override
	public String toString() {
		return "Player [idPlayer=" + idPlayer + ", playerName=" + playerName + ", numPlayer=" + numPlayer
				+ ", postePlayer=" + postePlayer + ", teamPlayer=" + teamPlayer + "]";
	}
	private String postePlayer;
	private String teamPlayer;
	
	public Long getIdPlayer() {
		return idPlayer;
	}
	public void setIdPlayer(Long idPlayer) {
		this.idPlayer = idPlayer;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getNumPlayer() {
		return numPlayer;
	}
	public void setNumPlayer(Integer numPlayer) {
		this.numPlayer = numPlayer;
	}
	public String getPostePlayer() {
		return postePlayer;
	}
	public void setPostePlayer(String postePlayer) {
		this.postePlayer = postePlayer;
	}
	public String getTeamPlayer() {
		return teamPlayer;
	}
	public void setTeamPlayer(String teamPlayer) {
		this.teamPlayer = teamPlayer;
	}
	
	
	

}
