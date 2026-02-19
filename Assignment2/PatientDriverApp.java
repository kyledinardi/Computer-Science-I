/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Displays information about a patient, the procedures they have undergone, and the total cost of 
 * their treatment
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

	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.print("Enter your first name: ");
			String firstName = keyboard.nextLine();

			System.out.print("Enter your middle name: ");
			String middleName = keyboard.nextLine();

			System.out.print("Enter your last name: ");
			String lastName = keyboard.nextLine();

			System.out.print("Enter your street address: ");
			String streetAddress = keyboard.nextLine();

			System.out.print("Enter your city: ");
			String city = keyboard.nextLine();

			System.out.print("Enter your state: ");
			String state = keyboard.nextLine();

			System.out.print("Enter your ZIP code: ");
			String zipCode = keyboard.nextLine();

			System.out.print("Enter your phone number: ");
			String phoneNumber = keyboard.nextLine();

			System.out.print("Enter your emergency contact's name: ");
			String emergencyContactName = keyboard.nextLine();

			System.out.print("Enter your emergency contact's phone number: ");
			String emergencyContactPhoneNumber = keyboard.nextLine();

			Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode,
					phoneNumber, emergencyContactName, emergencyContactPhoneNumber);

			System.out.print("Enter the name of the first procedure: ");
			String procedure1Name = keyboard.nextLine();

			System.out.print("Enter the date of the first procedure: ");
			String procedure1Date = keyboard.nextLine();

			System.out.print("Enter the name of the practitioner who performed the first procedure: ");
			String procedure1Practitioner = keyboard.nextLine();

			System.out.print("Enter the charges for the first Procedure: ");
			double procedure1Charges = keyboard.nextDouble();
			keyboard.nextLine();

			Procedure procedure1 = new Procedure();
			procedure1.setName(procedure1Name);
			procedure1.setDate(procedure1Date);
			procedure1.setPractitioner(procedure1Practitioner);
			procedure1.setCharges(procedure1Charges);

			System.out.print("Enter the name of the second procedure: ");
			String procedure2Name = keyboard.nextLine();

			System.out.print("Enter the date of the second procedure: ");
			String procedure2Date = keyboard.nextLine();

			System.out.print("Enter the name of the practitioner who performed the second procedure: ");
			String procedure2Practitioner = keyboard.nextLine();

			System.out.print("Enter the charges for the second Procedure: ");
			double procedure2Charges = keyboard.nextDouble();
			keyboard.nextLine();

			Procedure procedure2 = new Procedure(procedure2Name, procedure2Date);
			procedure2.setPractitioner(procedure2Practitioner);
			procedure2.setCharges(procedure2Charges);

			System.out.print("Enter the name of the third procedure: ");
			String procedure3Name = keyboard.nextLine();

			System.out.print("Enter the date of the third procedure: ");
			String procedure3Date = keyboard.nextLine();

			System.out.print("Enter the name of the practitioner who performed the third procedure: ");
			String procedure3Practitioner = keyboard.nextLine();

			System.out.print("Enter the charges for the third Procedure: ");
			double procedure3Charges = keyboard.nextDouble();
			keyboard.nextLine();

			Procedure procedure3 = new Procedure(procedure3Name, procedure3Date, procedure3Practitioner, procedure3Charges);
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
