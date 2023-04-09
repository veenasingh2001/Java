   class P {
    public   void m1(int... i){
        System.out.println("parent");
    }    
}
 class C extends P {
    public   void m1(int... i)  //== it is overriding.              // if (int i) ,then ans = parent,child, parent.trat as overloding, 
    {
        System.out.println("child");
    } 
}
class Test{
    public static void main(String args[]){
        P p = new P();
        p.m1(20);
        C c = new C();
        c.m1(20);
        P p1 = new C(); 
        p1 . m1(20);
    }
}
