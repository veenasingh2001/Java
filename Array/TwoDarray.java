import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args){
        System.out.print("Enter any number of row : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.print("Enter any number of coloumn : ");
        int coloumn = sc.nextInt();

        int[][] number = new int [row][coloumn];

        for(int i=0; i<row; i++){

            for(int j=0;j<coloumn;j++){
                number[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row;i++){

            for(int j=0;j<coloumn; j++){
                System.out.print( " "+number[i][j]);

            }
            System.out.println();
        }


    }
}
