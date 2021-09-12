public class Arrays {
    public static int average(int[] arr) { // Not working atm

        java.util.Arrays.sort(arr);

        int value = 0;
        for (int i : arr) {
            System.out.println("Added " + i);
            value += i;
        }

        double output = value / arr.length;

        return 1;
    }

    public static int max(int[] arr) {
        java.util.Arrays.sort(arr); // Sorts array from lowest to highest
        return arr[arr.length - 1]; // Grab last value of array(which is highest)
    }

    public static int[] addN(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;            
        }
        return arr;
    }

    public static int[] reverse(int[] arr) {

        int[] newarray = new int[arr.length];
        int j = 0;
        
        for (int i = arr.length -1; i > -1; i--) {
            newarray[i] = arr[j];
            j++;
        }

        return newarray;
    }

    public static void replaceAll(int[] arr, int old, int nw) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == old) {
                arr[i] = nw;
            }        
        }
    }

    public static int[] sort(int[] arr) { // TODO: TEACHER Ask if this is cheesing it
        
        int[] newarray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarray[i] = arr[i];
        }
        java.util.Arrays.sort(newarray);

        return newarray;
    }

    public static boolean hasSubString(int[] arr, int[] sub) {

        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            //System.out.println("Iteration: " + i); // Debug

            if (arr[i] == sub[0]) { // Check if the number equals first number of subarray
                //System.out.println("Match"); // Debug

                int matches = 0;
                int newIndex = i; // Offset for the original array

                for (int j = 0; j < sub.length; j++) { // Check if the all the numbers of sub are there
                    if (arr[newIndex] == sub[j]) {
                        matches++;
                        newIndex++;
                    }
                }

                if (sub.length == matches) { // If the amount of matches in the substring are the length of the substring, then arr contains sub
                    //System.out.println("Result is true"); // Debug
                    result = true;
                    return true; // Stop iteration and return true

                    // Technically we could comment out return and keep going, checking if sub exists multiple times in arr if we want to by changing this up a bit.
                }
            } 
        }

        return result;

        /*
            that returns true if the array sub is a part of the
            array arr, otherwise false. For example, in the case hasSubString({1,2,3,4,5}, {3,4,5}) the result is
            true since {3,4,5} is a part of {1,2,3,4,5}, but in case hasSubString({1,2,3,4,5}, {2,3,5}) the result is
            false
         */
    }

    public static int[] absDif(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) throw new IllegalArgumentException("Arrays provided must be of the same length.");

        int[] newarray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            newarray[i] = arr1[i] -= arr2[i];
        }

        /*
        returns a new array that is the absolute difference
        between array arr1 and array arr2. That is result array dist(i) = |arr1(i) - arr2(i)|. For example,
        in the case absDif({1,2,3,4,5}, {1,1,1,1,1}) the result is {0,1,2,3,4}. Notice, that the sizes of both
        arrays should be the same, in case they are different the method should throw an exception
        and be handled within the program.
        */

        // TODO: TEACHER "be handled within the program"? Ask for new user input?

        return newarray;
    }
}
