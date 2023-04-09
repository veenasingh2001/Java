import java.util.Scanner;

public class add {
    public static void main(String args[]){
        System.out.println("Addition");
        Scanner sc = new Scanner(System.in);

        System.out.print("FirstNum : ");
        int a = sc.nextInt();
        System.out.print("SecondNum : ");
        int b = sc.nextInt();

        System.out.print("sum : ");
        int sum = a + b;
        System.out.println(sum);

        int prod = a * b;
        System.out.print("multiply : ");
        System.out.println(prod);
      
        int sub = a - b;
        System.out.print("subtract : ");
        System.out.println(sub);

        float div = a / b;
        System.out.print("divide : ");
        System.out.println(div);

    }
}
