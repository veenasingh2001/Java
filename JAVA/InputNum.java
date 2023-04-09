import java.util.*;

public class InputNum{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Marks sheet");

    System.out.print("Name : ");
    String name = sc.nextLine();

    System.out.print("subject \nmaths : ");
    int FirstMarks = sc.nextInt();

    System.out.print("english : ");
    int secMarks = sc.nextInt();

     System.out.print("science : ");
     int ThirdMarks = sc.nextInt();

     System.out.print("total marks: ");
     int total = FirstMarks + secMarks + ThirdMarks;
     System.out.println(total);

     if(total<150){
        System.out.println("You are fail");
     }
     else if((total>=150)&&(total<=200)){
        System.out.println("third division");
    }

     else if((total>=200)&&(total<300)){
        System.out.println("second division");
     }   
     else if((total>=300)&&(total<=499)){
        System.out.println("first division");
     }
     else if(total == 500){
        System.out.println(" Congratulation ! .... you are topper....");
     }

     }

}
