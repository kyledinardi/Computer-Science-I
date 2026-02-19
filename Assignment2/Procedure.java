/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Displays information about a patient, their procedures and the total cost of treatment
 * Due: 02/24/2026
 * Platform/compiler: Eclipse, Java 21, Linux 
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or 
 * any source. I have not given my code to any student. 
 * Print your Name here: Kyle Dinardi
 */

/**
 * This class represents a medical procedure. It stores the procedure's name,
 * when it was performed, the name of the practitioner performed it, and the
 * charges. Its methods get and set the fields and combine the fields into a
 * string.
 */
public class Procedure {
	private String name;
	private String date;
	private String practitioner;
	private double charges;

	/**
	 * Creates a new procedure with null values.
	 */
	public Procedure() {
	}

	/**
	 * Creates a new patient with a name and date.
	 */
	public Procedure(String name, String date) {
		this.name = name;
		this.date = date;
	}

	/**
	 * Creates a new patient with a name, date, practitioner, and charges.
	 */
	public Procedure(String name, String date, String practitioner, double charges) {
		this.name = name;
		this.date = date;
		this.practitioner = practitioner;
		this.charges = charges;
	}

	/**
	 * Gets the name of the procedure.
	 * 
	 * @return procedure name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the date of the procedure.
	 * 
	 * @return procedure date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Gets the name of the practitioner who performed the procedure.
	 * 
	 * @return procedure practitioner
	 */
	public String getPractitioner() {
		return practitioner;
	}

	/**
	 * Gets the charges for the procedure.
	 * 
	 * @return procedure charges
	 */
	public double getCharges() {
		return charges;
	}

	/**
	 * Sets the name of the procedure.
	 * 
	 * @param name the procedure's name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the date of the procedure.
	 * 
	 * @param date the procedure's date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Sets the name of the practitioner who performed the procedure.
	 * 
	 * @param practitioner the procedure's practitioner
	 */
	public void setPractitioner(String practitioner) {
		this.practitioner = practitioner;
	}

	/**
	 * Sets the charges for the procedure.
	 * 
	 * @param charges the procedure's charges
	 */
	public void setCharges(double charges) {
		this.charges = charges;
	}

	/**
	 * Returns a formatted and tab-spaced representation of the procedure data.
	 * 
	 * @return string of procedure data
	 */
	@Override
	public String toString() {
		return String.format("Procedure: %-20s\tProcedureDate=%s\tPractitioner=%s\tCharge=$%,.2f", this.name, this.date,
				this.practitioner, this.charges);
	}
}
