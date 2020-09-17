package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Repository;

import com.revature.models.Games;
import com.revature.models.Users;

@Repository
@Transactional
public class GamesDAO implements IGamesDAO{
	
	SessionFactory sf;

	@SuppressWarnings("unchecked")
	@Override
	public List<Games> findByUserId(int userId) {
		Session ses = sf.getCurrentSession();
		return (List<Games>) ses.get(Users.class, userId);
	}

	@Override
	public void addGame(Games games) {
		Session ses = sf.getCurrentSession();
		ses.merge(games);
	}

}
