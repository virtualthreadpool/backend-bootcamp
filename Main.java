import java.util.*;
abstract class Person {
    String name;
    Person(String name){
        this.name=name;
    }
    abstract void display();
}
interface Sports{
    void play();
}
class Student extends Person implements Sports{
    private int marks;
    static int count=0;
    final String COLLEGE="TKR ENGINEERING COLLEGE";

    Student(String name,int marks){
        super(name);
        this.name=name;
        this.marks=marks;
        count++;
    }
    int getMarks(){
        return marks;
    }
    
    void fee(){
        System.out.println("Fee=50000");
    }
    void fee(int discount){
        System.out.println("Fee after discount="+(50000-discount));
    }
     
    void display(){
        System.out.println("              ");
        System.out.println("Name   :"+name   );
        System.out.println("Marks  :"+marks   );
        System.out.println("College:"+COLLEGE);

        if(marks>=35)
            System.out.println("Result : Pass");
        else
            System.out.println("Result : Fail");
    }
    
    public void play(){
        System.out.println(name+"Plays carrom");
    }
} 
     
    public class Main{
        public static void main(String[]args){

            Scanner sc=new Scanner(System.in);
            ArrayList<Student>list=new ArrayList<>();
            while(true){
                System.out.println("1.Add Student");
                System.out.println("2.Display Students");               
                System.out.println("3.Play Game");
                System.out.println("4.Fee Details");
                System.out.println("5.Total Students");
                System.out.println("6.Exit");
                System.out.println("Enter Choice :");

                int choice=sc.nextInt();
                sc.nextLine();
                
                switch(choice){
                    case 1:
                         System.out.println("Enter Name:");
                         String name=sc.nextLine();
                       
                         System.out.println("Enter marks:");
                         int marks=sc.nextInt();
                        
                        list.add(new Student(name,marks));
                        System.out.println("Student added");
                        break;
                        
                    case 2:
                        if(list.isEmpty()){
                            System.out.println("No students found");
                        }else{
                            for(Student s:list){
                                s.display();
                            }
                        }    
                        break;
                    
                    case 3:
                        if(list.isEmpty()){
                            System.out.println("No students found");
                        }else{
                            for(Student s:list){
                                s.play();
                            }
                        }
                        break;
                    case 4:
                        Student obj=new Student("    ",0);
                        obj.fee();
                        obj.fee(5000);
                        break;
                    case 5:
                        System.out.println("Total Students:"+Student.count);
                        break;
                    case 6:
                        System.out.println("Thankyou");        
                        sc.close();
                        return;
                    
                        default:
                            System.out.println("invalid choice");

                    }
            }
        }
    }
