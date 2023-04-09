import java.util.Scanner;

public class voter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("name : ");
        String name = sc.nextLine();

        System.out.print("age : ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("you are eligible for voting");

        }
        else {
            System.out.println("you are not elegible for voting");
        
    }

        //System.out.println();
        //System.out.print("a : ");
        //int a = sc.nextInt();
        //System.out.print("b : ");
        //int b = sc.nextInt();

        //if(a%2==0){
           // System.out.println("a is an even number  ");

       // }
        //else{
         //   System.out.println("a is an odd number");
      //  }


    }

}
