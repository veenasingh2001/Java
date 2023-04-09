import java.util.Scanner;

public class comparision {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("comparision of two number.");
        System.out.print("a : "); int a = sc.nextInt();
         System.out.print("b : "); int b = sc.nextInt();

        if(a>b){
            System.out.println("a is grater number than b");

        }
        else{
            System.out.println("a is smaller than b");
        }
    }
}
