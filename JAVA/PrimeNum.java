import java.util.Scanner;

public class PrimeNum {
    public static void main(String args[]) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("It is  a prime number : " + num);
        } else {
            System.out.println("it is not a prime number : " + num);
        }

    }
}
