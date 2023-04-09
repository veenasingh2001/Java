public class MethotOuter {
    public void m1(){
        
      class InnerMethod{
        public void sum(int x, int y){
            System.out.println("The sum : "+ (x+y));
        }
      }
      InnerMethod i= new InnerMethod();
      i.sum(20,89);
      i.sum(23,78);
      i.sum(12,89);
      public static void main(String[] args){
        MethotOuter o = new MethotOuter();
        o.m1();
    }
  }
}
