import java.util.Arrays;
import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter the 9-digit ISBN: ");
        var userInput = Scan.next(); // Wait for input

        String inputString = String.valueOf(userInput); // Make into string
        char[] chars = inputString.toCharArray(); // Turn string into char array
        int[] n = new int [userInput.length()];

        for (int i = 0; i < chars.length; i++) {
            n[i] = chars[i] - '0'; // to convert from char to int
        }

        System.out.println(Arrays.toString(n));

        int checksum = (n[0] * 1 + n[1] * 2 + n[2] * 3 + n[3] * 4 + n[4] * 5 + n[5] * 6 + n[6] * 7 + n[7] * 8 + n[8] * 9) % 11; // Use char array on formula

        System.out.println("Checksum is: " + checksum);
        if (checksum == 10) {
            System.out.println("The ISBN-10 number is: " + userInput + "X");
        } else {
            System.out.println("The ISBN-10 number is: " + userInput + checksum);
        }
    }
}
 