public class PatternF {
    public static void main(String args[]){
      int a = 1;
      int c, b = 3;
         
        for(int i = 1;i <= 5;i++){

            for(int j = 1;j < i;j++){

                c=a%b;
                System.out.print(c);
                c++;
            }
            
            System.out.println();
        }
    }
}
