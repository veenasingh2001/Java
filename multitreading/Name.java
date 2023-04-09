class MyThread extends Thread{
    public void run(){
        System.out.println("This line executed by thread  "+Thread.currentThread().getName());
    }

}


public class Name {
    public static void main(String[] args){
        System.out.println(Thread.currentThread(). getName());   //by default main thread name is main
        MyThread t = new MyThread();
       // System.out.println(t.getName());                         //by default t thread name is thraed0
       // Thread.currentThread().setName("veena main");      // new name of current thraed
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
