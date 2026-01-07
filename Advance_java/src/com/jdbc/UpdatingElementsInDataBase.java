package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdatingElementsInDataBase {
	
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
			
			String query ="UPDATE student SET subject='MATH' WHERE id=26";
			
			Statement st=con.createStatement();
			
			st.executeUpdate(query);
			
			System.out.println("Updated succesfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
