import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for Lion class
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */
class LionTestStudent {
    Lion lion;

    @BeforeEach
    void setUp() throws Exception {

        lion = new Lion("Leo", 6, "Northern Lion", "Yellow", "Lion.jpg");
    }

    @AfterEach
    void tearDown() throws Exception {
        lion = null;
    }

    @Test
    void testGetName() {
        assertTrue(lion.getName().equals("Leo"));
    }

    @Test
    void testGetAge() {
        assertTrue(lion.getAge() == 6);
    }

    @Test
    void testGetSpecies() {
        assertTrue(lion.getSpecies().equals("Northern Lion"));
    }

    @Test
    void testGetColor() {
        assertTrue(lion.getColor().equals("Yellow"));
    }

    @Test
    void testGetImagePath() {
        assertTrue(lion.getImagePath().equals("Lion.jpg"));
    }

    @Test
    void testEqualsObject() {
        assertTrue(lion.equals(lion));
        assertTrue(!lion.equals(null));
        assertTrue(!lion.equals(new Object()));

        Lion sameLion = new Lion("Leo", 6, "Northern Lion", "Yellow", "Lion.jpg");
        Lion differentLion = new Lion("Aslan", 14, "Southern Lion", "Gray", "Lion.jpg");
        assertTrue(lion.equals(sameLion));
        assertTrue(!lion.equals(differentLion));
    }

    @Test
    void testToString() {
        String comparison = "Lion [Name: Leo, Age: 6, Species: Northern Lion, Color: Yellow]";
        assertTrue(lion.toString().equals(comparison));
    }
}
