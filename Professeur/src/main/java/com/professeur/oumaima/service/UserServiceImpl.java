package com.professeur.oumaima.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.professeur.oumaima.entities.Role;
import com.professeur.oumaima.entities.User;
import com.professeur.oumaima.repos.RoleRepository;
import com.professeur.oumaima.repos.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;
    RoleRepository roleRepo;
	@Override
	public User saveUser(User u) {
		
		
		return userRepo.save(u);
	}

	@Override
	public User updateUser(User u) {
		PasswordEncoder passwordEncoder = passEncoder ();
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		u.setEnabled(true);
		
		return userRepo.save(u);
	}

	@Override
	public void deleteUser(User u) {
	
	userRepo.delete(u);
		
	}

	@Override
	public void deleteUserById(Long id) {
		userRepo.deleteById(id);
		
	}

	@Override
	public User getUser(Long id) {
		
		return userRepo.getById(id);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public Page<User> getAllUsersParPage(int page, int size) {
		
		return userRepo.findAll(PageRequest.of(page, size));
	}

	
	 @Bean
	 public PasswordEncoder passEncoder () {
	 return new BCryptPasswordEncoder();
	 }
}
