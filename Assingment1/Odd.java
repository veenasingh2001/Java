package Assingment1;
import java.util.Scanner;

class Odd{
    public static void main(String args[]){
        
        System.out.print("Enter nth term to check odd number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       // for(int i=1;i<=num;i++){
           // if(i%2==0)
           if(num % 2==0){
                System.out.println( num+ "  Even number.");
            }else{
                System.out . println(num+ " odd num.");
            }
        } 
    }
//}