class TestA    //jvm terminates every one for not containg exception handling
{
    public static void main (String args[]){
        dostuff();

    }
    public static void dostuff(){
        domorestuff();
    }
    public static void domorestuff(){
        System.out.println(10/0);
    }
}