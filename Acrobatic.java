/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A class representing an acrobat
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class Acrobatic extends Person {
    private String job;

    /**
     * Constructor for Acrobatic
     *
     * @param name name of acrobat
     * @param age age of acrobat
     * @param yearsWorked years the acrobat has worked
     * @param job the acrobat's specific job
     * @param imagePath path to acrobat image
     */
    public Acrobatic(String name, int age, int yearsWorked, String job, String imagePath) {
        super(name, age, yearsWorked, job, imagePath);
        this.job = job;
    }

    /**
     * Returns the acrobat's job title
     *
     * @return acrobat's job
     */
    @Override
    public String getJob() {
        return job;
    }

    /**
     * Returns a string for the acrobat
     * 
     * @return acrobat string
     */
    @Override
    public String toString() {
        return String.format("Acrobatic [%s]", super.toString());
    }
}
