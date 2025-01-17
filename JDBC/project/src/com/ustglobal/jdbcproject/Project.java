package com.ustglobal.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Project {
	public static void main(String[] args) {

		Connection conn = null;
		int itemid,noofitems=0,i;
		System.out.println("chosee 1,2,3 or 4 ");
		System.out.println("Insert 1 to see  menu");
		System.out.println("Insert 2 to see  order");
		System.out.println("Insert 3 to see  select food");
		System.out.println("Insert 4 to see  total bill of data");
		Scanner sc = new Scanner(System.in);
		int userinput = sc.nextInt();
		LinkedList<Integer> l=new LinkedList<Integer>();

		if(userinput==1) {
			//need to display menu to user
			PreparedStatement pstmt = null;
			ResultSet rs =null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3307/manju?user=root&password=root";
				conn = DriverManager.getConnection(url);
				String sql = "select * from Hotel_Bill";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery(sql);
				while(rs.next()) {
					int itemcode = rs.getInt("Item_Code");
					String foodname = rs.getString("Food_Name");
					int price = rs.getInt("Price");
					System.out.println("Item_Code : "+itemcode);
					System.out.println("Food_Name : "+foodname);
					System.out.println("Price : "+price);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(conn!=null) {
						conn.close();
					}if(pstmt!=null) {
						pstmt.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			System.out.println("*************************");
			userinput=2;
		} 

		if(userinput==2) {
			//need to take order from user
			System.out.println("place your order sir");
			System.out.println("Enter the number of items you want :");

			noofitems=sc.nextInt();	//3
			for( i=1;i<=noofitems;i++)
			{
				System.out.println("enter item id");	

				itemid=sc.nextInt();
				l.add(	itemid);
			}
			System.out.println("press 0 to close your order");
			int x=sc.nextInt();
			if(x==0)
			{
				System.out.println("items you ordered");
				for(int a:l)
				{
					System.out.println(a);
				}
			}
			System.out.println("press 3 to add,remove,modify items");
			System.out.println("press 4 for bill...");
			userinput=sc.nextInt();
		}

		if(userinput==3) {
			System.out.println("Enter A,B or C");
			System.out.println("Enter A to add the food item");
			System.out.println("Enter B to remove food item");
			System.out.println("Enter C modify food item");
			String input =sc.next();

			if(input.equals("A"))
			{
				System.out.println("add additional items");
				System.out.println("enter the no. of items you want to add");
				int enditem=0;
				enditem=sc.nextInt();
				for( i=1;i<=enditem;i++)
				{
					System.out.println("enter item id");	
					itemid=sc.nextInt();
					l.add(	itemid);
				}
				System.out.println("items you ordered");
				for(int a:l)
				{
					System.out.println(a);
				}
			}
			System.out.println("************************");

			if(input.equals("B"))
			{
				System.out.println("remove additional items");
				System.out.println("enter the no. of items you want to deleted");
				int enditem=0;
				enditem=sc.nextInt();
				for( i=1;i<=enditem;i++)
				{
					System.out.println("enter item id");	
					itemid=sc.nextInt();
					l.remove(itemid);
				}
				System.out.println("items you ordered");
				for(int a:l)
				{
					System.out.println(a);
				}
			}
			System.out.println("*****************************");

			if(input.equals("C"))
			{
				//modify
				System.out.println("modefy the items");
				System.out.println("enter the no. of items you want to modefy");
				int enditem=0;
				enditem=sc.nextInt();
				for( i=1;i<=enditem;i++)
				{
					System.out.println("enter modefy id");	
					itemid=sc.nextInt();
					System.out.println("enter new id");
					itemid=sc.nextInt();
					l.add(itemid);
				}
				System.out.println("items you modefied ordered");
				for(int a:l)
				{
					System.out.println(a);
				}
			}
		}
		System.out.println("press 4 for bill...");
		userinput=sc.nextInt();

			if(userinput==4) {
				System.out.println("add the bill cost");
				PreparedStatement pstmt = null;
				ResultSet rs =null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3307/manju?user=root&password=root";
					conn = DriverManager.getConnection(url);
					String sql = "select * from Hotel_Bill";
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery(sql);
					int sum=0;
					while(rs.next()) {
						int itemcode = rs.getInt("Item_Code");
						int price = rs.getInt("Price");
						for(i=0;i<l.size();i++) {
							if(l.get(i)==itemcode)
								sum+=price;
						}
					}
					System.out.println("Total bill is :"+sum);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

