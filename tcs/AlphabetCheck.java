

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
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
}

