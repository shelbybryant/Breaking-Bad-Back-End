package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.services.LoginService;

public class LoginController {
	
	private static LoginService loginService = new LoginService();
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	public void login(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		
		
	}

}
