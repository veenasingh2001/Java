 class Test2 {  // instanse and static together  

    {
        System.out.println("first inistance block");
    }
    static{
        System.out.println("first static block");
    }
    Test2()
    {
        System.out.println("constructor");
    }
    public static void main(String args []){
        Test2 t1 = new Test2();
        System.out.println("main");
        Test2 t2 = new Test2();
    }
    static{
        System.out.println("second static block");
    }
    {
        System.out.println("second static block");
    }
}
