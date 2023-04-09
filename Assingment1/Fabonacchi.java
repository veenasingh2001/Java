package Assingment1;

import java.util.Scanner;

public class Fabonacchi {
    public static void main(String args[]){
        System.out.print("Enter a term for fabonachi series : ");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         fab(num);
           
    }
    public static void fab(int num){
        int firstNum = 0;
        int secondNum = 1;
        int nextN = firstNum + secondNum;

        System.out.print(firstNum+" "+secondNum);
        for(int i=0; i<=num; i++){
              nextN = firstNum+secondNum;
              System.out.print( " "+nextN+" ");
        
        firstNum = secondNum;
        secondNum = nextN;}
    }
}
