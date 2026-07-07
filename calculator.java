import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        calculator obj=new calculator();
        char ch='y';
        while(ch=='y' || ch=='Y'){
            System.out.println("Enter your First Number:");
            double n1=sc.nextDouble();

            System.out.println("Enter your Secount Number:");
            double n2=sc.nextDouble();
            char op;
            while (true){
                System.out.println("Enter your operator ( +, -, *, /, % ):");
                op=sc.next().charAt(0);
                if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                    break;
                }else{
                    System.out.println("Invalid operators");
                }
            }
            obj.calculator(n1,n2,op);

            System.out.println("Do you want to continue? (Y?/N):");
            ch=sc.next().charAt(0);
        }
        System.out.println("Calculator is Closed");
    }
    public void calculator(double n1,double n2,char op){
        if(op == '+'){
            System.out.println("Result : "+(n1+n2));
        }else if(op == '-'){
            System.out.println("Result : "+(n1-n2));
        }else if(op == '*'){
            System.out.println("Result : "+(n1*n2));
        }else if(op == '/'){
            if(n2!=0){
                System.out.println("Result : "+(n1/n2));
            }else{
                System.out.println("Can't divide by Zero");
            }
        }else if(op == '%'){
            System.out.println("Result : "+(n1%n2));
        }
    }
}
