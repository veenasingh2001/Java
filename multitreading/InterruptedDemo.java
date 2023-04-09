class MyThread extends Thread{
    public void run(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println("i am lazy thread");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("i got interupted");
        }
    }
}
public class InterruptedDemo {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        t.interrupt();
        System.out.println("end of main");

    }
}
