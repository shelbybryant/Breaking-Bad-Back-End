package com.revature.daos;

import java.util.List;

import com.revature.models.Users;

public interface IUserDAO {
	public List<Users> findAllUser();

	boolean addUser(Users users);

	boolean updateUser(Users users);

	List<Users> getTopThree(int userId);

	Users getRunningTotal(int userId);

	Users getGamesTotal(int userId);
	
	
	
}
