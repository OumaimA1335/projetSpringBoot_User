package com.professeur.oumaima.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.professeur.oumaima.entities.Grade;
import com.professeur.oumaima.entities.Professeur;
import com.professeur.oumaima.entities.Role;
import com.professeur.oumaima.entities.User;

@Service
public interface UserService {
	
	
	    User saveUser(User u);
	    User updateUser(User u );
	    void deleteUser(User u);
	    void deleteUserById(Long id);
	    User getUser(Long id);
	    List<User> getAllUsers();
	    Page<User> getAllUsersParPage(int page, int size);
	   

}
