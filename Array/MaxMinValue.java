import java.util.Scanner;

public class MaxMinValue {
    public static void main(String args[]){
        int number[] = {3,7,9,4};

        int Largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        

        for(int i=0; i<number.length; i++){
            if(number[i] > Largest){
                Largest = number[i];
            }
            if(number[i] < smallest){
                smallest = number[i];
            }
        }
        System.out.println("Largest number : " + Largest);  
        System.out.println("Smallest number : " + smallest);

   } 
 }

