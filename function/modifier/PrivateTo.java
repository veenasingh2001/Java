package function.modifier;
import function.PublicToPublic;

public class PrivateTo {
    public static void main(String args[]){
        PublicToPublic pp = new PublicToPublic();
        pp.Work();                                        //public modifier can access in another package

    }
    
}
