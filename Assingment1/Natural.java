package Assingment1;

import java.util.Scanner;

 class Whole extends Natural{
    static void naturalNum(int num){
        for(int i = 1; i<=num;i++){
            System.out.println("natural number is : "  +i);
        } 
    }
}
public class Natural {
    public static void main(String args[]){
        System.out.println("Enter nth term to check n natural number  ");
        Scanner sc = new Scanner(System.in);
        int num = sc. nextInt();

        Whole w = new Whole();
        w.naturalNum( num);
    
    }
}
