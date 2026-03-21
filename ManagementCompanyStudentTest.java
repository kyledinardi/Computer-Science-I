import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for the ManagementCompany class
 * Due: 03/31/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

class ManagementCompanyStudentTest {
    private ManagementCompany company;

    @BeforeEach
    void setUp() throws Exception {
        company = new ManagementCompany("Campus Realty", "123-45-6789");
        company.addProperty(new Property("Property-1", "Rockville", 3500, "Joe"));
    }

    @AfterEach
    void tearDown() throws Exception {
        company = null;
    }

    @Test
    void testAddProperty() {
        Property p = company.getProperty(0);
        assertTrue(p.getPropertyName().equals("Property-1"));
        assertTrue(p.getCity().equals("Rockville"));
        assertTrue(p.getRentAmount() == 3500);
        assertTrue(p.getOwner().equals("Joe"));
    }

    @Test
    void testDeepCopy() {
        Property p = company.getProperty(0);
        p.setPropertyName("Property-2");
        assertTrue(company.getProperty(0).getPropertyName().equals("Property-1"));
    }

    @Test
    void testTooManyProperties() {
        company.addProperty(new Property("Property-2", "Gaithersburg", 2500, "Mary"));
        company.addProperty(new Property("Property-3", "Germantown", 1500, "Alice"));
        company.addProperty(new Property("Property-4", "Takoma Park", 500, "Bob"));
        company.addProperty(new Property("Property-5", "Silver Spring", 4500, "Charlie"));

        int index = company.addProperty(new Property("Property-6", "Bethesda", 5500, "David"));
        assertTrue(index == -1);
    }

    @Test
    void testTotalRent() {
        company.addProperty(new Property("Property-2", "Gaithersburg", 2500, "Mary"));
        company.addProperty(new Property("Property-3", "Germantown", 1500, "Alice"));
        company.addProperty(new Property("Property-4", "Takoma Park", 500, "Bob"));
        company.addProperty(new Property("Property-5", "Silver Spring", 4500, "Charlie"));
        assertTrue(company.totalRent() == 3500 + 2500 + 1500 + 500 + 4500);
    }
}
