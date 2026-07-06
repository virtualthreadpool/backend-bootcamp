package com.aeropelican;


import java.util.*;

/**
 * List > ArrayList, Vector, LinkedList, Stack
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<<< Welcome to student database >>>");
        System.out.println("Please type student name below and press enter to store it database.");


        List<String> studentNameList = new ArrayList<>();

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Ram");

        int[] arr2 = new int[22];

        while (true) {
            String studentName = scanner.nextLine();
            System.out.println("Received student name is - " + studentName);
            System.out.println("Trying to store the name in database.");


            studentNameList.add(studentName);

            System.out.println("Student name loaded into database");

            System.out.println("Total available names: " + studentNameList.size());

            System.out.println("Type below and press enter to add another name");
        }
    }
}