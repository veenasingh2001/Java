import java.util.Scanner;

public class Table {
    public static void main(String args[]){
        System.out.print("Print table \n num: ");
        Scanner sc = new Scanner(System.in);
        int prod = 1;
        int num = sc.nextInt();
        for(int i = 1;i<=10;i++){
            prod = num * i;
            System.out.println(prod); 
        }

    }
}
