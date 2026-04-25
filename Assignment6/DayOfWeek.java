/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: An enum for the days of the week
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */
public enum DayOfWeek {
    MONDAY(0.10),
    TUESDAY(0.10),
    WEDNESDAY(0.10),
    THURSDAY(0.10),
    FRIDAY(0.10),
    SATURDAY(0.0),
    SUNDAY(0.0);

    private final double discount;

    /**
     * Constructor for DayOfWeek
     *
     * @param discount the discount for the specific day
     */
    DayOfWeek(double discount) {
        this.discount = discount;
    }

    /**
     * Provides access to the enum constant's discount value
     *
     * @return discount for the specific day
     */
    public double getDiscount() {
        return discount;
    }
}
