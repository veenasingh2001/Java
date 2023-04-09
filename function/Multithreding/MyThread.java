package function.Multithreding;


public class MyThread extends Thread {
    public void run(){                                        //executing code
        for(int i = 0;i<2; i++){
            System.out.println("child thread");
        }
    }
class ThreadDemo{
    public static void main(String args[]){
        MyThread t = new MyThread();
        t.run();                                                //always code is same.
        t. start();                                            //begning code  may be diff output,
            for(int i = 0;i<3;i++ ){
                System.out.println("main thread");

            }

            
        
    }
}

    
}
