package multitreading;

//import function.staticTostatic;

public class DemoA {
    public static void main(String args[]){
        DemoB b = new DemoB();
        DemoC c = new DemoC();
        b.start(); 
        c.start();
          //  for(int i=0; i<3;i++){
             // System.out.println("hiiiii");}    
        }
      }
class DemoB extends Thread{
    public void run(){
        for(int i=0;i<7;i++){
            System.out.println("i am veena");
            try{
                Thread.sleep(50); }
                catch(Exception e){}
        }
    }
}
class DemoC extends Thread{
    public void run(){
        for(int i=0; i<4;i++){
            System.out.println("i am girl");
            try{
                Thread.sleep(1000);}
                catch(Exception e){}
        }
    }
}
