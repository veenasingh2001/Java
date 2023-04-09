package tcs;

import java.util.Stack;

public class NumberFactor {
    Stack<Integer> st;

   public int helper(int a){
   // Stack<Integer> st;
    
    for(int i=9; i>=2; i++){
        while(a%i==0){
           st.push(i);
           a= a/i;
        }
     }
     if(a!=1){
        return-1;
     }
     int b= 0;
     while(st.isEmpty()){
        int x = st.pop();
        b = b*10 + x;
     }
     return b;     


   }
    public static void main(String args[]){

    }

    
}
