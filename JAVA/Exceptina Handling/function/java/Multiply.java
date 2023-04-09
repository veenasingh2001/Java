package function.java;

import java.util.Scanner;

public class Multiply {
    public static int product(int a,int b){
        int prod = a*b;
        return  prod;
    }
    public static void main(String args[]){
        System.out.println("MULTIPLICATION");
        Scanner sc = new Scanner(System.in);
        System.out.print("num1 :");
        int a = sc.nextInt();
        System.out.print("num2 :");
        int b = sc.nextInt();

        int prod = product(a,b);
        System.out.println("result : "+prod);


    }
}
