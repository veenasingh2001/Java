import java.util.Scanner;

public class SumNum {
    public static void main(String args[]){
        System.out.print("num : ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
       // System.out.println("num : ");
        System.out.print("Sum of natural number : ");
        int sum = 0;
        for(int i = 1;i <= num; i++){
            sum = sum + i;
           // System.out.println(sum);
        }
        System.out.println(sum);

        }
    }
    

