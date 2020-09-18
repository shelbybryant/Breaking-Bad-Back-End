package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.daos.UserDAO;
import com.revature.models.Users;

//@Controller
//@RequestMapping(value="/login")
//@ResponseBody
public class LoginController {
	
	private UserDAO uDao;

//	@Autowired
	public LoginController(UserDAO uDao) {
		super();
		this.uDao = uDao;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
//	private static LoginService loginService = new LoginService();
//	private static ObjectMapper objectMapper = new ObjectMapper();
//	
//	public void login(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		
//		LoginDTO loginDto = new LoginDTO();	
//		
//		// getting info from index.html
//		String email = req.getParameter("login_username"); // just for placeholder for now
//		String password = req.getParameter("login_pw");
//		
//		loginDto.email = email;
//		loginDto.password = password;
//		
//		
//
//		
//	}
//	public void logout(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		
//		HttpSession session = req.getSession(false);
//		
//		if(session != null) {
//			
//			LoginDTO loginDto = (LoginDTO)session.getAttribute("user");
//			session.invalidate();
//			
//			res.setStatus(200);
//			res.getWriter().println(loginDto.email + " has logged out successfully");
//			System.out.println("Login Controller logout - logged out success! " + loginDto);
//			
//		}else {
//			res.setStatus(401);
//			res.getWriter().println("You must be logged in to logout");
//		}
//	
//		
//	}
	

}
