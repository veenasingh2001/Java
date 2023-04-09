import java.io.InterruptedIOException;

class MyThread extends Thread{
    static Thread mt;
    public void run(){
    try
    {
        mt.join();                        //child class thread is waiting.main thread is executing.
    }
    catch (InterruptedException e){}
    for(int i=1; i<=5; i++){
        System.out.println("child thread");
    }
  }  
} 
public class JoinDemo2 {
    public static void main(String[] args) throws InterruptedException{
        MyThread .mt = Thread.currentThread();
        MyThread t = new MyThread();
        t.start();
        for(int i=1; i<=5; i++){
            System.out.println("main thread");
        }

    }
}
