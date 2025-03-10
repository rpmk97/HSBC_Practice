package com.exercise.userRatingsService;

import java.util.List;

import com.exercise.userRatingsDao.UserRatingsDao;
import com.exercise.userRatingsModel.UserRatings;
import com.exercise.util.DBUtil;

public class UserRatingsService {

	UserRatingsDao userRatingsDao = new UserRatingsDao();

	void addUserRating(String username, int rating, String comment) {

		DBUtil.open();
		this.userRatingsDao.setConnection(DBUtil.get());

		userRatingsDao.saveUserRating(username, rating, comment);
	}

	List<UserRatings> listAll() {

		DBUtil.open();
		this.userRatingsDao.setConnection(DBUtil.get());

		return this.userRatingsDao.selectAll();
	}

	float averageRating() {

		DBUtil.open();
		this.userRatingsDao.setConnection(DBUtil.get());

		return this.userRatingsDao.getAverage();

	}

	int userCount() {

		DBUtil.open();
		this.userRatingsDao.setConnection(DBUtil.get());

		return this.userRatingsDao.getTotalUsers();

	}

}