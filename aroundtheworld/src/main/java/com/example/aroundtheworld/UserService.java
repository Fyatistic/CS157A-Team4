package com.example.aroundtheworld;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	TravelUser save(UserRegistrationDto registrationDto);
}
