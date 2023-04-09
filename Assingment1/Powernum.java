package Assingment1;

import java.util.Scanner;

public class Powernum {
    static int pow(int base,int expo){
        int power = 1;
        for(int i = 1;i<=expo; i++){
         power = base * base;
        }
        return power;
    }

    public static void main(String args[]){
        int base,expo;
        System.out.println("Enter any two num to calculte power");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base :");
        base= sc.nextInt();

        System.out.print("Enter exponent :");
        expo = sc.nextInt();
      
        int result =pow(base, expo);
        System.out.println(base+ " to the power "+expo+ " is "+ result);
    }
}
