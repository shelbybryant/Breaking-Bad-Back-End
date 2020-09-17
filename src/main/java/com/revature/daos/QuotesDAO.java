package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.revature.models.Quotes;
import com.revature.models.Users;

@Repository
@Transactional
public class QuotesDAO implements IQuotesDAO{

	@Override
	public List<Quotes> findByUserId(int userId) {
		Session ses = sf.getCurrentSession();
		return ses.get(Users.class, userId);
	}

	@Override
	public void saveQuote(Quotes quote) {
		Session ses = sf.getCurrentSession();
		ses.merge(quote);
	}

}
