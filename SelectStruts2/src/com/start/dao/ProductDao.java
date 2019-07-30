package com.start.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.start.pojo.Product;
import com.start.util.Util;

public class ProductDao {
	
	Connection connection = new Util().getConnection();
	
	public List<Product> select(){
		
		List<Product> list = new ArrayList<>();
		String sql = "select * from product";
		
		try {
			Statement statement =  connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String br_code = rs.getString("br_code");
				float price = rs.getFloat("price");
				String producer = rs.getString("producer");
				
				Product product = new Product(id,name,br_code,price,producer);
				list.add(product);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	

}
