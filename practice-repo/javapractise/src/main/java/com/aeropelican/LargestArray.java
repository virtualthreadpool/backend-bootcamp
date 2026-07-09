package com.aeropelican;

import java.util.Scanner;

public class LargestArray {

    public void largest() {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = Scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = Scanner.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Largest Element: " + max);
    }
}
