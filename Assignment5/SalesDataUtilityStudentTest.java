import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for the SalesDataUtility class
 * Due: 04/21/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

class SalesDataUtilityStudentTest {
    private double[][] data = {
        {100.5, 200.75, 150.0},
        {80.0, 90.0},
        {220.1, 130.5, 300.0, 50.25}
    };

    @Test
    void testGetTotal() {
        assertEquals(1322.1, SalesDataUtility.getTotal(data), 0.001);
    }

    @Test
    void testGetAverage() {
        assertEquals(146.9, SalesDataUtility.getAverage(data), 0.001);
    }

    @Test
    void testGetRowTotal() {
        assertEquals(451.25, SalesDataUtility.getRowTotal(data, 0), 0.001);
        assertEquals(170.0, SalesDataUtility.getRowTotal(data, 1), 0.001);
        assertEquals(700.85, SalesDataUtility.getRowTotal(data, 2), 0.001);
    }

    @Test
    void testGetColumnTotal() {
        assertEquals(400.6, SalesDataUtility.getColumnTotal(data, 0), 0.001);
        assertEquals(421.25, SalesDataUtility.getColumnTotal(data, 1), 0.001);
        assertEquals(450.0, SalesDataUtility.getColumnTotal(data, 2), 0.001);
        assertEquals(50.25, SalesDataUtility.getColumnTotal(data, 3), 0.001);
    }

    @Test
    void testGetHighestInRow() {
        assertEquals(200.75, SalesDataUtility.getHighestInRow(data, 0), 0.001);
        assertEquals(90.0, SalesDataUtility.getHighestInRow(data, 1), 0.001);
        assertEquals(300.0, SalesDataUtility.getHighestInRow(data, 2), 0.001);
    }

    @Test
    void testGetLowestInRow() {
        assertEquals(100.5, SalesDataUtility.getLowestInRow(data, 0), 0.001);
        assertEquals(80.0, SalesDataUtility.getLowestInRow(data, 1), 0.001);
        assertEquals(50.25, SalesDataUtility.getLowestInRow(data, 2), 0.001);
    }

    @Test
    void testGetHighestInArray() {
        assertEquals(300.0, SalesDataUtility.getHighestInArray(data), 0.001);
    }

    @Test
    void testGetLowestInArray() {
        assertEquals(50.25, SalesDataUtility.getLowestInArray(data), 0.001);
    }
}
