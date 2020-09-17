package com.revature.daos;

import java.util.List;

import com.revature.models.Quotes;

public interface IQuotesDAO {
	public List<Quotes> findByUserId(int userId);
	public void saveQuote(Quotes quote);
}
