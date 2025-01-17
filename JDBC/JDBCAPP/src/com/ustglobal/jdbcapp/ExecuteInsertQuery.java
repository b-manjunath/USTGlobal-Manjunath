package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {

			//step 1 :-load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step 2:- get the connection
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step 3:- issue SQL query
			String sql = " insert into employee_info values(6,'kohli',120000,'M') ";  
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			//step 4:- read the result
			System.out.println(count + "Rows inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//step 5:- close all JDBC Objects (costly resources)
			try {
				if(conn != null) {
					conn.close();
				}if(stmt != null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}//end of main()
}//end of executeinsertquery
