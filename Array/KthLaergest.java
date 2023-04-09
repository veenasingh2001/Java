import java.util.Scanner;

class KthLargest{
    public static void main(String[] args){
        System.out.print("Enter array size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

       // int[] arr = new int[size];
        System.out.print(" \n Enter array element : ");
        int[] arr = new int[size];
        
        for(int i=0;i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){ 
        System.out.print(arr[i]+" ");
        }
        
    }
}