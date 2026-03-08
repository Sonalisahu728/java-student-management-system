package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentManagement {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

                        Class.forName("com.mysql.cj.jdbc.Driver");

            
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_management",
                    "root",
                    "sona123");

                        stmt = con.createStatement();

            
            rs = stmt.executeQuery("SELECT * FROM students");

                        while (rs.next()) {

                int id = rs.getInt("student_id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");
                String email = rs.getString("email");

                System.out.println(id + " " + name + " " + age + " " + course + " " + email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}