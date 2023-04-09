package multithreading;
//import function.staticTostatic;
class ByThread extends Thread{
    public void run(){
        for(int i=0; i<3;i++){
          System.out.println(" hii run method ");
          try{
            Thread.sleep(1000);
             }
            catch(Exception e){}
        }
    }
}
class Tythread extends Thread{
    public void run(){
        for(int i=0; i<3;i++){
            System.out.println("bye run method ");
            try{
                Thread.sleep(1000);
            }
              catch(Exception e){}
            }
    }
}
 class ThreadDemo {
    public static void main(String args[]){
        ByThread t = new ByThread();
       // Tythread y = new Tythread();
        t.start();
         //y.start();
    }   
}
