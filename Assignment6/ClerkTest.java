import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClerkTest {
	Clerk clerk;

    @BeforeEach
    void setUp() throws Exception {
    	clerk = new Clerk("Jim", 30, 3, "Ticket Taker", "TicketingCashier.jpg");
    }

    @AfterEach
    void tearDown() throws Exception {
    	clerk = null;
    }

    @Test
    void testGetJob() {
        assertTrue(clerk.getJob().equals("Ticket Taker"));
    }

    @Test
    void testToString() {
        String comparison = "Clerk [Name: Jim, Age: 30, Job: Ticket Taker, Years Worked: 3]";
        assertTrue(clerk.toString().equals(comparison));
    }

    @Test
    void testGetName() {
        assertTrue(clerk.getName().equals("Jim"));
    }

    @Test
    void testGetAge() {
        assertTrue(clerk.getAge() == 30);
    }

    @Test
    void testGetYearsWorked() {
        assertTrue(clerk.getYearsWorked() == 3);
    }

    @Test
    void testGetImagePath() {
        assertTrue(clerk.getImagePath().equals("TicketingCashier.jpg"));
    }
}
