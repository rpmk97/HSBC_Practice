package com.userfeedback.model;

public class UserRatings {

	String userName, date, comment;
	int userId, rating;

	public UserRatings(String userName, String date, String comment, int userId, int rating) {
		super();
		this.userName = userName;
		this.date = date;
		this.comment = comment;
		this.userId = userId;
		this.rating = rating;
	}

	public UserRatings(String userName, String date, String comment, int rating) {
		super();
		this.userName = userName;
		this.date = date;
		this.comment = comment;
		this.rating = rating;
	}

	public UserRatings() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "UserRatings [userName=" + userName + ", date=" + date + ", comment=" + comment + ", userId=" + userId
				+ ", rating=" + rating + "]";
	}
	
}
