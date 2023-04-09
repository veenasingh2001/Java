package function;

public class staticTostatic {
   public void sum(int a,int b){           // in case method is not static
  //static void sum(int a, int b){
        int sum=a+b;
        System.out.println(sum);
      
    }
    public static void main(String [] args){
       staticTostatic sc = new staticTostatic();  // need to create object
     sc.  sum(3, 6);                             //  call with object(sc)
       // sum(3,7);
        
    }
}
