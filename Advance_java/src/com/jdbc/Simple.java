package com.jdbc;

import java.sql.*;

public class Simple {

	public static void main(String[] args) throws Exception {
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		   String url="jdbc:mysql://localhost:3306/college";
		   String username="root";
	       String password="root"; 
		Connection con = DriverManager.getConnection(url,password,username);
		
			    System.out.println("loaded succesfully");
			    
  PreparedStatement statement = con.prepareStatement("INSERT INTO student VALUES (101, 'HADF',23,'Mumbai','A') ");
			    
         statement.executeUpdate();
         
	}
}
