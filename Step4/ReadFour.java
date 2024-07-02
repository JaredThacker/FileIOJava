package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {

        try {
            Scanner fileIn = new Scanner(new File("Step4/input.txt"));

            int sum = 0;

            while (fileIn.hasNext()) {
                // Reads the entire line as a string
                int lineIn = fileIn.nextInt();

                // Split the line into a String array
                int input = lineIn;

                sum += input;
//                for (int i = 0; i < input.length; i++) {
//                    sum += Integer.parseInt(input);
//                    System.out.println("Running: " + sum);
                }
                System.out.println("Running Total: " + sum);
                fileIn.close();
            }catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
