import java.util.Scanner;

public class Copy {
    public static void main (String[] args){
    int[] a = {3,5,6,7,8,1};
    int[] b= {8,7,9,0,5,4};
    int add = 0;
    System.out.print("original value: ");    
    System.out.print("  copy value: ");
   for(int i=0;i<b.length;i++){
    b[i]=a[i];
    System.out.print(" "+b[i]);
}
   System.out.print("\nEnter size :");
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();

System.out.print("Enter array elements :");
int[] ori = new int[size];
int[] cop = new int [size];

for(int i=0; i<ori.length; i++){
    ori[i] = sc.nextInt();
}
System.out.print("copy elements: ");
for(int j=0;j<cop.length; j++){
    cop[j]=ori[j];
    System.out.print(cop[j]+" ");
}
int[] num = {9,3,6,1,2,9};
int sum=0;
for(int i=0; i<num.length; i++){
    sum = sum + num[i];
}
System.out.print("\n sum : "+sum);

}
}