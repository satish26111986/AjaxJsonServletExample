package com.home.mvc.db;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
	
	public static void main(String[] args) throws Exception {
		System.err.println(getConnection());
	}
	public static Connection getConnection() throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "root");
		
		return connection;
		
	}

}
