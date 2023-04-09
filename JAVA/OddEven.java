import java.util.Scanner;

public class OddEven {
    public static void main(String args[]){
        
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);       //this is a vacant house . if any one want room then enter his address

        int num = sc.nextInt();                   // num want room so he enter his address(sc.nextint)
        if((num%2==0)){
            System.out.println("Even number");
        }
       else{
        System.out.println("Odd number");
       }
    }
}
