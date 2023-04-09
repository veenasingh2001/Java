 class Test1 {     //
   int i = 10; 
   {
    m1();
    System.out.println("First instance block");
   }
   Test1()
   {
    System.out.println("constructor");
   }
   public static void main(String args[])
   {
    Test1 t = new Test1();
    System.out.println("main");
   }
   public void m1()
   {
    System.out.println(j);  
   }
   {
    System.out.println("second instance initialization");
   }
   int j = 20;
}
