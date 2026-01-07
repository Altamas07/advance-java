package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class CrudOperation {

    private static String url = "jdbc:mysql://localhost:3306/altamash";
    private static String userName = "root";
    private static String password = "root";

    public static void main(String[] args) {

        int choice;

        try (
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection(url, userName, password)
        ) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            do {
                System.out.println("\n1- Insert");
                System.out.println("2- Update");
                System.out.println("3- Delete");
                System.out.println("4- View");
                System.out.println("5- Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
                sc.nextLine(); // buffer clear

                switch (choice) {

                    // INSERT
                    case 1: {
                        System.out.print("Enter id: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        String sql = "INSERT INTO khan VALUES (?, ?)";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, id);
                        ps.setString(2, name);
                        ps.executeUpdate();

                        System.out.println("✅ Inserted");
                        break;
                    }

                    // UPDATE
                    case 2: {
                        System.out.print("Enter id: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter new name: ");
                        String name = sc.nextLine();

                        String sql = "UPDATE khan SET name=? WHERE id=?";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setString(1, name);
                        ps.setInt(2, id);
                        ps.executeUpdate();

                        System.out.println("✅ Updated");
                        break;
                    }

                    // DELETE
                    case 3: {
                        System.out.print("Enter id: ");
                        int id = sc.nextInt();

                        String sql = "DELETE FROM khan WHERE id=?";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, id);
                        ps.executeUpdate();

                        System.out.println("✅ Deleted");
                        break;
                    }

                    // VIEW
                    case 4: {
                        String sql = "SELECT * FROM khan";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ResultSet rs = ps.executeQuery();

                        System.out.println("\nID   NAME");
                        System.out.println("-----------");

                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + "   " + rs.getString(2));
                        }
                        break;
                    }

                    case 5:
                        System.out.println("👋 Program exited");
                        break;

                    default:
                        System.out.println("❌ Invalid choice");
                }

            } while (choice != 5);

            sc.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
