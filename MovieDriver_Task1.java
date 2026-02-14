/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Reads movie info and prints it as one string.
 * Due: 02/24/2026
 * Platform/compiler: Eclipse, Java 25, Linux 
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or 
 * any source. I have not given my code to any student. 
 * Print your Name here: Kyle Dinardi
 */

import java.util.Scanner;

public class MovieDriver_Task1 {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in)) {
			Movie movie = new Movie();

			System.out.println("Enter the name of a movie");
			String title = keyboard.nextLine();
			movie.setTitle(title);

			System.out.println("Enter the rating of the movie");
			String rating = keyboard.nextLine();
			movie.setRating(rating);

			System.out.println("Enter the number of tickets sold for this movie");
			int soldTickets = keyboard.nextInt();
			movie.setSoldTickets(soldTickets);

			System.out.println(movie.toString());
		}

		System.out.println("Goodbye");
	}
}
