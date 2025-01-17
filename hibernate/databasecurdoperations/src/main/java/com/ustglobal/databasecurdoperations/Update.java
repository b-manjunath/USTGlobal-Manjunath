package com.ustglobal.databasecurdoperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//import com.mysql.jdbc.Driver;

public class Update {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//step1:- load the driver class
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");    //its optional

			//step2:-get the connection
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);


			//step3:-issue sql query
			String sql = "update employee_info set name='rahul' ,salary=50000 ,gender='m' where id=?";
			pstmt = conn.prepareStatement(sql);
			System.out.println("enter id");
			Scanner s = new Scanner(System.in) ;
			int id = s.nextInt();
			pstmt.setInt(1, id);

			int Count = pstmt.executeUpdate();
			System.out.println(Count+ "row(s) updated");


		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//step5:- close all jdbc objects
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}

		}
	}
}





