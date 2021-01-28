package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Player;

public interface PlayerReposiroty extends JpaRepository<Player, Long> {

}
