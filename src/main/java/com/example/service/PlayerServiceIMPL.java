package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Player;
import com.example.repository.PlayerReposiroty;
@Service
public class PlayerServiceIMPL implements PlayerService {

	@Autowired
	PlayerReposiroty playerRepo;
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepo.findAll();
	}

	@Override
	public Optional<Player> findById(Long id) {
		// TODO Auto-generated method stub
		return playerRepo.findById(id);
	}

	@Override
	public Player update(Player player) {
		// TODO Auto-generated method stub
		return playerRepo.save(player);
	}

	@Override
	public Player add(Player player) {
		// TODO Auto-generated method stub
		return playerRepo.save(player);
	}

	@Override
	public void delete(Long id) {
		playerRepo.deleteById(id);

	}

}
