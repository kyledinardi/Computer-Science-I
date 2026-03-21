import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for the Property class
 * Due: 03/31/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

class PropertyStudentTest {
    @Test
    void testNoArgConstructor() {
        Property p = new Property();
        assertTrue(p.getPropertyName() == null);
        assertTrue(p.getCity() == null);
        assertTrue(p.getRentAmount() == 0);
        assertTrue(p.getOwner() == null);
    }

    @Test
    void testArgConstructor() {
        Property p = new Property("Property-1", "Rockville", 3500, "Joe");
        assertTrue(p.getPropertyName().equals("Property-1"));
        assertTrue(p.getCity().equals("Rockville"));
        assertTrue(p.getRentAmount() == 3500);
        assertTrue(p.getOwner().equals("Joe"));
    }

    @Test
    void testCopyConstructor() {
        Property p1 = new Property("Property-1", "Rockville", 3500, "Joe");
        Property p2 = new Property(p1);

        assertTrue(p2.getPropertyName().equals("Property-1"));
        assertTrue(p2.getCity().equals("Rockville"));
        assertTrue(p2.getRentAmount() == 3500);
        assertTrue(p2.getOwner().equals("Joe"));
    }
}
