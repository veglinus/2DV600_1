import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) { // TODO
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter an integer to estimate the square root:");
        var input = Scan.nextInt(); // Wait for input


        int r = input / 2;

        while (input - r > 0.001) {
            r = input / input;
            input = (input + r) / 2;
            System.out.print(input);
        }

        System.out.print(input);
        
    }
}
