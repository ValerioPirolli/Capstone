package com.SpringBoot_SpringSecurity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot_SpringSecurity.auth.entity.User;

import com.SpringBoot_SpringSecurity.services.UserService2;

@RestController
@RequestMapping("/api/users")
public class UserController2 {
	
    @Autowired UserService2 us;
    
	@GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        System.out.println("Chiamata user riuscita");
        return us.findByUsername(username);
    }
}
