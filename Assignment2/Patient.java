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
 * This class represents a patient. It stores the their full name, address, and
 * emergency contact details in their individual parts. Its methods get and set
 * the fields, build strings for each set of fields, and combine all of the
 * fields into a string.
 */
public class Patient {
	private String firstName;
	private String middleName;
	private String lastName;

	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;

	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhoneNumber;

	/**
	 * Creates a new patient with null values.
	 */
	public Patient() {
	}

	/**
	 * Creates a new patient with a first, middle, and last name.
	 */
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	/**
	 * Creates a new patient a full name, address, phone number, and emergency
	 * contact details.
	 */
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city,
			String state, String zipCode, String phoneNumber, String emergencyContactName,
			String emergencyContactPhoneNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;

		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;

		this.phoneNumber = phoneNumber;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}

	/**
	 * Gets the patient's first name.
	 * 
	 * @return patient first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets the patient's middle name.
	 * 
	 * @return patient middle name
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Gets the patient's last name.
	 * 
	 * @return patient last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Gets the patient's street address.
	 * 
	 * @return patient street address
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Gets the patient's city.
	 * 
	 * @return patient city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Gets the patient's state.
	 * 
	 * @return patient state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Gets the patient's ZIP code.
	 * 
	 * @return patient ZIP code
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Gets the patient's phone number.
	 * 
	 * @return patient phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Gets the patient's emergency contact's name.
	 * 
	 * @return emergency contact name
	 */
	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	/**
	 * Gets the patient's emergency contact's phone number.
	 * 
	 * @return emergency contact phone number
	 */
	public String getEmergencyContactPhoneNumber() {
		return emergencyContactPhoneNumber;
	}

	/**
	 * Sets the patient's first name.
	 * 
	 * @param firstName the patient's first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Sets the patient's middle name.
	 * 
	 * @param middleName the patient's middle name
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * Sets the patient's last name.
	 * 
	 * @param lastName the patient's last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Sets the patient's street address.
	 * 
	 * @param streetAddress the patient's street address
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * Sets the patient's city.
	 * 
	 * @param city the patient's city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Sets the patient's state.
	 * 
	 * @param state the patient's state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Sets the patient's ZIP code.
	 * 
	 * @param zipCode the patient's ZIP code
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * Sets the patient's phone number.
	 * 
	 * @param phoneNumber the patient's phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Sets the patient's emergency contact's name.
	 * 
	 * @param emergencyContactName the emergency contact's name
	 */
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	/**
	 * Sets the patient's emergency contact's phone number.
	 * 
	 * @param emergencyContactPhoneNumber the emergency contact's phone number
	 */
	public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}

	public String buildFullName() {
		return String.format("%s %s %s", firstName, middleName, lastName);
	}

	public String buildAddress() {
		return String.format("%s %s %s %s", streetAddress, city, state, zipCode);
	}

	public String buildEmergencyContact() {
		return String.format("%s %s", emergencyContactName, emergencyContactPhoneNumber);
	}

	@Override
	public String toString() {
		return String.format("Name: %s\nAddress: %s\nPhone number: %s\nEmergencyContact: %s", buildFullName(),
				buildAddress(), getPhoneNumber(), buildEmergencyContact());
	}
}
