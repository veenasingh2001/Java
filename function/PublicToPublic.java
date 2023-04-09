package function;                                     //first package

public class PublicToPublic {
    public void Work(){
        System.out.println("yes ,you can assecc public modifier.");
     }
    void task(){
        System.out.println(" yes,  default is here");
    } 
    static void task2(){
        System.out.println("static can be accessesd out of package");
    }
    private void task3(){                                        // cant use private out of package.
        System.out.println("private modifire");
    }
    protected void task4(){
        System.out.println("protected modifier");
    }
     }

