package com.professeur.oumaima.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.professeur.oumaima.entities.Professeur;
import com.professeur.oumaima.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	

}
