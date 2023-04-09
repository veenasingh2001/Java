package Assingment1;

import java.util.Scanner;

public class Positive {
    public static void main(String args[]){
        System.out.println("enter a number to check positive num.");
        Scanner sc = new Scanner(System.in);
        int num = sc .nextInt();
        if(num>0){
            System.out.println(num+" positive number.");
        }else{
            System.out.println(num+ " Not positive number.");
        }
    }
}
