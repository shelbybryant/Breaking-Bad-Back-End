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

	@Override
	public boolean addUser(Users users) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(Users users) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Users> getTopThree(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getRunningTotal(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getGamesTotal(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
