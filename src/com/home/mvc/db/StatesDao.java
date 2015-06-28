package com.home.mvc.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StatesDao {
	
	
	
	public StatesDao() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Connection getConnection() throws Exception {
		return ConnectionFactory.getConnection();

	}
	
	
	private List<String> getStatesfromDB() {
		
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			System.err.println("I am int"+connection);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {

			PreparedStatement preparedStatement = connection.prepareStatement("select * from employee where name = ?");
			preparedStatement.setString(1,"satish");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				System.out.println(resultSet.getString("hometown"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		// TODO Auto-generated method stub

	}
	

}
