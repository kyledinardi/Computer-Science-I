/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A utility class for calculating information about sales data
 * Due: 04/21/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class SalesDataUtility {
	/**
	 * Sums all sales
	 * 
	 * @param data the sales data
	 * @return the sum of all sales
	 */
    public static double getTotal(double[][] data) {
        double sum = 0;

        for (double[] row : data) {
            for (double cell : row) {
                sum += cell;
            }
        }

        return sum;
    }

    /**
     * Calculates the average of all sales
     * 
     * @param data the sales data
     * @return the average of all sales
     */
    public static double getAverage(double[][] data) {
        int totalDays = 0;

        for (double[] row : data) {
            totalDays += row.length;
        }

        if (totalDays == 0) {
            return 0;
        }

        return getTotal(data) / totalDays;
    }

    /**
     * Sums the sales of a specific department
     * 
     * @param data the sales data
     * @param row the department number
     * @return the sum of the department's sales
     */
    public static double getRowTotal(double[][] data, int row) {
        if (row < 0 || row >= data.length) {
            return 0;
        }

        double sum = 0;

        for (double cell : data[row]) {
            sum += cell;
        }

        return sum;
    }

    /**
     * Sums the sales on a specific day
     * 
     * @param data the sales data
     * @param col the day number
     * @return the sum of a day's sales
     */
    public static double getColumnTotal(double[][] data, int col) {
        if (col < 0) {
            return 0;
        }

        double sum = 0;

        for (double[] row : data) {
            if (col < row.length) {
                sum += row[col];
            }
        }

        return sum;
    }

    /**
     * Gets the highest sale of a department
     * 
     * @param data the sales data
     * @param row the department number
     * @return the department's highest sale
     */
    public static double getHighestInRow(double[][] data, int row) {
        if (row < 0 || row >= data.length) {
            return 0;
        }

        double max = data[row][0];

        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] > max) {
                max = data[row][i];
            }
        }

        return max;
    }

    /**
     * Gets the lowest sale of a department
     * 
     * @param data the sales data
     * @param row the department number
     * @return the department's lowest sale
     */
    public static double getLowestInRow(double[][] data, int row) {
        if (row < 0 || row >= data.length) {
            return 0;
        }

        double min = data[row][0];

        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] < min) {
                min = data[row][i];
            }
        }

        return min;
    }

    /**
     * Gets the highest sale in the data
     * 
     * @param data the sales data
     * @return the highest sale
     */
    public static double getHighestInArray(double[][] data) {
        if (data.length == 0) {
            return 0;
        }

        double max = data[0][0];

        for (double[] row : data) {
            for (double cell : row) {
                if (cell > max) {
                    max = cell;
                }
            }
        }

        return max;
    }

    /**
     * Gets the lowest sale in the data
     * 
     * @param data the sales data
     * @return the lowest sale
     */
    public static double getLowestInArray(double[][] data) {
        if (data.length == 0) {
            return 0;
        }

        double min = data[0][0];

        for (double[] row : data) {
            for (double cell : row) {
                if (cell < min) {
                    min = cell;
                }
            }
        }

        return min;
    }
}
