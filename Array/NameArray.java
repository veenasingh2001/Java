import java.util.Scanner;

public class NameArray {
    public static void main(String[] args ){
        System.out.print("Enter size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

      //  System.out.print("Enter your name");
        String name[] = new String[size];

        for(int i=0; i<size; i++){
            name[i] = sc.next();
        }
        for(int i=0; i<name.length; i++){
            System.out.println("name " + (i+1) + "  is : "  + name[i]);
        }

    }
}
