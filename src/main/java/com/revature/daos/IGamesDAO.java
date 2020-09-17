package com.revature.daos;

import java.util.List;

import com.revature.models.Games;

public interface IGamesDAO {

	public List<Games> findByUserId(int userId);
	public boolean addGame (Games games);
	
	/*I don't know about the random quotes method because the api has functionality for that and we will just put
	 * it into our question field on the front end
	* And we don't need the quote by character because the api will also do that. Our QuotesDAO
	 * will have the methodology for storing and then retrieving those saved quotes
	 */
	
}
