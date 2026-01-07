package com.jdbc;
import java.sql.*;

public class ViewingDataBaseInConsole {

	private static String url="jdbc:mysql://localhost:3306/college";
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
			
			String query="Select * From student";
			
			Statement st=con.createStatement();
			
			ResultSet ex = st.executeQuery(query);
			
			
			while(ex.next()) {
				
				int id = ex.getInt("id");
				String name = ex.getString("name");
			Double marks	=ex.getDouble("marks");
				String city=ex.getString("city");
				String grade=ex.getString("grade");
				
				System.out.println("ID__"+id);
				System.out.println("NAME__"+name);
				System.out.println("MARKS___"+marks);
				System.out.println("CITY__"+city);
				System.out.println("GRADE__"+grade);
				
				System.out.println("\n");
			}
			
			con.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
