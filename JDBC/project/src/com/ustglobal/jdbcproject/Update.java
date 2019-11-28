package com.ustglobal.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Update {
	public static void main(String[] args) {
		Connection conn =null;
		Statement stmt =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3307/manju?user=root&password=root";
			
			conn=DriverManager.getConnection(url);
			String sql ="update project set name='raj',phno=55555,address='atp' where id =1";
			
			stmt = conn.createStatement();
			
			int count = stmt.executeUpdate(sql);
			System.out.println(count+"rows updated");

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}
			}catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
}

