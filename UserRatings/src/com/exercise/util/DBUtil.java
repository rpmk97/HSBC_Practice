package com.exercise.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	static Connection connection = null;

	public static void open(String driver,String url) {
		try {

			Class.forName(driver);
			connection = DriverManager.getConnection(url);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection get() {
		return DBUtil.connection;
	}
}
