import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for Ticket class
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */
class TicketTestStudent {
    Ticket ticket;

    @BeforeEach
    void setUp() throws Exception {
        ticket = new Ticket("MONDAY", 10.00, "Adult");
    }

    @AfterEach
    void tearDown() throws Exception {
        ticket = null;
    }

    @Test
    void testToString() {
        String comparison = "Ticket [Day: Monday, Price: $10.00, Customer Type: Adult]\n";
        System.out.println(ticket.toString());
        assertTrue(ticket.toString().equals(comparison));
    }
}
