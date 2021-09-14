public class ArraysMain {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3, 3, 5};

            System.out.println("We're starting with an array with the following values: " + java.util.Arrays.toString(array));
    
            System.out.println("The average of our array is: " + Arrays.average(array));

            System.out.println("The highest value of our array is: " + Arrays.max(array));

            System.out.println("Using addN, we add 2 to each value: " + java.util.Arrays.toString(Arrays.addN(array, 2)));
    
            System.out.println("Let's see what it would look like reversed, without changing the original: " + java.util.Arrays.toString(Arrays.reverse(array)));
    
            System.out.println("Let's replace all 4s with 0s.");
            Arrays.replaceAll(array, 4, 0);

            System.out.println("That means our array is now: " + java.util.Arrays.toString(array));

            System.out.println("Let's see what it would look like sorted from lowest to highest without changing the original: " + java.util.Arrays.toString(Arrays.sort(array)));

            int[] arraySub = {3, 5, 5};
            System.out.println("Let's check if our array contains this array: " + java.util.Arrays.toString(arraySub) );
            System.out.println("Does it contain the substring? Result: " + Arrays.hasSubString(array, arraySub));
    
            int[] array3 = {1, 1, 1, 1, 1};
            System.out.println("Finally, let's use absDif to get the difference of two arrays.");
            System.out.println("Comparing " + java.util.Arrays.toString(array) + " with " + java.util.Arrays.toString(array3));
    
            System.out.println("The difference is: " + java.util.Arrays.toString(Arrays.absDif(array, array3)));

        } catch (Exception e) { 
            System.out.println("Error: " + e);
            main(null);
        }

    }
}
