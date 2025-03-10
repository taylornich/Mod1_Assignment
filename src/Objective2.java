import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedSentence.append(reversedWord.reverse().toString()).append(" ");
        }
        System.out.println("\nReversed sentence:");
        System.out.println(reversedSentence.toString().trim());

        scanner.close();
    }
}
