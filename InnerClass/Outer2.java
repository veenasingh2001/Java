class Out{
    class Inn{
        int a = 45;                    //instance variable
        static int z = 80;             // static variable.

        public int dis(int x,int y){
            System.out.println("Inner class");
            System.out.println("Add : " + (x+y));  
            System.out.println(z +"  "+a);                 // assesing outer class instance and static variable directly.
            return 0;
           // System.out.println(" iu");

        }
    }
}
// assesing inner class form outside of outer class.
public class Outer2 {
    public static void main(String[] args){
        new Out().new Inn().dis(6,8);
        
    }
    
}
