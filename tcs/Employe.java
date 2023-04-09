package tcs;

import java.util.Scanner;

public class Employe {

    public int clac(){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int m = sc.nextInt();

         int p = sc.nextInt();

         int i = 1;
         while(i<n){
            m = (p*m)/100;
            i++;
         }
         //System.out.println(m);
        return m;

    }



    public static void main(String args[]){
        Employe e = new Employe();
        //e.clac();
     //   Scanner sc = new Scanner();
     System.out.println(e.clac());



    }
}
