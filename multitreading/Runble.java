package multitreading;

class Hello implements Runnable{
    public void run(){
        for(int i=0; i<3;i++){
            System.out.println("hello student");
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }
    }
}
class Bye implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
          System.out.println("bye student");
          try{Thread.sleep(1000);}
          catch(Exception e){}
        }
    }
}
public class Runble {
    public static void main(String args []){
        Runnable obj = new Hello();
        Runnable obj1 = new Bye();

        Thread t = new Thread( obj);
        Thread t1 = new Thread(obj1);
        t.start();
        t1 .start();
        

    }
    
}
