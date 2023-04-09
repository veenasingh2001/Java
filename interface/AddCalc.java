import javax.sound.sampled.SourceDataLine;

interface Additiniol{
    static int add(int x,int y){
        return x+y;
    }
}
class Display implements Additiniol{
    void pdd(){
    System.out.println("Addition");
}
}
public class AddCalc {
    public static void main(String[] args){
       Display d = new Display();
       d. pdd();
    System.out.println(Additiniol.add(5, 07));
    }
}
