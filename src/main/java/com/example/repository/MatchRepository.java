package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match,Integer> {

	@Query("SELECT m FROM Match m WHERE m.teamOne = : teamOne AND m.teamTwo = : teamTwo")
	public Match searchMatch(@Param("teamOne")String teamOne, @Param("teamTwo") String teamTwo);
	
	public Match findMatchByTeamOneAndTeamTwo(String teamOne , String teamTwo);
}
