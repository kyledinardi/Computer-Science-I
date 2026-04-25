import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for the Arena class
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

class ArenaTestStudent {
    Arena arena;

    @BeforeEach
    void setUp() throws Exception {
        arena = new Arena("Red", 120, 100, "Arena.jpg");
    }

    @AfterEach
    void tearDown() throws Exception {
        arena = null;
    }

    @Test
    void testGetLength() {
        assertTrue(arena.getLength() == 120);
    }

    @Test
    void testGetWidth() {
        assertTrue(arena.getWidth() == 100);
    }

    @Test
    void testSetSize() {
        arena.setSize(200, 150);
        assertTrue(arena.getLength() == 200);
        assertTrue(arena.getWidth() == 150);
    }

    @Test
    void testGetColor() {
        assertTrue(arena.getColor().equals("Red"));
    }

    @Test
    void testSetColor() {
        arena.setColor("Yellow");
        assertTrue(arena.getColor().equals("Yellow"));
    }

    @Test
    void testGetBuildingType() {
        assertTrue(arena.getBuildingType().equals("Arena"));
    }

    @Test
    void testSetBuildingType() {
        arena.setBuildingType("Tent");
        assertTrue(arena.getBuildingType().equals("Tent"));
    }

    @Test
    void testGetImagePath() {
        assertTrue(arena.getImagePath().equals("Arena.jpg"));
    }

    @Test
    void testToString() {
    	String comparison = "Arena [Color: Red, Length: 120.00, Width: 100.00]";
        assertTrue(arena.toString().equals(comparison));
    }
}
