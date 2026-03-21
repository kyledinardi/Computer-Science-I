/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Creates a management company, adds properties, prints them, and prints their total rent.
 * Due: 03/31/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class PropertyDriver {
    /**
     * Main method for command line implementation
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        ManagementCompany company = new ManagementCompany("Campus Realty", "123-45-6789");
        Property p1 = new Property();

        p1.setPropertyName("Property-1");
        p1.setCity("Rockville");
        p1.setRentAmount(3500);
        p1.setOwner("Joe");

        company.addProperty(p1);
        company.addProperty(new Property("Property-2", "Gaithersburg", 2500, "Mary"));
        System.out.println(company);
        System.out.println(String.format("Total Rent: $%.2f", company.totalRent()));
        System.out.println("Programmed by Kyle Dinardi.");
    }
}
