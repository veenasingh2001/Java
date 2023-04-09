public class SideZero {
    public void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void arrayDemo(){
        int[] arr ={2,9,0,5,6,0,1,4};
         printArray(arr);
         moveZero(arr);
         printArray(arr);
    }
    public void moveZero(int[] arr){
        int j=0;
     for(int i=0; i<arr.length; i++){
        if(arr[i] != 0 && arr[j] == 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        if(arr[j] != 0){
            j++;
        }
     }   

    }
    
    
    
    
    
    
    
    
    public static void main(String args[]){
       /* int[] arr = {2,0,6,5,9,0,1};
        int j = 0;
        for(int i=0 ; i<arr.length; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp =arr [j];
                arr[j] = arr[i];
                arr[i] =  temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }*/
   SideZero sz = new SideZero();
   sz.arrayDemo();

} 
}
