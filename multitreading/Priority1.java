//package multitreading;

class MyThread extends Thread{

}

public class Priority1 {
    public static void main(String args[]){
        
        System.out.println(Thread.currentThread().getPriority());     //current thread(main deafault)value 5

        Thread.currentThread().setPriority(1);
        MyThread t = new MyThread();
        System.out.println(t.getPriority()); 

        Thread.currentThread().setPriority(0);//    1 to 9 is valid
        MyThread t1 = new MyThread();
        System.out.println(t1.getPriority());
    }
}
