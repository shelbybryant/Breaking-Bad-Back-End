package com.revature;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;


import com.revature.daos.UserDAO;
import com.revature.models.LoginDTO;
import com.revature.models.Users;
import com.revature.services.LoginService;


public class ServiceLayerTest {
	
	
	private static LoginDTO loginDto;
	
	private static UserDAO uDAO = new UserDAO();
	
	public static LoginService loginService;
	

	public ServiceLayerTest() {
		super();
	}
	
	@BeforeClass
	public static void set() {
		System.out.println("setting before class");
		
		loginService = new LoginService();
		
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testLoginService() {
		LoginDTO ld1 = new LoginDTO("aki", "aki");
		boolean u1 = loginService.login(ld1);
		assertTrue(u1);
		
		LoginDTO ld2 = new LoginDTO("notexist", "notexist");
		boolean u2 = loginService.login(ld2);
		assertFalse(u2);
		
		LoginDTO ld3 = new LoginDTO("", "");
		boolean u3 = loginService.login(ld3);
		assertFalse(u3);
				
	}
	
	
		
	
}

