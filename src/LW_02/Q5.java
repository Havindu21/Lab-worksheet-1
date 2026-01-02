package LW_02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {
    private static String prepareSentence(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        StringBuilder preparedSentence = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    preparedSentence.append(c);
                }
            }
        }

        return preparedSentence.toString();
    }

    private static boolean isPalindrome(String preparedSentence) {
        int left = 0;
        int right = preparedSentence.length() - 1;
        while (left < right) {
            if (preparedSentence.charAt(left) != preparedSentence.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String preparedSentence = prepareSentence(sentence);
        System.out.println(isPalindrome(preparedSentence) ? "Palindrome" : "Not a palindrome");

        scanner.close();
    }
}
