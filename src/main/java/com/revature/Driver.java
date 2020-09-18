package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.daos.IUserDAO;
import com.revature.models.Users;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IUserDAO iDao = ac.getBean(IUserDAO.class);
		
		iDao.addUser(new Users("testName", "test@gmail.com", "password"));
	}
}
