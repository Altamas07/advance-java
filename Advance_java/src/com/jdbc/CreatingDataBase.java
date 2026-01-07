package com.jdbc;

import java.sql.*;

public class CreatingDataBase {

	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/college";
		String userName="root";
		String password="root";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		
		System.out.println("LOaded ");
		
		Statement st = con.createStatement();

		String s="CREATE DATABASE  hashim";
		
		st.executeUpdate(s);
		
		System.out.println("data base created succesfully");
		
		con.close();
		
	}
}
