import java.util.Scanner;

public class TimeDemo {
    public static void main(String[] args) {
        try {
            Scanner Scan = new Scanner(System.in);
        
            System.out.println("Enter the starting time in seconds.");
            int input = Scan.nextInt(); // Wait for input
    
            Time timeA = new Time(input);
            System.out.println("The time is: " + timeA.toString());

            for (int i = 0; i < 10; i++) { // Tick 10 times
                timeA.tick();
                System.out.println("Tick! Time is now: " + timeA.toString());
            }

            System.out.println("Enter a new time, starting with hours.");
            int hours = Scan.nextInt();

            System.out.println("Enter minutes.");
            int minutes = Scan.nextInt();

            System.out.println("Enter seconds.");
            int seconds = Scan.nextInt();

            Time timeB = new Time(hours, minutes, seconds);
            System.out.println("The time you entered is: " + timeB.toString());

            for (int i = 0; i < 10; i++) { // Tick 10 times
                timeB.tick();
                System.out.println("Tick! Time is now: " + timeB.toString());
            }

            Time timeSum = timeA.addTime(timeB);
            System.out.println("Added timeB to timeA! Time is now: " + timeSum.toString());

            Time timeC = timeA.subtractTime(timeB);
            System.out.println("timeA minus timeB is: " + timeC.toString());
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
            main(null);
        }
    }
}
