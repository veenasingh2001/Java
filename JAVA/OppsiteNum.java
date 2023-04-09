import java.util.Scanner;

public class OppsiteNum {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Opposite number.\nNumber : ");
        int num = sc.nextInt();
       // System.out.println("Opposite number.\nNumber : " +num);

        for(int i = 0; i<num;num--){
            System.out.println(num);
        }

    }
}
