public class Asending {   // cheking is it ascending order or not.
    public static void main(String[] args){
        //int num[] = {12,6,32,7,9,10,16,15,8};
          int num[] = {3,9,78,90};
        boolean isAsending = true;

        for(int i=0; i<num.length-1; i++){
            if(num[i] > num[i+1]){
                isAsending = false;

            }
        }
        if(isAsending){
            System.out.println("Asending order");
        }
        else{
            System.out.println("not asending order");
        }
    

    }
}
