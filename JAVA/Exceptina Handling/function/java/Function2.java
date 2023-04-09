package function.java;

import java.util.Scanner;

public class Function2 {
    public static int factorial(int num){
        int sum = 1;
        for(int i = 2;i<= num;i++){
             sum = i * sum;
        }
        return sum;
    }
    public static void main ( String args[]){
        System.out.println("FACTORIAL");
        Scanner sc = new Scanner(System.in);
        System.out.print("num :");
        int num= sc.nextInt();

        System.out.println("factroil of num : "+factorial(num));
        

    }
}
