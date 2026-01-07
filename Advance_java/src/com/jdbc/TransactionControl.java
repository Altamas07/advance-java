package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionControl {

	private static String url="jdbc:mysql://localhost:3306/bank";
	private static String userName ="root";
	private static String password="root";
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		Connection con=null;
		
		try {
			
			
			 con=DriverManager.getConnection(url,userName,password);
			
			con.setAutoCommit(false);
			
			String query="Update user SET balance=balance-500 WHERE acc_num=101";
			String query1="Update user SET balance=balance+500 WHERE acc_num=102";
			PreparedStatement ps=con.prepareStatement(query);
			PreparedStatement ps1=con.prepareStatement(query1);
			
			
			ps.executeUpdate();
			ps1.executeUpdate();
			
			
			con.commit();
			
			System.out.println("Transaction successfull");
			
		} catch (Exception e) {
			
			try {
				
				if(con!=null) {
					
					con.rollback();
					System.out.println("transaction rolled back ");
					
				}
			}
				catch(SQLException ex){
					
					ex.printStackTrace();
				}
			
			
			}
		
		finally {
			
			try {
				
				if(con!=null){
					
					con.setAutoCommit(true);
					
					con.close();
				}
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
