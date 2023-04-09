

public class Even {
    public static void main(String args[]){
        int[] a = {2,3,4,5,6,7,8,9};

      System.out.println("Array : ");
        for(int i=0; i<a.length; i++){
          System.out.print( " " +a[i]);
        }
        System.out.println("\nodd Array : ");
        for(int i=0;i<a.length; i++){
            if(a[i]%2!=0){
                System.out.print(" " +a[i]);
            }
        }    
        System.out.println("\nEven Array : ");
        for(int i=0;i<a.length; i++){
            if(a[i]%2==0){
                System.out.print(" " +a[i]);
         }    

        }
    }
}

