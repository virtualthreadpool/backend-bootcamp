package com.aeropelican;

import java.util.Scanner;

public class ReverseString {
    public void reverse(){
        Scanner Scanner =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = Scanner.nextLine();

        String rev = "";

        for (int i = string.length() - 1; i >=0; i--) {
            rev = rev + string.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
    }
}
