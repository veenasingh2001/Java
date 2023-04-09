import java.util.Scanner;

public class Print1 {
    public static void main(String[] args){
        System.out.print("Enter any size : ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

       System.out.println("Enter number ");        
        int num[] = new int[size];              //defining arr with size.

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();                       //input
       }

        for(int i=0; i<size;i++){
            System.out.print(" "+ num[i]);                      //output
        }
    }
}
