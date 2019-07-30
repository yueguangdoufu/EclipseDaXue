package com.lssf.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.lssf.db.DBUtil;

public class App {
	
	public static void main(String[] args) throws SQLException{
		
		//访问数据库
		List<Student> ls = accessMysql();
		for(Student student : ls) {
			System.out.println(student);
		}
		
		Gson gson = new Gson();
		String json = gson.toJson(ls); 
		System.out.println(json);
	}

	private static List<Student> accessMysql() throws SQLException {
		List<Student> ls = new ArrayList<Student>();
		
		Connection conn = DBUtil.getConn();
		Statement stmt = conn.createStatement();
		String sql = "select * from student";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			ls.add(new Student(rs.getString("sno"),rs.getString("sname"),rs.getString("ssex"),rs.getString("sbirthday"),rs.getString("class")));
		}
		return ls;
	}
}
