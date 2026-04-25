/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A class representing an arena
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class Arena implements Building {
    // instance variables
    private String color;
    private double length;
    private double width;
    private String buildingType;
    private String imagePath;

    /**
     * Constructor for Arena
     *
     * @param color color of arena
     * @param length length of arena
     * @param width width of arena
     * @param imagePath path to arena image
     */
    public Arena(String color, double length, double width, String imagePath) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.buildingType = "Arena";
        this.imagePath = imagePath;
    }

    /**
     * Sets length and width of arena
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
     * Gets length of arena
     *
     * @return length of arena
     */
    @Override
    public double getLength() {
        return length;
    }

    /**
     * Gets width of arena
     *
     * @return width of arena
     */
    @Override
    public double getWidth() {
        return width;
    }

    /**
     * Sets color of arena
     *
     * @param new color
     */
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets color of arena
     *
     * @return color of arena
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * Sets building type of arena
     *
     * @param type new building type
     */
    @Override
    public void setBuildingType(String type) {
        this.buildingType = type;
    }

    /**
     * Gets building type of arena
     *
     * @return building type of arena
     */
    @Override
    public String getBuildingType() {
        return buildingType;
    }

    /**
     * Gets path to arena image
     *
     * @return path to image
     */
    @Override
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Returns a string for the arena
     *
     * @return arena string
     */
    @Override
    public String toString() {
        return String.format("Arena [Color: %s, Length: %.2f, Width: %.2f]", color, length, width);
    }
}
