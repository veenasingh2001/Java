import java.util.*;

public class Input {
    public static void main(String args[]){
        System.out.print("size : ");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        System.out.print("x = ");
        int x =sc.nextInt();                         //find index no.

        for(int i=0; i<size; i++){
          //  System.out.println( "num : " + number[i]);
            if(x==number[i]){
                System.out.println( "index number is "+i);
            }
        }
    }
    
}
