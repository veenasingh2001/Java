public class PatternG {
    public static void main(String args[]){
        int n=4;
       // int p = 8;
        //int r=1;
        for(int i = 1;i <= n;i++)
        {
            int p = 8;
            int r = 1;
            for(int j = 1;j<=8;j++)
            {
                if((j <= r)||(j >=p ))

                    System.out.print("*");
                    else
                        System.out.print(" ");
                    }
                    System.out.println();
                    p--;
                    r++;

                    }
                    for(int i = 1;i<=5;i++){
                        int p = 5;
                        int r = 4;

                        for(int j = 1;j>=8;j++){
                            if((j<=r)||(j <= p))

                            System.out.print("*");
                            else
                            System.out.print(" ");
                        }
                        System.out.println();
                        p++;
                        p--;
                    }
                }
             }
                
                
            
        
    

