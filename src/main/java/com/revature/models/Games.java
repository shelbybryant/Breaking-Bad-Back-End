package com.revature.models;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name="games")
public class Games implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="game_id", nullable = false)
	private int gameId;//game id
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private int userId;
	@Column(name="score")
	private int score;
	@Column(name="game_submitted")
	private Date gameSubmitted;
	
	
	public Games() {
		super();
	}


	public Games(int score, Date gameSubmitted) {
		super();
		this.score = score;
		this.gameSubmitted = gameSubmitted;
	}


	public Games(int userId, int score, Date gameSubmitted) {
		super();
		this.userId = userId;
		this.score = score;
		this.gameSubmitted = gameSubmitted;
	}


	public Games(int gameId, int userId, int score, Date gameSubmitted) {
		super();
		this.gameId = gameId;
		this.userId = userId;
		this.score = score;
		this.gameSubmitted = gameSubmitted;
	}


	public int getGameId() {
		return gameId;
	}


	public void setGameId(int gameId) {
		this.gameId = gameId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public Date getGameSubmitted() {
		return gameSubmitted;
	}


	public void setGameSubmitted(Date gameSubmitted) {
		this.gameSubmitted = gameSubmitted;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Games [gameId=" + gameId + ", userId=" + userId + ", score=" + score + ", gameSubmitted="
				+ gameSubmitted + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gameId;
		result = prime * result + ((gameSubmitted == null) ? 0 : gameSubmitted.hashCode());
		result = prime * result + score;
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
		Games other = (Games) obj;
		if (gameId != other.gameId)
			return false;
		if (gameSubmitted == null) {
			if (other.gameSubmitted != null)
				return false;
		} else if (!gameSubmitted.equals(other.gameSubmitted))
			return false;
		if (score != other.score)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}



	

}
