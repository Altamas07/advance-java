package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertingElementIntTableByPreparedStatement {

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
			Connection con =DriverManager.getConnection(url,userName,password);
			
			String query="INSERT INTO khan VALUES(?,?)";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, 1);
			ps.setString(2, "English");
			
			ps.executeUpdate();
			
			System.out.println("inserted succesfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
