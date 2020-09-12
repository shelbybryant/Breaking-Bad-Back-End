package com.revature.daos;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Users;

public class UserDAO implements IUserDAO {
	private static final Logger log = LogManager.getLogger(UserDAO.class);
	
	public UserDAO() {
		super();
	}

	@Override
	public List<Users> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
