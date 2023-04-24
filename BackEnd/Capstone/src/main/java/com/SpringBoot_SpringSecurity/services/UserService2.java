package com.SpringBoot_SpringSecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot_SpringSecurity.auth.entity.User;
import com.SpringBoot_SpringSecurity.repositories.UserRepository2;
import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService2 {
	@Autowired private UserRepository2 ar;
	
	public User findByUsername(String a){
		if(ar.findByUsername(a).isEmpty()){
            throw new EntityNotFoundException("user not found with that username");
        }else{
            return ar.findByUsername(a).get();
        }
    }
	}

