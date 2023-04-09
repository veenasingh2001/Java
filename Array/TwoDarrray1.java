import java.util.Scanner;

public class TwoDarrray1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        System.out.print("Enter coloumn : ");
        int coloumn = sc.nextInt();

        int[][] number = new int[row][coloumn];

        for(int i=0; i<row; i++){                     //input number
            for(int j=0; j<coloumn; j++){
                number[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter x : ");
        int x = sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0; j<coloumn; j++){
                if(number[i][j] == x){
                System.out.print(i+ " , " +j);
            }

            }
        }


    }
}

