import java.util.Scanner;

public class Calculator {

    public void startCalculator() {

        Scanner sc = new Scanner(System.in);
        int restart = 1;

        while (restart == 1) {

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1)
                System.out.println("Result = " + (num1 + num2));

            else if (choice == 2)
                System.out.println("Result = " + (num1 - num2));

            else if (choice == 3)
                System.out.println("Result = " + (num1 * num2));

            else if (choice == 4)
                System.out.println("Result = " + (num1 / num2));

            else
                System.out.println("Invalid Choice");

            System.out.print("Restart? (1-Yes / 2-No): ");
            restart = sc.nextInt();
        }

        System.out.println("Thank You!");
        sc.close();
    }
}