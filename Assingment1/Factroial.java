package Assingment1;
import java.util.Scanner;

public class Factroial {
    static int fact(int num){
    //public int fact(int num){                       // in case public 
        int prod = 1;
        for(int i=2; i<=num; i++){
            prod = prod * i;
        }
        return prod;
    }

    public static void main(String args[]){
        System.out.print("Enter a number to find factorial : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       // Factroial ft = new Factroial();                     //class objt muct creat(public).
        
       // System.out.println("factorial " +ft. fact(num));          calling to (non static) public method
       System.out.println("factorial : " +fact(num) );

    }
}
