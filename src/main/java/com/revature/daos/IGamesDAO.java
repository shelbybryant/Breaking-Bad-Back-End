package com.revature.daos;

import java.util.List;

import com.revature.models.Games;

public interface IGamesDAO {

	//this will get all games based on the user id
	public List<Games> findByUserId(int userId);
	
}
