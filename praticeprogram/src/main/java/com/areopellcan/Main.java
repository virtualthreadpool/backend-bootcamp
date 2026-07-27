package com.areopellcan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========== JAVA PRACTICE PROGRAMS ==========");
            System.out.println("1. Reverse a String");
            System.out.println("2. Check Prime Number");
            System.out.println("3. Print Prime Numbers");
            System.out.println("4. Find Largest Number");
            System.out.println("5. Find Smallest Number");
            System.out.println("6. Find Sum of Array");
            System.out.println("7. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter String: ");
                    String str = sc.nextLine();

                    StringPrograms.reverseString(str);
                }

                case 2 -> {
                    System.out.print("Enter Number: ");
                    int number = sc.nextInt();

                    if (PrimePrograms.isPrime(number)) {
                        System.out.println(number + " is a Prime Number.");
                    } else {
                        System.out.println(number + " is Not a Prime Number.");
                    }
                }

                case 3 -> {
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();

                    PrimePrograms.printPrimes(n);
                }

                case 4 -> {
                    System.out.print("Enter Array Size: ");
                    int size = sc.nextInt();

                    int[] arr = new int[size];

                    System.out.println("Enter Array Elements:");

                    for (int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }

                    System.out.println("Largest Number: " + ArrayPrograms.findLargest(arr));
                }

                case 5 -> {
                    System.out.print("Enter Array Size: ");
                    int size = sc.nextInt();

                    int[] arr = new int[size];

                    System.out.println("Enter Array Elements:");

                    for (int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }

                    System.out.println("Smallest Number: " + ArrayPrograms.findSmallest(arr));
                }

                case 6 -> {
                    System.out.print("Enter Array Size: ");
                    int size = sc.nextInt();

                    int[] arr = new int[size];

                    System.out.println("Enter Array Elements:");

                    for (int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }

                    System.out.println("Sum of Array: " + ArrayPrograms.findSum(arr));
                }

                case 7 -> {
                    System.out.println("Thank You!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}