//package multitreading;
class MyThread extends Thread{

}

public class NameMain
 {
    public static void Main(String args[]){
        System.out.println(Thread.currentThread().getName());
        MyThread t = new MyThread();
        System.out.println(t.getName());
        Thread.currentThread().setName("Pawan kalyan");
        System.out.println(Thread.currentThread().getName());
    } 
}
