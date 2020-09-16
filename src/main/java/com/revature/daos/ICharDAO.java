//user may want to search saved quotes by character

package com.revature.daos;

import com.revature.models.Quotes;
import java.util.List;

public interface ICharDAO {
	
	public List<Quotes> getQuoteByCharId(int charId);

}
