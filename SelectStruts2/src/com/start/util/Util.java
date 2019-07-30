package com.start.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
	
	private static String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Store";
	private static String user = "root";
	private static String pwd = "123456";
	public static Connection connection = null;
	
	static {
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url,user,pwd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() {
		return connection;
	}

}
