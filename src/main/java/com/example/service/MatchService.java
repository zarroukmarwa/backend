package com.example.service;

import java.util.List;
import com.example.model.Match;

public interface MatchService  {

	public List<Match> getAllMatches();
	
	public Match findById(Integer id);
	
	public Match update(Match match);
	
	public Match add(Match match);
	
	public void delete(Integer id);
	
	public Match searchMatch(String teamOne, String teamTwo);
}
