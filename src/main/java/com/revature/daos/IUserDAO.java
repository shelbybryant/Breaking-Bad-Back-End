package com.revature.daos;

import java.util.List;

import com.revature.models.Users;

public interface IUserDAO {
	public List<Users> findAllUser();
	public void getScreenNameById(int userId);
	public void getAvatarById(byte avatar);
	public void addUser(Users users);
	public void updateUser(Users users);
	//to pull top three running totals
	public List<Users> getTopThree();
	public Users getRunningTotal(int userId);
	public Users getGamesTotal(int userId);
	
}
