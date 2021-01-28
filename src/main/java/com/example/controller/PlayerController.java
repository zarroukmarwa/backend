package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Match;
import com.example.model.Player;
import com.example.service.PlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	@Autowired
	PlayerService playerService;
	@GetMapping
	public List<Player> getAllPlayers(){
		return playerService.getAllPlayers();	
	}
	
	@GetMapping("/{id}")
	public Player getPlayerById(@PathVariable Long id) {
		return playerService.findById(id).get();
	}
	
	@PostMapping
	public Player addPlayer(@RequestBody Player player) {
		System.out.println(player);
		return playerService.add(player);
	}
	
	@PutMapping ("/{id}")
	public Player updatePlayer( @PathVariable Long id , @RequestBody Player player) {
		return playerService.update(player);
	}
	@DeleteMapping("/{id}")
	public void deletePlayer(@PathVariable Long id) {
		playerService.delete(id);
	}

}
