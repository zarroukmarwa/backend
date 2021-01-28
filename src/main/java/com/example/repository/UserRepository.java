package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
User findUserByEmailAndPassword(String email, String password);
	
	User findUserByEmail(String email);

//	@Query("SELECT u FROM User u WHERE u.firstName = : firstName AND u.lastName = : lastName")
//	public User searchUser(@Param("firstName")String firstName, @Param("lastName") String lastName);
	
//	public User findUserByEmail(String firstName , String lastName);
}
