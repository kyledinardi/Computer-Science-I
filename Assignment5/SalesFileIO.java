import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A utility class for reading data from and writing a summary to files
 * Due: 04/21/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class SalesFileIO {
	/**
	 * Reads sales data from a file and stores them in a 2d array
	 * 
	 * @param filename the name of the file to read
	 * @return an 2d array of sales figures
	 * @throws FileNotFoundException if the input file is not found
	 */
    public static double[][] readSalesData(String filename) throws FileNotFoundException {
        File salesData = new File(filename);
        ArrayList<double[]> dataList = new ArrayList<>();

        try (Scanner inputFile = new Scanner(salesData)) {
            while (inputFile.hasNext()) {
                String line = inputFile.nextLine();
                String[] tokens = line.split(" ");
                double[] row = new double[tokens.length];

                for (int i = 0; i < tokens.length; i++) {
                    row[i] = Double.parseDouble(tokens[i]);
                }

                dataList.add(row);
            }
        }

        return dataList.toArray(new double[dataList.size()][]);
    }

    /**
     * Writes a summary of the sales data to an file
     * @param filename the file to write to
     * @param data the sales data
     * @throws FileNotFoundException if the output file cannot be created
     */
    public static void writeSummary(String filename, double[][] data) throws FileNotFoundException {
        try (PrintWriter outputFile = new PrintWriter(filename)) {
            int maxCol = 0;
            outputFile.printf("Total sales: %.2f\n", SalesDataUtility.getTotal(data));
            outputFile.printf("Average sale: %.2f\n", SalesDataUtility.getAverage(data));
            outputFile.printf("Highest sale: %.2f\n", SalesDataUtility.getHighestInArray(data));
            outputFile.printf("Lowest sale: %.2f\n", SalesDataUtility.getLowestInArray(data));

            for (int i = 0; i < data.length; i++) {
                if (data[i].length > maxCol) {
                    maxCol = data[i].length;
                }

                outputFile.printf("Row %d total: %.2f\n", i, SalesDataUtility.getRowTotal(data, i));
            }

            for (int i = 0; i < maxCol; i++) {
                outputFile.printf(
                        "Column %d total: %.2f\n", i, SalesDataUtility.getColumnTotal(data, i));
            }

            for (int i = 0; i < data.length; i++) {
                outputFile.printf(
                        "Row %d highest: %.2f\n", i, SalesDataUtility.getHighestInRow(data, i));
            }

            for (int i = 0; i < data.length; i++) {
                outputFile.printf(
                        "Row %d lowest: %.2f\n", i, SalesDataUtility.getLowestInRow(data, i));
            }
        }
    }
}
