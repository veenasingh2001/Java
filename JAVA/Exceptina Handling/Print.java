import java.util.Scanner;

public class Print{

    public static void myName(String name,int age,int roll){
    
   // System.out.print("your name is :");
    System.out.println("name : "+name);
    System.out.println("age : "+age);
    System.out.println("roll : "+roll);
    return ;
    }
public static  void main(String args[]) {
    System.out.print("your name is : ");

    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int age = 15;
    int roll = 1;
   // name = "veena";
   //System.out.print("your name is :");

    myName(name,age,roll) ;
    
}
}