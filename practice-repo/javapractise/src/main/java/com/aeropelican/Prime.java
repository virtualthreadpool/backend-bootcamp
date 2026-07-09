package com.aeropelican;

import java.util.Scanner;

public class Prime {
    public void checkPrime(){

        Scanner Scanner =new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = Scanner.nextInt();
        boolean prime = true;

        if (n <= 1){
            prime = false;
        } else {
            for (int i = 2; i <= n/2; i++){
             if (n % i == 0){
                 prime = false;
                 break;
             }
            }
        }

        if (prime)
            System.out.println(n + "is Prime");
        else
            System.out.println(n + "is Not Prime");
    }
}
