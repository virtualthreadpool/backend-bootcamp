package com.aeropelican;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        int choice;

        do {

            System.out.println("\n========== Employee Management System ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> employeeService.addEmployee();

                case 2 -> employeeService.viewEmployees();

                case 3 -> employeeService.updateEmployee();

                case 4 -> employeeService.deleteEmployee();

                case 5 -> System.out.println("Thank You!");

                default -> System.out.println("Invalid Choice!");

            }

        } while (choice != 5);

        sc.close();
    }
}