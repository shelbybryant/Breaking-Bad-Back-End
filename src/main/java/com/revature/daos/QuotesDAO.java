package com.revature.daos;

import java.util.List;

import com.revature.models.Quotes;

public class QuotesDAO implements IQuotesDAO{

	@Override
	public List<Quotes> findByUserId(int userId) {
		return null;
	}

	@Override
	public boolean saveQuote(Quotes quote) {
		return false;
	}

}
