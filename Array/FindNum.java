import java.util.Scanner;

public class FindNum {
    public static void main(String[] args){
        System.out.print("Enter length of index : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[]num = new int[size];

        for(int i=0; i<size; i++){
             num[i]= sc.nextInt();
        }
        System.out.print("x : ");
        int x = sc.nextInt();

        for(int i=0; i<num.length; i++){
            if(num[i] == x){
                System.out.println(x+ " index number is  "+i);
            }
        }

    
    }
}
