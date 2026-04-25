import java.util.InputMismatchException;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A custom exception class for input mismatches
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class CustomInputMismatchException extends InputMismatchException {
    /** */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor for exception. Sends message to superclass
     * 
     * @param msg the error message
     */
    public CustomInputMismatchException(String msg) {
        super(msg);
    }
}
