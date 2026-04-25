/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A class representing a dog
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class Dog implements Animal {
    private String name;
    private int age;
    private String species;
    private String color;
    private String imagePath;

    /**
     * Constructor for Dog
     *
     * @param name name of dog
     * @param age age of dog
     * @param species species of dog
     * @param color color of dog
     * @param imagePath path to dog image
     */
    public Dog(String name, int age, String species, String color, String imagePath) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        this.imagePath = imagePath;
    }

    /** Prints dog sound to console */
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    /** Prints dog movement to console */
    @Override
    public void move() {
        System.out.println("Walks around.\n");
    }

    /**
     * Gets name of dog
     *
     * @return name of dog
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets age of dog
     *
     * @return age of dog
     */
    @Override
    public int getAge() {
        return age;
    }

    /**
     * Gets species of dog
     *
     * @return species of dog
     */
    @Override
    public String getSpecies() {
        return species;
    }

    /**
     * Gets color of dog
     *
     * @return color of dog
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * Gets path to dog image
     *
     * @return path to image
     */
    @Override
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Tests two dogs for equality
     *
     * @param other other dog to test
     * @return true if dogs are equal false otherwise
     */
    @Override
    public boolean equals(Object other) {
        // Check for reference equality
        if (this == other) {
            return true;
        }

        // Check for null or different class
        if (other == null || !(other instanceof Dog)) {
            return false;
        }

        Dog otherDog = (Dog) other;

        // Compare fields for logical equality
        if (name.equals(otherDog.getName())
                && age == otherDog.getAge()
                && species.equals(otherDog.getSpecies())
                && color.equals(otherDog.getColor())
                && imagePath.equals(otherDog.getImagePath())) {
            return true;
        }

        return false;
    }

    /**
     * Returns a string for the dog
     *
     * @return dog string
     */
    @Override
    public String toString() {
        return String.format(
                "Dog [Name: %s, Age: %d, Species: %s, Color: %s]", name, age, species, color);
    }
}
