/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A class representing a ticket
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class Ticket {
    private String dayOfWeek;
    private double price;
    private String customerTypeName;

    /**
     * Constructor for Ticket
     *
     * @param dayOfWeek day of week the ticket was bought
     * @param price price of ticket
     * @param customerTypeName type of customer
     */
    public Ticket(String dayOfWeek, double price, String customerTypeName) {
        this.dayOfWeek = dayOfWeek.toLowerCase();
        this.price = price;
        this.customerTypeName = customerTypeName;
    }

    /** Prints the ticket details to the console */
    public void displayTicketDetails() {
        System.out.printf(
                "Ticket Details: [Day: %s, Price: $%.2f, Customer Type: %s]%n",
                dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1),
                price,
                customerTypeName);
    }

    /**
     * Returns a string for the ticket
     * 
     * @return ticket string
     */
    @Override
    public String toString() {
        return String.format(
                "Ticket [Day: %s, Price: $%.2f, Customer Type: %s]%n",
                dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1),
                price,
                customerTypeName);
    }
}
