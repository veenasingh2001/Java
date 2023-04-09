package function;
    
 public class Public1 {
       public void msg(){
      int a = 6;
      System.out.println(a);}
     // public static void main(String args[]){    // we can assess within a same class method declared with public,static,private protected
       // Public p = new Public();
       //  p.msg();

      }     
   // }
class Print{
    public static void main(String args[]){        // we can acces in diff class if 1st class method (public and static,protected and default)
      Public1 p = new Public1();
     p. msg();

    }
}