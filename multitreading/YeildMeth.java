class MyThread extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("child class");
            Thread.yield();                               //it pause the current excution and pass to other thread.
        }
    }
}
public class YeildMeth {
    public static void main (String[] args){
        MyThread t = new MyThread();
        t.start();
        for(int i=1; i<=5; i++){
            System.out.println("main class");
            
        }

    }
}
