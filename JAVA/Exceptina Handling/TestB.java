class TestB{
    public static void main(String args[]){
        doStuff();
        System.out.println(10/0);        // abnormal termination
    }
    public static void doStuff(){
        doMoreStuff();
        System.out.println("Hii");   //normal termination of programe
    }
    public static void doMoreStuff(){
        System.out.println("Hello");   // normal termination
    }
}            // total termination of programe is abnormal termination  