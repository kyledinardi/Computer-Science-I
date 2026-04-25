/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A class representing a ticketing office
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class TicketingOffice implements Building {
    // instance variables
    private String color;
    private double length;
    private double width;
    private String buildingType;
    private String imagePath;

    /**
     * Constructor for TicketingOffice
     *
     * @param color color of ticketing office
     * @param length length of ticketing office
     * @param width width of ticketing office
     * @param imagePath path to ticketing office image
     */
    public TicketingOffice(String color, double length, double width, String imagePath) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.buildingType = "Ticketing Office";
        this.imagePath = imagePath;
    }

    /**
     * Sets length and width of ticketing office
     *
     * @param length new length
     * @param width new width
     */
    @Override
    public void setSize(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Gets length of ticketing office
     *
     * @return length of ticketing office
     */
    @Override
    public double getLength() {
        return length;
    }

    /**
     * Gets width of ticketing office
     *
     * @return width of ticketing office
     */
    @Override
    public double getWidth() {
        return width;
    }

    /**
     * Sets color of ticketing office
     *
     * @param color new color
     */
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets length of ticketing office
     *
     * @return length of ticketing office
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * Sets building type of ticketing office
     *
     * @param type new building type
     */
    @Override
    public void setBuildingType(String type) {
        this.buildingType = type;
    }

    /**
     * Gets building type of ticketing office
     *
     * @return building type of ticketing office
     */
    @Override
    public String getBuildingType() {
        return buildingType;
    }

    /**
     * Gets path to ticketing office image
     *
     * @return path to image
     */
    @Override
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Returns a string for the ticketing office
     *
     * @return ticketing office string
     */
    @Override
    public String toString() {
        return String.format(
                "Ticketing Office [Color: %s, Length: %.2f, Width: %.2f]", color, length, width);
    }
}
