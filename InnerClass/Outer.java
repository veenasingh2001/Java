class Outer{

    class Inner{
        public void m1(){
            System.out.println("hii i am inner class");
        }
    }
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.m1();
        new Outer().new Inner().m1();

    }
}