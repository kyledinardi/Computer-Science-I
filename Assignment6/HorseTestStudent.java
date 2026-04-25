import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for Horse class
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */
class HorseTestStudent {
    Horse horse;

    @BeforeEach
    void setUp() throws Exception {
        horse = new Horse("Bandit", 7, "Mustang", "Brown", "Horse.jpg");
    }

    @AfterEach
    void tearDown() throws Exception {
        horse = null;
    }

    @Test
    void testGetName() {
        assertTrue(horse.getName().equals("Bandit"));
    }

    @Test
    void testGetAge() {
        assertTrue(horse.getAge() == 7);
    }

    @Test
    void testGetSpecies() {
        assertTrue(horse.getSpecies().equals("Mustang"));
    }

    @Test
    void testGetColor() {
        assertTrue(horse.getColor().equals("Brown"));
    }

    @Test
    void testGetImagePath() {
        assertTrue(horse.getImagePath().equals("Horse.jpg"));
    }

    @Test
    void testEqualsObject() {
        assertTrue(horse.equals(horse));
        assertTrue(!horse.equals(null));
        assertTrue(!horse.equals(new Object()));

        Horse sameHorse = new Horse("Bandit", 7, "Mustang", "Brown", "Horse.jpg");
        Horse differentHorse = new Horse("Charlie", 6, "Arabian", "White", "Horse.jpg");
        assertTrue(horse.equals(sameHorse));
        assertTrue(!horse.equals(differentHorse));
    }

    @Test
    void testToString() {
        String comparison = "Horse [Name: Bandit, Age: 7, Species: Mustang, Color: Brown]";
        assertTrue(horse.toString().equals(comparison));
    }
}
