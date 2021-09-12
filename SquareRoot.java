import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("This program estimates square roots.");
        System.out.println("Enter an integer to estimate the square root:");
        var input = Scan.nextInt(); // Wait for input

        int initialGuess = input;
        double guess = input;
        double r = initialGuess / 2;

        while (guess - r > 0.01) { // 0.01 is 1% accuracy
            r = initialGuess / guess;
            guess = (guess + r) / 2;
            System.out.println("Current guses: " + guess);
        }

        double rounded = Math.round(guess * 100.0) / 100.0;

        System.out.print("The estimated square root of " + initialGuess + " is " + rounded);
        
    }
}
