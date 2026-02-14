/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Continuously reads movie info and prints it as one string until told to stop.
 * Due: 02/24/2026
 * Platform/compiler: Eclipse, Java 25, Linux 
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or 
 * any source. I have not given my code to any student. 
 * Print your Name here: Kyle Dinardi
 */

import java.util.Scanner;

public class MovieDriver_Task2 {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in)) {
			Movie movie = new Movie();
			boolean keepGoing = true;

			while (keepGoing) {
				System.out.println("Enter the name of a movie");
				String title = keyboard.nextLine();
				movie.setTitle(title);

				System.out.println("Enter the rating of the movie");
				String rating = keyboard.nextLine();
				movie.setRating(rating);

				System.out.println("Enter the number of tickets sold for this movie");
				int soldTickets = keyboard.nextInt();
				movie.setSoldTickets(soldTickets);

				// Eats remainder of line.
				keyboard.nextLine();

				System.out.println(movie.toString());
				char yOrN = 0;

				while (yOrN != 'y' && yOrN != 'Y' && yOrN != 'n' && yOrN != 'N') {
					System.out.println("Do you want to enter another? (y or n)");
					yOrN = keyboard.nextLine().charAt(0);

					if (yOrN == 'y' || yOrN == 'Y') {
						// Do nothing if 'y' is entered.
					} else if (yOrN == 'n' || yOrN == 'N') {
						keepGoing = false;
					} else {
						System.out.println("Invalid command: please enter y or n");
					}
				}
			}
		}

		System.out.println("Goodbye");
	}
}
