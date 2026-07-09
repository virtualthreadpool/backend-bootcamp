package com.aeropelican;

import java.util.Scanner;

public class SumArray {
    public void sum() {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = Scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = Scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of Elements: " + sum);
    }
}
