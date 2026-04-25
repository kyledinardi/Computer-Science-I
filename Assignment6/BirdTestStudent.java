import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for the Bird class
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

class BirdTestStudent {
    Bird bird;

    @BeforeEach
    void setUp() throws Exception {

        bird = new Bird("Polly", 20, "Parrot", "Blue", "Bird.jpg");
    }

    @AfterEach
    void tearDown() throws Exception {
        bird = null;
    }

    @Test
    void testGetName() {
        assertTrue(bird.getName().equals("Polly"));
    }

    @Test
    void testGetAge() {
        assertTrue(bird.getAge() == 20);
    }

    @Test
    void testGetSpecies() {
        assertTrue(bird.getSpecies().equals("Parrot"));
    }

    @Test
    void testGetColor() {
        assertTrue(bird.getColor().equals("Blue"));
    }

    @Test
    void testGetImagePath() {
        assertTrue(bird.getImagePath().equals("Bird.jpg"));
    }

    @Test
    void testEqualsObject() {
        assertTrue(bird.equals(bird));
        assertTrue(!bird.equals(null));
        assertTrue(!bird.equals(new Object()));

        Bird sameBird = new Bird("Polly", 20, "Parrot", "Blue", "Bird.jpg");
        Bird differentBird = new Bird("Tweety", 5, "Canary", "Yellow", "Bird.jpg");
        assertTrue(bird.equals(sameBird));
        assertTrue(!bird.equals(differentBird));
    }

    @Test
    void testToString() {
    	String comparison = "Bird [Name: Polly, Age: 20, Species: Parrot, Color: Blue]";
        assertTrue(bird.toString().equals(comparison));
    }
}
