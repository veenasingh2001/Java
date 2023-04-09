package function.java;

import java.util.Scanner;

public class Sum {
    public static int add(int num,int num2){
    
        int sum = num + num2;
        return sum;

    }
    public static void main(String args[]){
        System.out.println("ADDITION : " );

        Scanner sc = new Scanner(System.in);
        int num =sc. nextInt();

        int num2 = sc .nextInt();
        int sum = add(num,num2);
        System.out.println(sum);
      //  add(num,num2);
    }
    
}
