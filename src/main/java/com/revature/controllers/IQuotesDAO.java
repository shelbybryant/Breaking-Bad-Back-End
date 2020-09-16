package com.revature.controllers;

import java.util.List;

import com.revature.models.Quotes;

public interface IQuotesDAO {
	public List<Quotes> findByUserId(int userId);
	public boolean saveQuote(Quotes quote);
}
