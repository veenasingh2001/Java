public class ReverseStr {
    public static void main (String args[]){
      String str ="veena is my name";
      String rvs="";

      System.out.println("Oringinal name: " + str);

      for(int i = str.length()-1;i>=0; i--){
        rvs = rvs+str.charAt(i);
      }
      System.out.println( "Reverse name:" + rvs);
        
    }
}
