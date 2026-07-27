package com.aeropelican;

import java.sql.*;
import java.util.Scanner;

public class EmployeeService {

    Scanner sc = new Scanner(System.in);

    // Add Employee
    public void addEmployee() {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO Employee(id,name,department,salary) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter Employee ID : ");
            ps.setInt(1, sc.nextInt());
            sc.nextLine();

            System.out.print("Enter Employee Name : ");
            ps.setString(2, sc.nextLine());

            System.out.print("Enter Department : ");
            ps.setString(3, sc.nextLine());

            System.out.print("Enter Salary : ");
            ps.setDouble(4, sc.nextDouble());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Added Successfully.");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View Employees
    public void viewEmployees() {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM Employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("----------------------------");
                System.out.println("ID         : " + rs.getInt("id"));
                System.out.println("Name       : " + rs.getString("name"));
                System.out.println("Department : " + rs.getString("department"));
                System.out.println("Salary     : " + rs.getDouble("salary"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update Employee Salary
    public void updateEmployee() {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE Employee SET salary=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter Employee ID : ");
            int id = sc.nextInt();

            System.out.print("Enter New Salary : ");
            double salary = sc.nextDouble();

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Updated Successfully.");
            } else {
                System.out.println("Employee Not Found.");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Employee
    public void deleteEmployee() {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM Employee WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter Employee ID : ");
            int id = sc.nextInt();

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Deleted Successfully.");
            } else {
                System.out.println("Employee Not Found.");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}