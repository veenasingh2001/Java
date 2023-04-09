interface cubal{
    static int cube(int x){
   // static int calac(int x){
    return(x*x*x);
    }
}
class Area implements cubal{
    public void cube(){
        System.out.println("cube : ");
    }


}

public class CubePrit {
    public static void main (String[] args){
        Area a = new Area();
        a.cube();
        System.out.println(cubal.cube(7));

    }
}
