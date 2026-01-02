package LW_04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to be replaced: ");
        String target = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacement = scanner.nextLine();

        if (target.isEmpty()) {
            System.out.println(sentence);
            scanner.close();
            return;
        }

        String pattern = "\\b" + Pattern.quote(target) + "\\b";
        String updated = sentence.replaceAll(pattern, java.util.regex.Matcher.quoteReplacement(replacement));
        System.out.println(updated);

        scanner.close();
    }
}
