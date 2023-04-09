package Assingment1;

import java.util.Scanner;

public class EvenNum {
    public static void main(String args[]){
        System.out.print("Enter a term to check first N even num : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        EvenNum ev = new EvenNum();

       // System.out.println(); 
        ev. display(num);

       // for(int i=1; i<=num; i++){
           // if(i%2==0){
              //  System.out.println(i); }
        }
   // }
     public void display(int num){
        for(int i=1; i<=num; i++){
             if(i%2==0){
               System.out.println("Even num : "+ i); }
            }


    }
}
