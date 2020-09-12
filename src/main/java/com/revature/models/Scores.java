package com.revature.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Scores")
public class Scores implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="user_id", nullable=false)
	private int userId;
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="char_id", nullable=false)
	private int cId;
	@Column(name="score", unique = true, nullable = false)
	private int score;
	@Column(name="scored_date")
	private Timestamp tStamp;
	
	public Scores() {
		super();
	}

	public Scores(int userId, int cId, int score, Timestamp tStamp) {
		super();
		this.userId = userId;
		this.cId = cId;
		this.score = score;
		this.tStamp = tStamp;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Timestamp gettStamp() {
		return tStamp;
	}

	public void settStamp(Timestamp tStamp) {
		this.tStamp = tStamp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cId;
		result = prime * result + score;
		result = prime * result + ((tStamp == null) ? 0 : tStamp.hashCode());
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
		Scores other = (Scores) obj;
		if (cId != other.cId)
			return false;
		if (score != other.score)
			return false;
		if (tStamp == null) {
			if (other.tStamp != null)
				return false;
		} else if (!tStamp.equals(other.tStamp))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Scores [userId=" + userId + ", cId=" + cId + ", score=" + score + ", tStamp=" + tStamp + "]";
	}
}
