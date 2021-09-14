import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a word to find the anagrams.");
        String input = Scan.nextLine(); // Wait for input

        try (Stream<String> file = Files.lines(Paths.get("wordlist"))) {
            file.forEach(line -> {
                if (input.length() == line.length()) { // If the words are the same length

                    char[] inputChars = input.toCharArray();
                    char[] lineChars = line.toCharArray();

                    Arrays.sort(inputChars); // TODO: Don't use arrays.sort
                    Arrays.sort(lineChars); // TODO: Don't use arrays.sort

                    if (Arrays.equals(inputChars, lineChars)) { // If the char ararys are equal
                        System.out.println(line);
                    }
                }
            });
        } catch (IOException error) {
            System.out.println(error);
        }

    }
}
