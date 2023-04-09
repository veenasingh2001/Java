package multitreading;

class MyThread extends Thread{
    public void run(){ 
        for(int i = 0; i<3; i++){                        // executing code.s
        System.out.println(" run method");
    }
}
public void start(){
    System.out.println("start method");
}


}
class Demo{
    public static void main(String args[]){
        MyThread t = new  MyThread();
        t. start(); //starting code
        t.run();
      
        for(int i = 0; i<3;i++){
            System.out.println("hii main method");
        }
        
    }

}


