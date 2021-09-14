import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter the 9-digit ISBN: ");
        var userInput = Scan.nextInt(); // Wait for input

        String inputString = String.valueOf(userInput); // Make into string
        
        char[] chars = inputString.toCharArray(); // Turn string into char array
        char[] newArray = new char [9];

        //newArray = chars;

        if (10 > inputString.length()) {

            var zerosNeeded = 9 - String.valueOf(userInput).length();
            var zerosNeededOriginally = 9 - String.valueOf(userInput).length();

            //System.out.println("We need " + zerosNeeded + " zeros");
            //System.out.println(zerosNeeded + String.valueOf(userInput).length() + "are the amount of times we're iterating");
            
            for (int i = 0; i < zerosNeededOriginally + String.valueOf(userInput).length(); i++) { // for each zero needed, add those to the string
                newArray[i] = '0';

                if (zerosNeeded != 0) {
                    zerosNeeded--;
                    newArray[i] = '0';
                    //System.out.println("Added a zero. Zeros need is now: " + zerosNeeded);
                } else {
                    //System.out.println("Added the number " + chars[i - zerosNeededOriginally]);
                    newArray[i] = chars[i - zerosNeededOriginally];
                }
            }

            inputString = inputString + String.valueOf(userInput);

        } else {
            inputString = String.valueOf(userInput); // Make into string
        }

        //System.out.println("Array is: " + Arrays.toString(newArray));


        int[] n = new int [9];
        for (int i = 0; i < newArray.length; i++) {
            n[i] = newArray[i] - '0'; // to convert from char to int
        }

        //System.out.println("Array is: " + Arrays.toString(n));

        int checksum = (n[0] * 1 + n[1] * 2 + n[2] * 3 + n[3] * 4 + n[4] * 5 + n[5] * 6 + n[6] * 7 + n[7] * 8 + n[8] * 9) % 11; // Use char array on formula

        //System.out.println("Checksum is: " + checksum);

        String result = String.valueOf(newArray);
        if (checksum == 10) {
            System.out.println("The ISBN-10 number is: " + result + "X");
        } else {
            System.out.println("The ISBN-10 number is: " + result + checksum);
        }
    }
}
 