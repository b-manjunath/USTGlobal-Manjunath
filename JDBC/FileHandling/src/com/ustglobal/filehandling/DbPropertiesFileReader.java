package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class DbPropertiesFileReader {
	public static void main(String[] args) {
		String path = "db.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			
			System.out.println("Url : "+url);
			System.out.println("User : "+user);
			System.out.println("Password : "+password);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
