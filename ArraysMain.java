public class ArraysMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 5};

        System.out.println("We're starting with an array with the following values: " + java.util.Arrays.toString(array));

        System.out.println("Using addN, we add 2 to each value: " + java.util.Arrays.toString(Arrays.addN(array, 2)));

        System.out.println("We can now reverse this array: " + java.util.Arrays.toString(Arrays.reverse(array)));

        System.out.println("Let's replace all 4s with 0!");
        Arrays.replaceAll(array, 4, 0);

        System.out.println("That means our array is now: " + java.util.Arrays.toString(array));

        System.out.println("Let's check if our array contains this array: " );

        int[] arraySub = {2, 3, 3};
        System.out.println("Does it contain the substring?: " + Arrays.hasSubString(array, arraySub));


        int[] array3 = {1, 1, 1, 1, 1};
        System.out.println("Finally, let's use absDif to get the difference of two arrays.");
        System.out.println("Comparing " + java.util.Arrays.toString(array) + " with " + java.util.Arrays.toString(array3));
        int[] newarray = Arrays.absDif(array, array3);

        System.out.println("The result is: " + java.util.Arrays.toString(newarray));
    }
}
