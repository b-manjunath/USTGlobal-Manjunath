package com.ustglobal.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		Connection conn =null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3307/manju?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql ="delete from project where id = 1";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			System.out.println(count+"record delete");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
