package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="games")
public class Games implements Serializable {
	
	private static final long serialVersionUID = 1L; //for serializing
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="char_id", nullable = false)
	private int cId;//character id
	@Column(name="char_name", unique = true, nullable = false)
	private String cName;//character name
	@Column(name="quote")
	private String quote;
	@Column(name="fun_fact1")
	private String funFact1;
	@Column(name="fun_fact2")
	private String funFact2;
	
	public Games() {
		super();
	}

	public Games(int cId, String cName, String quote, String funFact1, String funFact2) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.quote = quote;
		this.funFact1 = funFact1;
		this.funFact2 = funFact2;
	}

	public Games(String cName, String quote, String funFact1, String funFact2) {
		super();
		this.cName = cName;
		this.quote = quote;
		this.funFact1 = funFact1;
		this.funFact2 = funFact2;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getFunFact1() {
		return funFact1;
	}

	public void setFunFact1(String funFact1) {
		this.funFact1 = funFact1;
	}

	public String getFunFact2() {
		return funFact2;
	}

	public void setFunFact2(String funFact2) {
		this.funFact2 = funFact2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cId;
		result = prime * result + ((cName == null) ? 0 : cName.hashCode());
		result = prime * result + ((funFact1 == null) ? 0 : funFact1.hashCode());
		result = prime * result + ((funFact2 == null) ? 0 : funFact2.hashCode());
		result = prime * result + ((quote == null) ? 0 : quote.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Games other = (Games) obj;
		if (cId != other.cId)
			return false;
		if (cName == null) {
			if (other.cName != null)
				return false;
		} else if (!cName.equals(other.cName))
			return false;
		if (funFact1 == null) {
			if (other.funFact1 != null)
				return false;
		} else if (!funFact1.equals(other.funFact1))
			return false;
		if (funFact2 == null) {
			if (other.funFact2 != null)
				return false;
		} else if (!funFact2.equals(other.funFact2))
			return false;
		if (quote == null) {
			if (other.quote != null)
				return false;
		} else if (!quote.equals(other.quote))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Games [cId=" + cId + ", cName=" + cName + ", quote=" + quote + ", funFact1=" + funFact1 + ", funFact2="
				+ funFact2 + "]";
	}
}
