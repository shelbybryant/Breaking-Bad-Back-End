package com.revature.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.LoginDTO;



public class LoginService {
	private static final Logger log = LogManager.getLogger(LoginService.class);
	

	public boolean login(LoginDTO loginDto) {
		
		log.info("Login Service login" + loginDto);
		
		
	
		return false;
	}
	
	
}
