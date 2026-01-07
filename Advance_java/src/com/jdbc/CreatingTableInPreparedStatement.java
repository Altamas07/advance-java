package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreatingTableInPreparedStatement {

	private static String url="jdbc:mysql://localhost:3306/hashim";
	private static String userName ="root";
	private static String password="root";
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			Connection con=DriverManager.getConnection(url,userName,password);
			
			String query=("CREATE TABLE khan(id INT PRIMARY KEY, name VARCHAR(50))");
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.execute();
			
			System.out.println("table created ");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
