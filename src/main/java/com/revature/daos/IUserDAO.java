package com.revature.daos;

import java.util.List;

import com.revature.models.Users;

public interface IUserDAO {
	public List<Users> findAllUser();
	public boolean addUser(Users users);
	public boolean updateUser(Users users);

	
}
