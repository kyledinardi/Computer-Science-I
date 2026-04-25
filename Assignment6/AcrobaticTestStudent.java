import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for the Acrobatic class
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

class AcrobaticTestStudent {
    Acrobatic acrobat;

    @BeforeEach
    void setUp() throws Exception {
        acrobat = new Acrobatic("John", 25, 5, "Trapeze Artist", "acrobat.jpg");
    }

    @AfterEach
    void tearDown() throws Exception {
        acrobat = null;
    }

    @Test
    void testGetJob() {
        assertTrue(acrobat.getJob().equals("Trapeze Artist"));
    }

    @Test
    void testToString() {
        String comparison = "Acrobatic [Name: John, Age: 25, Job: Trapeze Artist, Years Worked: 5]";
        assertTrue(acrobat.toString().equals(comparison));
    }

    @Test
    void testGetName() {
        assertTrue(acrobat.getName().equals("John"));
    }

    @Test
    void testGetAge() {
        assertTrue(acrobat.getAge() == 25);
    }

    @Test
    void testGetYearsWorked() {
        assertTrue(acrobat.getYearsWorked() == 5);
    }

    @Test
    void testGetImagePath() {
        assertTrue(acrobat.getImagePath().equals("acrobat.jpg"));
    }
}
