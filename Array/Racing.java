import java.util.Scanner;

public class Racing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); // initial distance between cars
    int n1 = sc.nextInt(); // speed of first car
    int n2 = sc.nextInt(); // speed of second car

    if (n2 > n1) { // check if second car can ever catch up
      int seconds = (x / (n2 - n1)); // number of seconds until second car catches up
    // int diff = n2-n1;
   //  int seconds = diff + x;
      System.out.println(seconds);
    } else {
      System.out.println(-1);
    }
  }
}

