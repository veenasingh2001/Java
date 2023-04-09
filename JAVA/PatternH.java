public class PatternH {
    public static void main(String args[]){
            int n = 8;
            int m = 1;
            int o = 3;
            int p =6;
        for(int i = 1; i <=5;i++){
            for(int j = 1;j<=8;j++){
                if((j<=m)||(j>=n))
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.println();
            n--;
            m++;
        }
        
        for(int i = 1;i<=5;i++){
            for(int j=1;j<=8;j++ ){

                if((j<=o)||(j>=p))
                    System.out.print("*");
                else
                System.out.print(" ");
                
            }
            System.out.println();
            o--;
            p++;
        }
    }
}
