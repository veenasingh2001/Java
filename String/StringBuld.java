public class StringBuld {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("veena");
        System.out.println(sb);
        
      // StringBuilder name = sb.next();
        System.out.println(sb.charAt(1));            //retun the value in given index.

        sb.setCharAt(0,'t');                     // set the new value by replacing.
        System.out.println( sb);

        StringBuilder sd = new StringBuilder("abhay");
        sd.insert(0, 'v');                      //add the element in  given index
        System.out.println(sd);

        sd.delete(2, 3);                      //delete the value.
        System.out.println(sd);

        sd.append('w');
        System.out.println(sd);                       // add the value .

        

        }

    }

