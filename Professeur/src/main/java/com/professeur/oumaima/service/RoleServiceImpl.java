package com.professeur.oumaima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.professeur.oumaima.entities.Grade;
import com.professeur.oumaima.entities.Professeur;
import com.professeur.oumaima.entities.Role;
import com.professeur.oumaima.entities.User;
import com.professeur.oumaima.repos.RoleRepository;

@Service
public class RoleServiceImpl  implements RoleService{
    @Autowired
    RoleRepository roleRepo;

	@Override
	public List<Role> getAllRoles() {
		
		return roleRepo.findAll();
	}

	@Override
	public Role saveRole(Role role) {
		
		return roleRepo.save(role);
	}

	@Override
	public Page<Role> getAllRolesParPage(int page, int size) {
	
		return roleRepo.findAll(PageRequest.of(page, size));
	}

	@Override
	public void deleteRoleById(Long id) {
		roleRepo.deleteById(id);
		
	}

	@Override
	public Role getRole(Long id) {
		
		return roleRepo.getById(id);
	}

	@Override
	public Role updateRole(Role c) {
		
		return roleRepo.save(c);
	}


	@Override
	public List <Role> findAll() {
		
		
		return roleRepo.findAll();
	}
	
}
