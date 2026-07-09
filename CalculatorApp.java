import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {

            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 6) {
                break;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice, please try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {

                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;

                case 5:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot perform modulus by zero.");
                    } else {
                        System.out.println("Result: " + (num1 % num2));
                    }
                    break;
            }
        }

        sc.close();
    }
}
