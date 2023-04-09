package tcs;
import java.util.*;

public class Factor {
   Stack<Integer> st;
   int y = 0;
   
     public int helper(int a){
   
      for(int i=9; i>=2; i++){
         while(a%i == 0){
           y =  st.push(i);
            a = a/i;
            System.out.println(y);
         }
      }
      if(a!=1){
         return-1;
      }
   
      int b= 0;
      while(st.isEmpty()){
         System.out.println(y);

        // b = b*10 + x;
      }
      return y;     

     }
     public void top(){


     }
    public static void main(String args[]){
      Factor ft = new Factor();
     // ft.helper(100);
      System.out.println(ft.helper(12));
      

    }
}
