import java.util.Scanner;
abstract class Calculator {
    abstract int calculate(int a, int b);
    abstract String getOperation();
}
// Encapsulation
class Numbers {
    private int num1;
    private int num2;
    public void setNum1(int num1) 
    {
        this.num1 = num1;
    }
    public void setNum2(int num2) 
    {
        this.num2 = num2;
    }
    public int getNum1() 
    {
        return num1;
    }
    public int getNum2() 
    {
        return num2;
    }
}

// Inheritance
class Addition extends Calculator 
{
    int calculate(int a, int b) 
    {
        return a + b;
    }
    String getOperation() 
    {
        return "Addition";
    }
}

class Subtraction extends Calculator 
{
    int calculate(int a, int b) 
    {
        return a - b;
    }

    String getOperation() 
    {
        return "Subtraction";
    }
}

class Multiplication extends Calculator 
{
    int calculate(int a, int b) 
    {
        return a * b;
    }

    String getOperation() 
    {
        return "Multiplication";
    }
}

class Division extends Calculator 
{
    int calculate(int a, int b) 
    {
        if (b == 0) 
        {
            System.out.println("Division by zero is not possible.");
            return 0;
        }
        return a / b;
    }

    String getOperation() 
    {
        return "Division";
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Numbers n = new Numbers();
        while (true) 
        {
            System.out.println("\n===== Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            if (choice == 5) 
            {
                System.out.println("Calculator Closed.");
                break;
            }

            System.out.print("Enter First Number: ");
            n.setNum1(sc.nextInt());

            System.out.print("Enter Second Number: ");
            n.setNum2(sc.nextInt());

            Calculator cal;
            cal = switch (choice) 
            {
                case 1 -> new Addition();
                case 2 -> new Subtraction();
                case 3 -> new Multiplication();
                case 4 -> new Division();
                default -> {
                    System.out.println("Invalid Choice");
                    continue;
                }
            };

            int result = cal.calculate(n.getNum1(), n.getNum2());

            System.out.println(cal.getOperation() + " Result = " + result);
        }

        sc.close();
    }
}
