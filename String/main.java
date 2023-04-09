import java.util.*;
public class main {
   // import java.util.*;

//public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        int[][] levels = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter oxygen level for trainee " + (i + 1) + " in round " + (j + 1));
                int level = sc.nextInt();
                if (level < 1 || level > 100) {
                    System.out.println("Invalid oxygen level");
                    j--;
                } else {
                    levels[i][j] = level;
                }
            }
        }
        double[] avg = new double[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += levels[i][j];
            }
            avg[i] = (double) sum / m;
        }
        double maxAvg = 0;
        for (int i = 0; i < n; i++) {
            maxAvg = Math.max(maxAvg, avg[i]);
        }
        if (maxAvg < 70) {
            System.out.println("All trainees are unfit.");
        } else {
            System.out.println("The most fit trainee(s) have average oxygen level of " + maxAvg);
            System.out.print("Trainee(s) with highest average oxygen level: ");
            for (int i = 0; i < n; i++) {
                if (avg[i] == maxAvg) {
                    System.out.print((i + 1) + " ");
                }
            }
        }
    }
}

   /*  public static void main(String[] args) {
        int n = 10;
        String[] balloons = {"a", "b", "b", "b", "c", "c", "c", "a", "f", "c"};
        System.out.println(findOddBalloon(n, balloons));
    }

    static String findOddBalloon(int n, String[] balloons) {
        Map<String, Integer> map = new HashMap<>();
        for (String b : balloons) {
            map.put(b, map.getOrDefault(b, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return "All are even";
    }
}
//}

//}

    */

