package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreatingTable {

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
			Connection con= DriverManager.getConnection(url,userName,password);
			
			String query="CREATE TABLE employe( id INT  PRIMARY KEY, subject VARCHAR(50))";
			
			Statement st=con.createStatement();
			
			int executeUpdate = st.executeUpdate(query);
			System.out.println("executed");
			//if(executeUpdate>0) {
			//	System.out.println("Tabl");
			//}
			
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
