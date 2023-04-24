package com.SpringBoot_SpringSecurity.auth.service;

import com.SpringBoot_SpringSecurity.auth.entity.User;
import com.SpringBoot_SpringSecurity.auth.payload.LoginDto;
import com.SpringBoot_SpringSecurity.auth.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
