package com.example.service;

import java.util.List;
import java.util.Optional;


import com.example.model.Player;
public interface PlayerService {
public List<Player> getAllPlayers();
	
	public Optional<Player> findById(Long id);
	
	public Player update(Player Player);
	
	public Player add(Player Player);
	
	public void delete(Long id);
}
