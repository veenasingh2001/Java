import java.util.Scanner;

public class Reverse {
    public static void main(String [] args){

     System.out.println("Enter array size ");
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     
    System.out.println("Enter array elements ");
    int[] arr = new int[size];

    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();


    }
    System.out.println("Reverse an array");
    for(int i=size-1;i>=0; i--){
        System.out.print(" "+arr[i]);
    }
       
   // int[] a={2,3,4,5,6,7,8};
   // System.out.println("Array : ");

   // for(int i =0; i<a.length; i++){
      //  System.out.print(" "+ a[i]);
   // }
   

 }  
}
