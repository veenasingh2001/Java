import java.io.IOException;

class MyThread extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("child thread");
            try{
               Thread. sleep(2000);
            }
            catch(InterruptedException e) {
                
            }
        }

    }

}
public class JoinDemo {
    public static void main(String[] args)throws InterruptedException{
        MyThread t = new MyThread();
        t.start();
        t.join();              //it permits to wait until other finish its execution.
       // t.join(10000);
        for(int i=1; i<=5;i++){
            System.out.println("main method");
        }

    }
}
