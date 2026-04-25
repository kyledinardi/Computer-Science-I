/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A class representing a lion
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class Lion implements Animal {
    // instance variables
    private String name;
    private int age;
    private String species;
    private String color;
    private String imagePath;

    /**
     * Constructor for Lion
     *
     * @param name name of lion
     * @param age age of lion
     * @param species species of lion
     * @param color color of lion
     * @param imagePath path to lion image
     */
    public Lion(String name, int age, String species, String color, String imagePath) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        this.imagePath = imagePath;
    }

    /** Prints lion sound to console */
    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    /** Prints lion movement to console */
    @Override
    public void move() {
        System.out.println("Walks around\n");
    }

    /**
     * Gets name of lion
     *
     * @return name of lion
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets age of lion
     *
     * @return age of lion
     */
    @Override
    public int getAge() {
        return age;
    }

    /**
     * Gets species of lion
     *
     * @return species of lion
     */
    @Override
    public String getSpecies() {
        return species;
    }

    /**
     * Gets color of lion
     *
     * @return color of lion
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * Gets path to lion image
     *
     * @return path to image
     */
    @Override
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Tests two lions for equality
     *
     * @param other other lion to test
     * @return true if lions are equal false otherwise
     */
    @Override
    public boolean equals(Object other) {
        // Check for reference equality
        if (this == other) {
            return true;
        }

        // Check for null or different class
        if (other == null || !(other instanceof Lion)) {
            return false;
        }

        Lion otherLion = (Lion) other;

        // Compare fields for logical equality
        if (name.equals(otherLion.getName())
                && age == otherLion.getAge()
                && species.equals(otherLion.getSpecies())
                && color.equals(otherLion.getColor())
                && imagePath.equals(otherLion.getImagePath())) {
            return true;
        }

        return false;
    }

    /**
     * Returns a string for the lion
     *
     * @return lion string
     */
    @Override
    public String toString() {
        return String.format(
                "Lion [Name: %s, Age: %d, Species: %s, Color: %s]", name, age, species, color);
    }
}
