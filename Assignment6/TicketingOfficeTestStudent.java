import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for TicketingOffice class
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */
class TicketingOfficeTestStudent {
    TicketingOffice office;

    @BeforeEach
    void setUp() throws Exception {
        office = new TicketingOffice("Blue", 20, 10, "TicketingOffice.jpg");
    }

    @AfterEach
    void tearDown() throws Exception {}

    @Test
    void testGetLength() {
        assertTrue(office.getLength() == 20);
    }

    @Test
    void testGetWidth() {
        assertTrue(office.getWidth() == 10);
    }

    @Test
    void testSetSize() {
        office.setSize(30, 15);
        assertTrue(office.getLength() == 30);
        assertTrue(office.getWidth() == 15);
    }

    @Test
    void testGetColor() {
        assertTrue(office.getColor().equals("Blue"));
    }

    @Test
    void testSetColor() {
        office.setColor("Green");
        assertTrue(office.getColor().equals("Green"));
    }

    @Test
    void testGetBuildingType() {
        assertTrue(office.getBuildingType().equals("Ticketing Office"));
    }

    @Test
    void testSetBuildingType() {
        office.setBuildingType("Booth");
        assertTrue(office.getBuildingType().equals("Booth"));
    }

    @Test
    void testGetImagePath() {
        assertTrue(office.getImagePath().equals("TicketingOffice.jpg"));
    }

    @Test
    void testToString() {
        String comparison = "Ticketing Office [Color: Blue, Length: 20.00, Width: 10.00]";
        assertTrue(office.toString().equals(comparison));
    }
}
