import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        getNumber();
    }

    public static void getNumber() {
        Scanner Scan = new Scanner(System.in);
        
        System.out.println("Enter the starting number of the range:");
        var startRange = Scan.nextInt(); // Wait for input
        System.out.println("Enter the ending number of the range: ");
        var endRange = Scan.nextInt();

        for (int i = startRange; i < endRange; i++) {
            char[] charsStart = String.valueOf(i).toCharArray();
            int sum = 0;
            
            for (int j = 0; j < charsStart.length; j++) {
                int currentNumber = charsStart[j] - '0';
                sum += Math.pow(currentNumber, charsStart.length); // The digit chosen to the power of the amount of digits in the entire number
            }

            if (sum == i) { // If armstrong number is found, print it
                System.out.println(sum);
            }
        }

        await();
    }

    static void await() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Do you want to repeat? (Y/N):");
        String q = Scan.nextLine(); // Wait for input

        if (q.equalsIgnoreCase("y")) {
            getNumber();
        } else if (q.equalsIgnoreCase("n")) {
            System.exit(0);
        } else {
            await();
        }
    }


}
