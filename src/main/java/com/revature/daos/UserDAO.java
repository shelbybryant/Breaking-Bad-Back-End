package com.revature.daos;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Users;

@Repository
@Transactional
public class UserDAO implements IUserDAO {
	
	private static final Logger log = LogManager.getLogger(UserDAO.class);
	private SessionFactory sf;
	

	@Autowired
	public UserDAO(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	@Override
	public List<Users> findAllUser() {
		return null;
	}
	
	@Override
	public boolean getScreenNameById(int userId) {
		return false;
	}

	@Override
	public boolean getAvatarById(byte avatar) {
		return false;
	}

	@Override
	public void addUser(Users users) {
		Session session = sf.getCurrentSession();
		session.save(users);
	}

	@Override
	public void updateUser(Users users) {
		Session session = sf.getCurrentSession();
		session.update(users);
	}

	@Override
	public List<Users> getTopThree() {
		return null;
	}

	@Override
	public Users getRunningTotal(int userId) {
		return null;
	}

	@Override
	public Users getGamesTotal(int userId) {
		return null;
	}

	@Override
	public Users getEmail(String email) {
		Session session = sf.getCurrentSession();
		return session.get(Users.class, email);
	}



	
	

}
