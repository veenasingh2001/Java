public class Base1 {        //static control flow in parent to child relationship
    static int i = 10;
    static 
    {
        m1();
        System.out.println("base static block");
    }
    public static void main(String args []){
        m1();
        System.out.println("Base main method");
    }
    public static void m1()
    {
        System.out.println(j);
    }
    static int j = 20;
}
class Derived1 extends Base1{
    static int x = 100;
    static {
        m2();
        System.out.println("Derived first static block");
    }
    public static void main(String args []){
        m2();
        System.out.println("derived main method");
    }
    public static void m2(){
        System.out.println(y);
    }
    static{
        System.out.println("derived second stacti block");
    }
    static int y = 200;
}