package Assingment1;

import java.util.Scanner;

public class Divisible {
    public  static void main(String args[]){
        
        System.out.print("Enter First number:");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();

        if(a/b == 0){
            System.out.println(a+  " is divisible by " +b);
        }else{
            System.out.println(a+ " is not divisible by " +b);
        }

    }
}
