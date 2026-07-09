package com.aeropelican;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.reverse();

        Prime prime = new Prime();
        prime.checkPrime();

        PrimeRange pr = new PrimeRange();
        pr.printPrimes();

        LargestArray la = new LargestArray();
        la.largest();

        SmallestArray sa = new SmallestArray();
        sa.smallest();

        SumArray sum = new SumArray();
        sum.sum();



    }
}