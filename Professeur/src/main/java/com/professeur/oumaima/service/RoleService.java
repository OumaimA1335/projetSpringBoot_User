package com.professeur.oumaima.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.professeur.oumaima.entities.Grade;
import com.professeur.oumaima.entities.Role;
@Service
public interface RoleService {
	
	List<Role> getAllRoles();
	Role saveRole(Role role);
	Page<Role> getAllRolesParPage(int page, int size);
	void deleteRoleById(Long id);
	Role getRole(Long id);
	Role updateRole(Role c);
	List <Role> findAll();

}
