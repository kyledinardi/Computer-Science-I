/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A class representing a bird
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class Bird implements Animal {
    // instance variables
    private String name;
    private int age;
    private String species;
    private String color;
    private String imagePath;

    /**
     * Constructor for Bird
     *
     * @param name name of bird
     * @param age age of bird
     * @param species species of bird
     * @param color color of bird
     * @param imagePath path to bird image
     */
    public Bird(String name, int age, String species, String color, String imagePath) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        this.imagePath = imagePath;
    }

    /** Prints bird sound to console */
    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }

    /** Prints bird movement to console */
    @Override
    public void move() {
        System.out.println("Flies\n");
    }

    /**
     * Gets name of bird
     *
     * @return name of bird
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets age of bird
     *
     * @return age of bird
     */
    @Override
    public int getAge() {
        return age;
    }

    /**
     * Gets species of bird
     *
     * @return species of bird
     */
    @Override
    public String getSpecies() {
        return species;
    }

    /**
     * Gets color of bird
     *
     * @return color of bird
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * Gets path to bird image
     *
     * @return path to image
     */
    @Override
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Tests two birds for equality
     *
     * @param other other bird to test
     * @return true if birds are equal false otherwise
     */
    @Override
    public boolean equals(Object other) {
        // Check for reference equality
        if (this == other) {
            return true;
        }

        // Check for null or different class
        if (other == null || !(other instanceof Bird)) {
            return false;
        }

        Bird otherBird = (Bird) other;

        // Compare fields for logical equality
        if (name.equals(otherBird.getName())
                && age == otherBird.getAge()
                && species.equals(otherBird.getSpecies())
                && color.equals(otherBird.getColor())
                && imagePath.equals(otherBird.getImagePath())) {
            return true;
        }

        return false;
    }

    /**
     * Returns a string for the bird
     * 
     * @return bird string
     */
    @Override
    public String toString() {
        return String.format(
                "Bird [Name: %s, Age: %d, Species: %s, Color: %s]", name, age, species, color);
    }
}
