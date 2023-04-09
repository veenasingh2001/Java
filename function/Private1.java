package function;

//private class Private1 {      //we cant declare top class as private.

//protected class Private1{       // we cant declare protected for class and interface.
    class Private1{
    void task(){
        System.out.println("yes it is accessable");
    }
}

class print{
    public static void main(String args[]){
        Private1 p = new Private1();
        p.task();
    }
}


