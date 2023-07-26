package com.training.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main2 {

	public static void main(String[] args) {
		Properties properties=new Properties();
		
		try {
			InputStream in=new FileInputStream("jdbc.properties");
			properties.load(in);
			
			System.out.println("Database URL : "+ properties.getProperty("app.database.url"));
			System.out.println("Database User Name : "+ properties.getProperty("app.database.username"));
			System.out.println("Database Password : "+ properties.getProperty("app.database.password"));
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
