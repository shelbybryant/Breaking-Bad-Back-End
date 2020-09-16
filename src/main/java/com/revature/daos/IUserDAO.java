package com.revature.daos;

import java.util.List;

import com.revature.models.Users;

public interface IUserDAO {
	public List<Users> findAllUser();
	public boolean getScreenNameById(int userId);
	public boolean getAvatarById(byte avatar);
	public boolean addUser(Users users);
	public boolean updateUser(Users users);
	//to pull top three running totals
	public List<Users> getTopThree();
	public Users getRunningTotal(int userId);
	public Users getGamesTotal(int userId);
	
}
