package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertWithCSVFile {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values(?,?,?,?)";

		try (FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in); 
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			while(reader.ready()) {
				String line = reader.readLine();
				String[] datas = line.split(",");
				int id = Integer.parseInt(datas[0]);
				String name = datas[1];
				int salary = Integer.parseInt(datas[2]);
				String gender = datas[3];

				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, salary);
				pstmt.setString(4, gender);

				//int count = pstmt.executeUpdate();              
				//System.out.println(count+"Rows(s) Inserted");  //without using this we use addBatch() method
				pstmt.addBatch();
			}//end of while loop
			int[] counts = pstmt.executeBatch();
			System.out.println(counts.length + "Rows inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}//end of try/catch block
	}//emd of main
}//end of class
