package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Match;
import com.example.repository.MatchRepository;

@Service
public class MatchServiceImpl implements MatchService{

	@Autowired
	private MatchRepository matchRepository;
	
	@Override
	public List<Match> getAllMatches() {
		return matchRepository.findAll();
	}
	@Override
	public Match findById(Integer id) {
		Optional<Match> match = matchRepository.findById(id);
		return match.isPresent() ? match.get() : null;	}

	@Override
	public Match update(Match match) {
		return matchRepository.save(match);
	}

	@Override
	public Match add(Match match) {
		return matchRepository.save(match);
	}

	@Override
	public void delete(Integer id) {
		matchRepository.deleteById(id);		
	}

	@Override
	public Match searchMatch(String teamOne, String teamTwo) {
		return matchRepository.searchMatch(teamOne, teamTwo);
	}

}
