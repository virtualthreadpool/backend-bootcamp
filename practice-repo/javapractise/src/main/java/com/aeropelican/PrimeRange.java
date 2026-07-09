package com.aeropelican;

import java.util.Scanner;

public class PrimeRange {
    public void printPrimes(){
        Scanner Scanner =new Scanner(System.in);
        System.out.print("Enter a N: ");
        int n = Scanner.nextInt();
        System.out.println("Prime Number: ");
        for (int i = 2; i <=n; i++){
            boolean prime = true;
            for (int j = 2; j<=i/2; j++){
                if(i % j ==0 ){
                    prime = false;
                    break;

                }
            }
            if(prime)System.out.print(i + "");

        }
        System.out.println();


    }
}
