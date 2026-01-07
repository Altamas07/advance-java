package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletionFromDatabase {

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
			
			String query="DELETE FROM student WHERE id=23";
			Statement st=con.createStatement();
			
			st.executeUpdate(query);
			System.out.println("Created succesfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
