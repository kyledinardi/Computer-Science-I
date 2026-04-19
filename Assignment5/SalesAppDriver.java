import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A program that reads sales figures from a file and prints a summary to the console and an output file.
 * Due: 04/21/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class SalesAppDriver {
    /**
     * Main method for command line implementation
     *
     * @param args command line arguments
     * @throws FileNotFoundException if the input file is not found or the output file cannot be
     *     created
     */
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter your input file name: ");
            String inputName = keyboard.nextLine();
            System.out.print("Enter your output file name: ");
            String outputName = keyboard.nextLine();

            double[][] data = SalesFileIO.readSalesData(inputName);
            int maxCol = 0;
            System.out.println("Data loaded from " + inputName);

            System.out.printf("\nTotal sales: %.2f\n", SalesDataUtility.getTotal(data));
            System.out.printf("Average sale: %.2f\n", SalesDataUtility.getAverage(data));
            System.out.printf("Highest sale: %.2f\n", SalesDataUtility.getHighestInArray(data));
            System.out.printf("Lowest sale: %.2f\n\n", SalesDataUtility.getLowestInArray(data));

            for (int i = 0; i < data.length; i++) {
                if (data[i].length > maxCol) {
                    maxCol = data[i].length;
                }

                System.out.printf("Row %d total: %.2f\n", i, SalesDataUtility.getRowTotal(data, i));
            }

            for (int i = 0; i < maxCol; i++) {
                System.out.printf(
                        "Column %d total: %.2f\n", i, SalesDataUtility.getColumnTotal(data, i));
            }

            for (int i = 0; i < data.length; i++) {
                System.out.printf(
                        "Row %d highest: %.2f\n", i, SalesDataUtility.getHighestInRow(data, i));
            }

            for (int i = 0; i < data.length; i++) {
                System.out.printf(
                        "Row %d lowest: %.2f\n", i, SalesDataUtility.getLowestInRow(data, i));
            }

            SalesFileIO.writeSummary(outputName, data);
            System.out.println("\nSummary written to " + outputName);
            System.out.println("Programmed by Kyle Dinardi");
        }
    }
}
