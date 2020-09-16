package com.revature.daos;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Games;

public class GamesDAO implements IGamesDAO {
	private static final Logger log = LogManager.getLogger(UserDAO.class);

	@Override
	public List<Games> findByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addGame(Games games) {
		// TODO Auto-generated method stub
		return false;
	}
}
