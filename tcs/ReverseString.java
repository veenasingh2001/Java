public class ReverseString {
    public static void main(String args[]){
        String str="veena";
        String rvs="";

        System.out.println("Orijinal :"+str);

      int  length = str.length();

      for(int i=length-1;i>=0;i-- ){
        rvs= rvs + str.charAt(i);
      }
        System.out.println(rvs);
      

    }

}
