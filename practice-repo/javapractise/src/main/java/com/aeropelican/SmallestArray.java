package com.aeropelican;

import java.util.Scanner;

public class SmallestArray {
    public void smallest() {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = Scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = Scanner.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Smallest Element: " + min);
    }

}
