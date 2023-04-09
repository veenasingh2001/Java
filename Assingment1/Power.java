package Assingment1;
import java.util.Scanner;

public class Power {
  //  static int pow(int base , int expo){
     //int powr = 1;
    //  for() 

 //   }
    public static void main(String args[]){ 
        int b, e;
        System. out .println("Enter ant two num to calculate power");

        System.out.print("Enter Base:");
        Scanner sc = new Scanner(System.in);
         b = sc.nextInt();

        System.out .print("Enter Exponent:");
         e = sc.nextInt();
        int result = pow(b,e) ;

      //  double result = Math.pow(num1, num2) ;                  //using math method;
      System.out.println(b +" to the power : "+ e + " is "+ result);
       static  int pow(int b, int e){
           for(int i = 1;i<= e;i++){
               int powr = 1;
              powr = b * e;
              return powr;}
          }
    } 
}
