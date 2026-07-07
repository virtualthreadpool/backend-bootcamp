import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        int num1, num2, operation;
        char choice = 'Y';

        while (choice == 'Y' || choice == 'y') {

            System.out.println("======");
            System.out.print("Enter First Number : ");
            num1 = sc.nextInt();

            System.out.print("Enter Second Number : ");
            num2 = sc.nextInt();

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Choose Operation : ");
            operation = sc.nextInt();

            cal.calculate(num1, num2, operation);

            System.out.print("Do you want to continue? (Y/N) : ");
            choice = sc.next().charAt(0);
        }

        System.out.println("==Thank You==");
        sc.close();
    }

    void calculate(int a, int b, int operation) {
        switch (operation) {

            case 1:
                System.out.println("Answer = " + (a + b));
                break;

            case 2:
                System.out.println("Answer = " + (a - b));
                break;

            case 3:
                System.out.println("Answer = " + (a * b));
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Division by Zero is not Possible.");
                } else {
                    System.out.println("Answer = " + (a / b));
                }
                break;

            default:
                System.out.println("Invalid Choice! Please choose b/w 1 to 4.");
        }
    }
}