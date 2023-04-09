import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        int[] a= {2,4,2,8};
        int avg=0;
        int sum = 0;
        for(int i=0; i<a.length; i++){
         System.out.println("Array element :"+ a[i]);
            sum = a[i] + sum;
        }
        System.out.println("sum : " +sum);
             avg = sum/a.length;
        
        System.out.println("Average :" +avg);
    
       int[] b = new int[6];
       Scanner sc = new Scanner(System.in);

       for(int i=0; i<b.length;i++){
           b[i] = sc.nextInt();
           System.out.println(b[i]);
        }
        for(int i=0; i<b.length; i++){
            System.out.println("Array element :"+ b[i]);
               sum = a[i] + sum;
            }
               System.out.println("sum : " +sum);
               avg = sum/b.length;
          
        

  }
}
