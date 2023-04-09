public class AscendingNumb {
    public static void main(String[] args){
        int[] arr = {5,6,24,17,43,80,70,19} ;
        int larg = Integer.MIN_VALUE;
        int second_larg = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>larg){
                second_larg = larg;
                larg = arr[i];
            }
            else if(arr[i] > second_larg && arr[i] != larg){
                second_larg = arr[i];

            }
            System.out.print(" "+ arr[i]);
        }
            if(second_larg == Integer.MIN_VALUE){
            System.out.println("no laegs");
           }else{
                System.out.println("second largest : " + second_larg);
                
            }
        }
    }

