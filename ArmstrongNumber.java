import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter the starting number of the range:");
        var startRange = Scan.nextInt(); // Wait for input
        System.out.println("Enter the ending number of the range: ");
        var endRange = Scan.nextInt();

        for (int i = startRange; i < endRange; startRange++) {

            int number = 371;
            int x = 3;
            int y = 7;
            int z = 1;

            // TODO: Input numbers into formula and delete above

            int a = x * x * x;
            int b = y * y * y;
            int c = z * z * z; 

            int sum = a + b + c;

            if (sum == i) {
                System.out.println(number);
            }
        }

        await();
    }

    static void await() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Do you want to repeat? (Y/N):");
        var q = Scan.next(); // Wait for input

        if (q.toLowerCase() == "y") {
            main(null);
        } else if (q.toLowerCase() == "n") {
            System.exit(0);
        } else {
            await();
        }
    }


}
