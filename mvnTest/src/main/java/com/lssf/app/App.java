package com.lssf.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.lssf.db.DBUtil;
import com.lssf.model.Course;
import com.lssf.poi.ToExcel;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<Course> loc = new ArrayList<Course>();

		try {
			ToExcel.CreateExcelDemo1();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			Connection conn = DBUtil.getConn();
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM course";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Course c = new Course(rs.getString("Cno"), rs.getString("Tno"), rs.getString("Cname"));
				loc.add(c);
				 System.out.println(c);
				 System.out.println("--------------------");

				// Gson gson = new Gson();
				// String json = gson.toJson(c);
				// System.out.println(json);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ToExcel.CourseToExcel(loc);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
