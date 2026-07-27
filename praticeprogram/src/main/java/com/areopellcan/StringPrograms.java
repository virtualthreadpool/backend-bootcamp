package com.areopellcan;


public class StringPrograms {

    public static void reverseString(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}