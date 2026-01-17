package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInputTransactionFlow {

	private static String url="jdbc:mysql://localhost:3306/bank";
	private static String userName ="root";
	private static String password="root" ;
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Connection con=null;
		
		
		try {
			 con=DriverManager.getConnection(url,userName,password);
			
			
			 con.setAutoCommit(false);
			 
			 System.out.println("enter your accnum to debit money ");
			 int accnum=sc.nextInt();
			 
			 System.out.println("enter your account to deposit ");
			 
			 int accnum1=sc.nextInt();
			 
			 
			 System.out.println("Enter your amount ");
			 double amount=sc.nextDouble();
			 
			 
			 // checking 
			 
			 String query="SELECT balance FROM user WHERE acc_num=?";
			 
			 PreparedStatement checkba=con.prepareStatement(query);
			 
			 checkba.setInt(1, accnum);
			 
			 ResultSet set = checkba.executeQuery();
			 
			 if(set.next()) {
				 
				 int balance=set.getInt("balance");
				 
				 
				 if(balance>=amount) {
					 
					 
					 String query1="UPDATE user SET balance=balance-? WHERE acc_num=? ";
					 String query2="UPDATE user SET balance=balance+? WHERE acc_num=? ";
					 
					 
					 PreparedStatement debit=con.prepareStatement(query1);
					 PreparedStatement credit=con.prepareStatement(query2);
					 
					 
					 debit.setDouble(1, amount);
					 debit.setInt(2, accnum);
					 
					 
					 credit.setDouble(1, amount);
					 credit.setInt(2, accnum1);
					 
					 debit.executeUpdate();
					 credit.executeUpdate();
					 
					 
					 con.commit();
					 
					 System.out.println("TRANSACTION SUCCESFULL");
					 
				 }
				 else {
					 
					 con.rollback();
					 
					 System.out.println("insufficient balanace ");
				 }
			 }
		} catch (Exception e) {
			
			try {
				
				if(con!=null) {
					
					con.rollback();
					System.out.println("Transaction failed ");
				}
			}
			catch(SQLException ex) {
				
				ex.printStackTrace();
			}
		}
		finally {
			
			try {
				
				if(con!=null) {
					

					con.setAutoCommit(true);
					
					con.close();
				}
			}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
}