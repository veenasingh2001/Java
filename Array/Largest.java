public class Largest {
    public static void main(String args[]){
        int num[] = {23,43,7,6,18,29,76};

        int max = num[0]; 

        for(int i=1; i<num.length; i++) {
            if(max<num[i]){
               max = num[i];
            }
        }
        System.out.println("Largest element is : " + max);
//for smallest num.
        int min = num[0];
        for(int i=1; i<num.length; i++){
            if(min>num[i]){
                min = num[i];
            }
        }
        System.out.println("Smallest element is : " + min);
    }
}
