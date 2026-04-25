/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A class representing a clerk
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class Clerk extends Person {
    private String job;

    /**
     * Constructor for Clerk
     * 
     * @param name name of clerk
     * @param age age of clerk
     * @param yearsWorked years the clerk has worked
     * @param job the clerk's specific job
     * @param imagePath path to clerk image
     */
    public Clerk(String name, int age, int yearsWorked, String job, String imagePath) {
        super(name, age, yearsWorked, job, imagePath);
        this.job = job;
    }

    /**
     * Returns the clerk's job title
     * 
     * @return clerk's job
     */
    @Override
    public String getJob() {
        return job;
    }

    /**
     * Returns a string for the clerk
     * 
     * @return clerk string
     */
    @Override
    public String toString() {
        return String.format("Clerk [%s]", super.toString());
    }
}
