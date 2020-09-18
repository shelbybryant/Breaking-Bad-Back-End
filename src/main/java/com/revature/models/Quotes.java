package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Quotes")
public class Quotes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="quote_id")
	private int quote_id;
	@Column(name="user_id")
	private int userId;
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="name")
	private String author;
	@Column(name="quote")
	private String authorQuote;
	

	public Quotes() {
		super();
		
	}

	public Quotes(int userId, String author, String authorQuote) {
		super();
		this.userId = userId;
		this.author = author;
		this.authorQuote = authorQuote;
	}

	public Quotes(String author, String authorQuote) {
		super();
		this.author = author;
		this.authorQuote = authorQuote;
	}

	
	public Quotes(int quote_id, int userId, String author, String authorQuote) {
		super();
		this.quote_id = quote_id;
		this.userId = userId;
		this.author = author;
		this.authorQuote = authorQuote;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorQuote() {
		return authorQuote;
	}

	public void setAuthorQuote(String authorQuote) {
		this.authorQuote = authorQuote;
	}

	
	
	public int getQuote_id() {
		return quote_id;
	}

	public void setQuote_id(int quote_id) {
		this.quote_id = quote_id;
	}

	@Override
	public String toString() {
		return "Quotes [quote_id=" + quote_id + ", userId=" + userId + ", author=" + author + ", authorQuote="
				+ authorQuote + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((authorQuote == null) ? 0 : authorQuote.hashCode());
		result = prime * result + quote_id;
		result = prime * result + userId;
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
		Quotes other = (Quotes) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (authorQuote == null) {
			if (other.authorQuote != null)
				return false;
		} else if (!authorQuote.equals(other.authorQuote))
			return false;
		if (quote_id != other.quote_id)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}


	
}