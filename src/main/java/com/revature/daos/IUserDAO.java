package com.revature.daos;

import java.util.List;

import com.revature.models.Users;

public interface IUserDAO {
	public List<Users> findAllUser();
	public boolean getScreenNameById(int userId);
	public boolean getAvatarById(byte avatar);
	public void addUser(Users users);
	public void updateUser(Users users);
	public List<Users> getTopThree(); //to pull top three running totals
	public Users getRunningTotal(int userId);
	public Users getGamesTotal(int userId);
	public Users getEmail(String email);
	
}
