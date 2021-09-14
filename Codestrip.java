import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Codestrip {
    public static int amountOfLines = 0; // Number of lines
    public static int blankLines = 0; // Number of blank lines
    public static int commentsRemoved = 0; // Number of comments removed

    public static boolean removeNext = false;
    public static void main(String[] args) {

        try (Stream<String> file = Files.lines(Paths.get("HelloWorld.java"))) { // Getting file

            file.forEach(line -> {

                if (line.isEmpty()) { // Check for blank lines before doing anything
                    blankLines++;
                }
                
                if (removeNext) { // If a starting comment was found we're removing this line and looking for end of comment
                    if (line.indexOf("*/") == -1) { // Check for end of comment
                        // If we didn't find end of comment, remove this line and keep removeNext true
                        line = ""; // Make line blank
                    } else {
                        // We found the end of the comment, no need to keep removing lines. But this line is also a comment, so we're removing this one first.
                        line = ""; // Make line blank if we found the end of the comment
                        removeNext = false;
                    }
                }
                
                if (line.indexOf("//") != -1) { // Checking for in-line comment
                    line = line.substring(0, line.indexOf("//")); // Substring only the part we want to keep
                    commentsRemoved++;
                }

                
                
                if (line.indexOf("/*") != -1) { // Check if there is a long comment we need to remove
                    commentsRemoved++; // This counts as one "big" comment

                    if (line.indexOf("*/") == -1) { // Check for end of comment
                        removeNext = true; // Didn't find end of comment, we're checking next line for end of comment
                    }
                    line = ""; // Make line blank if we found the end of the comment
                }

                if (!line.isEmpty()) { // If line is not blank at this point, print it because it's code
                    amountOfLines++;
                    System.out.println(line);
                }
            });

            System.out.println("Actual lines of code: " + amountOfLines);
            System.out.println("Blank lines removed: " + blankLines);
            System.out.println("Comments removed: " + commentsRemoved);

        } catch (IOException error) {
            System.out.println(error);
        }
    }
}
