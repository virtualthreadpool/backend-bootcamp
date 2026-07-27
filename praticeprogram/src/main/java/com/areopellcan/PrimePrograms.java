package com.areopellcan;


public class PrimePrograms {

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrimes(int n) {

        System.out.println("Prime Numbers:");

        for (int i = 2; i <= n; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}