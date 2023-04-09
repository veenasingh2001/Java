public class Outer1{
    //asseccing inner class from instance area of outer class.
    void dis(){
     new Outer1().new Inner1().add(2,7);    ///in a single line.
}
    public class Inner1{
        public int add(int x,int y){
            System.out.println("Add : " + (x+y));
            return 0;

        }
    }//assecing inner class from static area of outer class
    public static void main(String[] args){
       // Outer1 o = new Outer1();
       // Outer1.Inner1 i = o .new Inner1();    
       // i .add(8,9);
       // new Outer1().new Inner1().add(2, 9);     //short cut .in a single line
    }

}


