import java.util.Set;
import java.util.HashSet;

public class DuplicateArray {
    public static void main(String[] args){
      int[] arr = {23,45,23,67,54,89,23,90,90,67,45};

      System.out.print("Array element :");
      for(int i=0; i<arr.length; i++){
        System.out.print(" "+ arr[i]);
      }
      System.out.print("\nDuplicate array : ");
      for(int i=0; i<arr.length; i++){

        for(int j=i+1; j<arr.length; j++){
            if(arr[i] == arr[j]  &&  i != j){
                System.out.print(" "+ arr[j]);
            }
        }
      }
Set<Integer> s = new HashSet<>();
for(int no:arr){
  if(s.add(no) == false){
    System.out.println(no+" ");
  }
}
}
}