import java .util.*;
public class Marks{
     public static void main(String args[]) {
        System.out.print("size : ");
        Scanner sc = new Scanner(System.in );
        int size= sc.nextInt();
        int number[]= new int[size];
         //take input 
         for(int i = 0;i<size;i++){
            number[i]=sc.nextInt();
            System.out.println("num :");

         }
         //give output 
        for(int i = 0;i<size;i++){
            System.out.println(number[i]);
        }
        
    }
}