/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Displays information about a patient, the procedures they have undergone, and the total cost of 
 * their treatment.
 * Due: 02/24/2026
 * Platform/compiler: Eclipse, Java 21, Linux 
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or 
 * any source. I have not given my code to any student. 
 * Print your Name here: Kyle Dinardi
 */

import java.util.Scanner;

public class PatientDriverApp {
	/**
	 * Displays a patient's information
	 * 
	 * @param patient the patient to display
	 */
	public static void displayPatient(Patient patient) {
		System.out.println(patient.toString());
	}

	/**
	 * Displays a procedure's information.
	 * 
	 * @param procedure the procedure to display
	 */
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}

	/**
	 * Calculates the total charges for three procedures.
	 * 
	 * @param procedure1 the first procedure
	 * @param procedure2 the second procedure
	 * @param procedure3 the third procedure
	 * @return
	 */
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
	}

	/**
	 * Loops prompt, input, and error until the input is not empty.
	 * 
	 * @param textToPrint
	 * @param keyboard
	 * @return
	 */
	public static String validateString(String textToPrint, Scanner keyboard) {
		String input = "";

		while (input.equals("")) {
			System.out.print(textToPrint);
			input = keyboard.nextLine();

			if (input.equals("")) {
				System.out.println("Invalid input: cannot be empty.");
			}
		}

		return input;
	}

	public static double validateDouble(String textToPrint, Scanner keyboard) {
		double input = -1;
		
		while (input < 0) {
			System.out.print(textToPrint);
			input = keyboard.nextDouble();

			if (input < 0) {
				System.out.println("Invalid input: charges cannot be negative.");
			}
		}
		
		return input;
	}

	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in)) {
			String firstName = validateString("Enter your first name: ", keyboard);
			String middleName = validateString("Enter your middle name: ", keyboard);
			String lastName = validateString("Enter your last name: ", keyboard);

			String streetAddress = validateString("Enter your street address: ", keyboard);
			String city = validateString("Enter your city: ", keyboard);
			String state = validateString("Enter your state: ", keyboard);
			String zipCode = validateString("Enter your ZIP code: ", keyboard);

			String phoneNumber = validateString("Enter your phone number: ", keyboard);
			String emergencyContactName = validateString("Enter your emergency contact's name: ", keyboard);

			String emergencyContactPhoneNumber = validateString("Enter your emergency contact's phone number: ",
					keyboard);

			Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode,
					phoneNumber, emergencyContactName, emergencyContactPhoneNumber);

			String procedure1Name = validateString("Enter the name of the first procedure: ", keyboard);
			String procedure1Date = validateString("Enter the date of the first procedure: ", keyboard);

			String procedure1Practitioner = validateString(
					"Enter the name of the practitioner who performed the first procedure: ", keyboard);

			double procedure1Charges = validateDouble("Enter the charges for the first Procedure: ", keyboard);
			keyboard.nextLine();
			
			Procedure procedure1 = new Procedure();
			procedure1.setName(procedure1Name);
			procedure1.setDate(procedure1Date);
			procedure1.setPractitioner(procedure1Practitioner);
			procedure1.setCharges(procedure1Charges);

			String procedure2Name = validateString("Enter the name of the second procedure: ", keyboard);
			String procedure2Date = validateString("Enter the date of the second procedure: ", keyboard);

			String procedure2Practitioner = validateString(
					"Enter the name of the practitioner who performed the second procedure: ", keyboard);

			double procedure2Charges = validateDouble("Enter the charges for the second Procedure: ", keyboard);
			keyboard.nextLine();
			
			Procedure procedure2 = new Procedure(procedure2Name, procedure2Date);
			procedure2.setPractitioner(procedure2Practitioner);
			procedure2.setCharges(procedure2Charges);

			String procedure3Name = validateString("Enter the name of the third procedure: ", keyboard);
			String procedure3Date = validateString("Enter the date of the third procedure: ", keyboard);

			String procedure3Practitioner = validateString(
					"Enter the name of the practitioner who performed the third procedure: ", keyboard);

			double procedure3Charges = validateDouble("Enter the charges for the third Procedure: ", keyboard);
			keyboard.nextLine();

			Procedure procedure3 = new Procedure(procedure3Name, procedure3Date, procedure3Practitioner,
					procedure3Charges);

			System.out.println();
			displayPatient(patient);
			System.out.println();

			displayProcedure(procedure1);
			displayProcedure(procedure2);
			displayProcedure(procedure3);

			System.out.println();
			System.out.printf("Total Charges: $%,.2f\n\n", calculateTotalCharges(procedure1, procedure2, procedure3));
			System.out.println("This program was deveoloped by a Student: Kyle Dinardi 02/18/26");
		}
	}
}
