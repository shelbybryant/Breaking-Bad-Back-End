package com.revature.daos;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.models.Users;

//  SessionFactory $ Session not recognized - need to check dependencies 

@Repository
@Transactional
public class UserDAO implements IUserDAO {
	private static final Logger log = LogManager.getLogger(UserDAO.class);
	
	private SessionFactory sf;
	
	@Autowired
	public UserDAO() {
		super();
	}

	@Override
	public List<Users> findAllUser() {
		Session ses = sf.getCurrentSession();
		CriteriaQuery<Users> cq = ses.getCriteriaBuilder(createQuery(Users.class))
		cq.from(Users.class);
		return ses.createQuery(cq).getResultList();
	}
	
	@Override
	public void getScreenNameById(int userId) {
		Session ses = sf.getCurrentSession();
		ses.get(Users.class, userId);
	}

	@Override
	public void getAvatarById(byte avatar) {
		Session ses = sf.getCurrentSession();
		ses.get(Users.class, avatar);
		
	}

	@Override
	public void addUser(Users users) {
		Session ses = sf.getCurrentSession();
		ses.save(users);
	}

	@Override
	public void updateUser(Users users) {
		Session ses = sf.getCurrentSession();
		ses.merge(users);
	}

	@Override
	public List<Users> getTopThree() {
		Session ses = sf.getCurrentSession();
		CriteriaQuery<Users> q = ses.getCriteriaBuilder(createQuery(Users.class))
		Root<Users> c = q.from(Users.class);
		q.select(c);
		return q.orderBy(ses.desc(c.get("running_total")));
		//need to grab top 3
	}

	@Override
	public Users getRunningTotal(int userId) {
		Session ses = sf.getCurrentSession();
		return ses.get(Users.class, userId);
	}

	@Override
	public Users getGamesTotal(int userId) {
		Session ses = sf.getCurrentSession();
		return ses.get(Users.class, userId);
	}

}
