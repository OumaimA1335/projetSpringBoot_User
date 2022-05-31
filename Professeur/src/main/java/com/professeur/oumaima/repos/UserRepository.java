package com.professeur.oumaima.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.professeur.oumaima.entities.Grade;
import com.professeur.oumaima.entities.Professeur;
import com.professeur.oumaima.entities.Role;
import com.professeur.oumaima.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

	User findByUsername (String username);
    
	
	
}
