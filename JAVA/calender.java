import java.util.Scanner;

public class calender {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int day = sc.nextInt();
        System.out.println("Enter any number form 1 to 7\n1.Monday\n2.Tuesday\n3.wednesday\n4.thrusday\n5.Friday\n6.saturday\n7.sunday");
        int day = sc.nextInt();
        switch (day){
        case 1:  System.out.println("you selected monday .This is hot day.sunrise and sunset at 6 'o' clock");
                 System.out.println("you should wear yellow cloth.\ngoodday for job interview.");
                 System.out.println("your work for toady is : complete your maths task");
        break;
        case 2:
               System.out.println("you selected monday .This is normal day.sunrise and sunset at 6:30 'o' clock");
               System.out.println("you should wear yellow cloth.\ngoodday for job interview.");
               System.out.println("your work for toady is : complete your maths task"); 
        break;
        case 3:
               System.out.println("you selected monday .This is hot day.sunrise and sunset at 6:15 'o' clock");
               System.out.println("you should wear yellow cloth.\ngoodday for job interview.");
               System.out.println("your work for toady is : complete your maths task");
        break;
        case 4:
               System.out.println("you selected monday .This is hot day.sunrise and sunset at 6:20 'o' clock");
               System.out.println("you should wear yellow cloth.\ngoodday for job interview.");
               System.out.println("your work for toady is : complete your maths task");

        break;
        case 5:
              System.out.println("you selected monday .This is hot day.sunrise and sunset at 6:11 'o' clock");
              System.out.println("you should wear yellow cloth.\ngoodday for job interview.");
              System.out.println("your work for toady is : complete your maths task");

        break;
        case 6:
              System.out.println("you selected monday .This is hot day.sunrise and sunset at 6:10 'o' clock");
              System.out.println("you should wear yellow cloth.\ngoodday for job interview.");
              System.out.println("your work for toady is : complete your maths task");
        break;
        case 7:
              System.out.println("you selected monday .This is hot day.sunrise and sunset at 6:25 'o' clock"); System.out.println("you should wear yellow cloth.\ngoodday for job interview.");
              System.out.println("your work for toady is : complete your maths task");
        break;
        default: System.out.println("you selected wrong day");
    }

    }
}
