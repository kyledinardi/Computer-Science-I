import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for Dog class
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

class DogTestStudent {
    Dog dog;

    @BeforeEach
    void setUp() throws Exception {
        dog = new Dog("Rover", 5, "Greyhound", "Grey", "Dog.jpg");
    }

    @AfterEach
    void tearDown() throws Exception {
        dog = null;
    }

    @Test
    void testGetName() {
        assertTrue(dog.getName().equals("Rover"));
    }

    @Test
    void testGetAge() {
        assertTrue(dog.getAge() == 5);
    }

    @Test
    void testGetSpecies() {
        assertTrue(dog.getSpecies().equals("Greyhound"));
    }

    @Test
    void testGetColor() {
        assertTrue(dog.getColor().equals("Grey"));
    }

    @Test
    void testGetImagePath() {
        assertTrue(dog.getImagePath().equals("Dog.jpg"));
    }

    @Test
    void testEqualsObject() {
        assertTrue(dog.equals(dog));
        assertTrue(!dog.equals(null));
        assertTrue(!dog.equals(new Object()));

        Dog sameDog = new Dog("Rover", 5, "Greyhound", "Grey", "Dog.jpg");
        Dog differentDog = new Dog("Buddy", 6, "Labrador", "Yellow", "Dog.jpg");
        assertTrue(dog.equals(sameDog));
        assertTrue(!dog.equals(differentDog));
    }

    @Test
    void testToString() {
        String comparison = "Dog [Name: Rover, Age: 5, Species: Greyhound, Color: Grey]";
        assertTrue(dog.toString().equals(comparison));
    }
}
