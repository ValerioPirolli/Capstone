package com.SpringBoot_SpringSecurity.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot_SpringSecurity.auth.entity.ERole;
import com.SpringBoot_SpringSecurity.auth.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
