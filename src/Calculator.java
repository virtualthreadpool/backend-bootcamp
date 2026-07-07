import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Welcome Calculator");

        while (true) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            char operator;
            while (true) {
                System.out.print("Enter an operator (+, -, *, /): ");
                operator = scanner.next().charAt(0);

                if ("+-*/".indexOf(operator) != -1) {
                    break;
                } else {
                    System.out.println("Invalid\nplease enter correct details\n");
                }
            }

            switch (operator) {
                case '+' -> System.out.printf("\nresult: %.2f + %.2f = %.2f%n", num1, num2, (num1 + num2));
                case '-' -> System.out.printf("\nresult: %.2f - %.2f = %.2f%n", num1, num2, (num1 - num2));
                case '*' -> System.out.printf("\nresult: %.2f * %.2f = %.2f%n", num1, num2, (num1 * num2));
                case '/' -> {

                    if (num2 != 0) {
                        System.out.printf("\nresult: %.2f / %.2f = %.2f%n", num1, num2, (num1 / num2));
                    } else {
                        System.out.println("\nError: Division by zero is not allowed.\nplease enter correct details");
                    }
                }
            }
            System.out.println();
    }
    }
}