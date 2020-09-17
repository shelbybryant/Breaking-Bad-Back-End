package com.revature.daos;

import java.util.List;

import com.revature.models.Games;

public class GamesDAO implements IGamesDAO{

	@Override
	public List<Games> findByUserId(int userId) {
		return null;
	}

	@Override
	public boolean addGame(Games games) {
		return false;
	}

}
