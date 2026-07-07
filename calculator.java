import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number 1:");
        double s1=sc.nextDouble();
        System.out.println("enter number 2:");
        double s2=sc.nextDouble();
        System.out.println("enter  operator( +, -, *, /, %):");
        char operator=sc.next().charAt(0);
        calculator obj=new calculator();
        obj.calculator(s1,s2,operator);
    }
    public void calculator(double s1,double s2,char operator){
        if(operator=='*'){
            System.out.println("Result : "+(s1*s2)); 
        }else if(operator=='+'){
            System.out.println("Result : "+(s1+s2));   
        }else if(operator=='-'){
            System.out.println("Result : "+(s1-s2));   
        }else if(operator=='/'){
            if(s2!=0){
            System.out.println("Result : "+(s1/s2));   
            }else{
                System.out.println("can't divide by zero");
            }
        }else if(operator=='%'){
            System.out.println("Result : "+(s1%s2));
        }else{
            System.out.println("invalid operator");
        } 
    }     
}
