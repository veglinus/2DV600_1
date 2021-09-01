import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a line of text.");
        char[] input = Scan.nextLine().toCharArray(); // Wait for input

        for (int i = 0; i < input.length; i++) {
            if (Character.isLetter(input[i])) {

                // Rule 1
                if (input[i] == 'z') {
                    input[i] = 'a';
                } else {
                    input[i]++;
                }

                // Rule 2
                if (input[i] == 'a' || input[i] == 'e' || input[i] == 'i' || input[i] == 'o' || input[i] == 'u') {
                    int uppercaseASCII = (int) input[i] - 32;
                    input[i] = (char) uppercaseASCII;
                }
                
            }
        }

        System.out.println(String.valueOf(input));
    }
}
