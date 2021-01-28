package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Match;
import com.example.service.MatchService;

//@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/matches")
public class MatchController {
	
@Autowired
private MatchService matchService;
	
	
	@GetMapping
	public List<Match> getAllMatches(){
		return matchService.getAllMatches();	
	}
	
	@GetMapping("/{id}")
	public Match getMatchById(@PathVariable Integer id) {
		return matchService.findById(id);
	}
	
	@GetMapping("/{teamOne}/{teamTwo}")
	public Match searchMatch(@PathVariable  String teamOne, @PathVariable String teamTwo) {
		return matchService.searchMatch( teamOne, teamTwo);
	}
	
	@PostMapping
	public Match addMatch(@RequestBody Match match) {
		return matchService.add(match);
	}
	
	@PutMapping ("/{id}")
	public Match updateMatch( @PathVariable Integer id , @RequestBody Match match) {
		return matchService.update(match);
	}
	@DeleteMapping ("/{id}")
	public void deleteMatch(@PathVariable Integer id) {
		matchService.delete(id);
	}
}
