package com.SpringBoot_SpringSecurity.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot_SpringSecurity.auth.entity.User;

@Repository
public interface UserRepository2 extends JpaRepository<User, Long> {


	    Optional<User> findByUsername(String username);

	}

