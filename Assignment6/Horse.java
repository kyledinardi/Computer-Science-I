/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A class representing a horse
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class Horse implements Animal {
    private String name;
    private int age;
    private String species;
    private String color;
    private String imagePath;

    /**
     * Constructor for Horse
     *
     * @param name name of horse
     * @param age age of horse
     * @param species species of horse
     * @param color color of horse
     * @param imagePath path to horse image
     */
    public Horse(String name, int age, String species, String color, String imagePath) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        this.imagePath = imagePath;
    }

    /** Prints horse sound to console */
    @Override
    public void makeSound() {
        System.out.println("Neigh!");
    }

    /** Prints horse movement to console */
    @Override
    public void move() {
        System.out.println("Gallops.\n");
    }

    /**
     * Gets name of horse
     *
     * @return name of horse
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets age of horse
     *
     * @return age of horse
     */
    @Override
    public int getAge() {
        return age;
    }

    /**
     * Gets species of horse
     *
     * @return species of horse
     */
    @Override
    public String getSpecies() {
        return species;
    }

    /**
     * Gets color of horse
     *
     * @return color of horse
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * Gets path to horse image
     *
     * @return path to image
     */
    @Override
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Tests two horses for equality
     *
     * @param other other horse to test
     * @return true if horses are equal false otherwise
     */
    @Override
    public boolean equals(Object other) {
        // Check for reference equality
        if (this == other) {
            return true;
        }

        // Check for null or different class
        if (other == null || !(other instanceof Horse)) {
            return false;
        }

        Horse otherHorse = (Horse) other;

        // Compare fields for logical equality
        if (name.equals(otherHorse.getName())
                && age == otherHorse.getAge()
                && species.equals(otherHorse.getSpecies())
                && color.equals(otherHorse.getColor())
                && imagePath.equals(otherHorse.getImagePath())) {
            return true;
        }

        return false;
    }

    /**
     * Returns a string for the horse
     *
     * @return horse string
     */
    @Override
    public String toString() {
        return String.format(
                "Horse [Name: %s, Age: %d, Species: %s, Color: %s]", name, age, species, color);
    }
}
