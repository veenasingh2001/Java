import java.util.Scanner;

public class Prime {

    public static void main (String args[]){


       System.out.println("Enter any number: ");  
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

       if((num % 2==0) && (num>2) ){
        System.out.println("not a prime number");
       }
       else{
        System.out.println("prime num");


    }
    
    
}
}