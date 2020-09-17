package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Users;

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
	public boolean addUser(Users users) {
		return false;
	}

	@Override
	public boolean updateUser(Users users) {
		return false;
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

}
