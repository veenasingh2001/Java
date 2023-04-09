package Assingment1;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String args[]){
        int num,fact=0;

        Scanner sc = new Scanner(System.in);
         num = sc.nextInt();

       for(int i=1;i<=num;i++){
          if( num%i==0){
            fact++;
        }
    }
            if(fact==2){
                System.out.println(" prime num"); }
                else{
                    System.out.println("not prime num");
                }
        }
    }

