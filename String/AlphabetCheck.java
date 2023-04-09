//public class AlphabetCheck {
    
//}
//import java.util.Scanner;

//public class AlphabetCheck {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        boolean[] alphabet = new boolean[26]; // to check all the letters of alphabets
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (c >= 'a' && c <= 'z') {
                    alphabet[c - 'a'] = true;
                } else {
                    alphabet[c - 'A'] = true;
                }
            }
        }

        boolean flag = true;
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                flag = false;
                System.out.print((char)(i + 'a') + " ");
            }
        }

        if (flag) {
            System.out.println("0");
        }
    }
}*/import java.util.*;

//public class Main
public class AlphabetCheck {

    public class main{
        
    public static void main(String[] args) {
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
}

//}
