package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//in case user wants to search quotes by character

@Entity
@Table(name="Character")
public class Character {
	
	@Column(name="char_id")
	private int charId;
	@Id
	@Column(name="name")
	private String name; //pk referenced by Quotes.author
	
	public Character() {
		super();
	}

	public Character(int charId, String name) {
		super();
		this.charId = charId;
		this.name = name;
	}

	public int getCharId() {
		return charId;
	}

	public void setCharId(int charId) {
		this.charId = charId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Character [charId=" + charId + ", name=" + name + "]";
	}
}
