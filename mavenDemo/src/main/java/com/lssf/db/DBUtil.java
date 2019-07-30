package com.lssf.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static String DRIVERNAME = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost:3306/lssf?characterEncoding=utf8";
	public static String USER = "root";
	public static String PASSWORD = "123456";

	public static Connection conn = null;

	static {
		try {
			Class.forName(DRIVERNAME);
		} catch (Exception e) {
		}
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException ex) {
		}
	}

	public static Connection getConn() {
		return conn;
	}

}
