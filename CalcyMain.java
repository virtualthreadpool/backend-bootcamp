package CalcyEnhance;

import java.util.Scanner;

public class CalcyMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        Scanner scn = new Scanner(System.in);
        Boolean isBoolean = false;
        while (!isBoolean) {
            System.out.println("Please enter first number: ");
            double fno = scn.nextDouble();
            System.out.println("Please enter second number: ");
            double sno = scn.nextDouble();
            System.out.println("Enter an operator:");
            System.out.println("+ for Addition");
            System.out.println("- for Subtraction");
            System.out.println("* for Multiplication");
            System.out.println("/ for Division");
            char ch = scn.next().charAt(0);
            switch (ch) {
                case '+' -> {
                    Addition add = new Addition(fno, sno);
                    add.addition();
                }
                case '-' -> {
                    Subtraction sub = new Subtraction(fno, sno);
                    sub.subtraction();
                }
                case '*' -> {
                    Multiplication mul = new Multiplication(fno, sno);
                    mul.multiplication();
                }
                case '/' -> {
                    Division div = new Division(fno, sno);
                    div.division();
                }

                default -> System.out.println("Invalid Operator");
            }
                System.out.println(".............END............");

        }

}
}