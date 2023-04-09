public class ConstruOuter {
    int x = 200;
    class Inner2{
        int x =20;
        public void m1(){
            int x = 2;
            System.out.println(x);
            System.out.println( this.x);
            System.out.println( ConstruOuter.this.x);

        }
    }
    public static void main (String[] args){
        new ConstruOuter().new Inner2().m1();
        

    }
}
