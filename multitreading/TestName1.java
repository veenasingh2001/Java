package multitreading;

class MyThread extends Thread{
    public void run() {
      System.out.println(" run method executed by thread: "  +Thread.currentThread().getName());
  }
}

class TestName1{
    public static void main(String args[]){
        
        MyThread t = new MyThread();
        //t.start();
        t.run();
      //  System.out.println("main method executed by thread: " + Thread.currentThread().getName());
 
    }
} 

