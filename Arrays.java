public class Arrays {
    public static double average(int[] arr) {

        double value = 0;
        for (int i : arr) {
            //System.out.println("Added " + i);
            value += i;
        }

        double output = value / arr.length;

        return output;
    }

    public static int max(int[] arr) {
        for (int i = 0; i < arr.length; i++) {  
            for (int index2 = i + 1; index2 < arr.length; index2++) {  
                int current;
                if (arr[i] > arr[index2]) {  
                    current = arr[i];  
                    arr[i] = arr[index2];  
                    arr[index2] = current;  
                }  
            }  
        }  
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

    public static int[] sort(int[] arr) {
        
        int[] newarray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) { // New array
            newarray[i] = arr[i];
        }

        for (int j = 0; j < newarray.length; j++) {  
            for (int index2 = j + 1; index2 < newarray.length; index2++) {  
                int current;
                if (newarray[j] > newarray[index2]) {  
                    current = newarray[j];  
                    newarray[j] = newarray[index2];  
                    newarray[index2] = current;  
                }  
            }  
        }  

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
    }

    public static int[] absDif(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) throw new IllegalArgumentException("Arrays provided must be of the same length.");

        int[] newarray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            newarray[i] = arr1[i] -= arr2[i];
        }

        return newarray;
    }
}
