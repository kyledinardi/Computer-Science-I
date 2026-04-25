import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Test for DayOfWeek class's getDiscount method
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

class DayOfWeekTestStudent {
    @Test
    void testGetDiscount() {
        assertTrue(DayOfWeek.MONDAY.getDiscount() == 0.1);
    }
}
