/*
* Class: CMSC203
* Instructor: Professor Tanveer
* Description: Tests for the gradebook
* Due: 03/03/2026
* Platform/compiler: Linux, Eclipse, Java 21
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
* Print your Name here: Kyle Dinardi
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook gradeBook1;
	GradeBook gradeBook2;

	@BeforeEach
	void setUp() throws Exception {
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);

		gradeBook1.addScore(91.3);
		gradeBook1.addScore(93.9);

		gradeBook2.addScore(51.3);
		gradeBook2.addScore(58.8);
		gradeBook2.addScore(57.5);
		gradeBook2.addScore(87.1);
		gradeBook2.addScore(92.6);

	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(gradeBook1.addScore(98.5));
		assertFalse(gradeBook2.addScore(81.8));

		assertTrue(gradeBook1.toString().equals("91.3 93.9 98.5"));
		assertTrue(gradeBook2.toString().equals("51.3 58.8 57.5 87.1 92.6"));
		assertEquals(gradeBook1.getScoreSize(), 3);
		assertEquals(gradeBook2.getScoreSize(), 5);
	}

	@Test
	void testSum() {
		assertEquals(gradeBook1.sum(), 185.2, .01);
		assertEquals(gradeBook2.sum(), 347.3, .01);
	}

	@Test
	void testMinimum() {
		assertEquals(gradeBook1.minimum(), 91.3);
		assertEquals(gradeBook2.minimum(), 51.3);
	}

	@Test
	void testFinalScore() {
		assertEquals(gradeBook1.finalScore(), 93.9, .01);
		assertEquals(gradeBook2.finalScore(), 296, .01);
		assertEquals(new GradeBook(0).finalScore(), 0);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(gradeBook1.getScoreSize(), 2);
		assertEquals(gradeBook2.getScoreSize(), 5);
	}

	@Test
	void testToString() {
		assertTrue(gradeBook1.toString().equals("91.3 93.9"));
		assertTrue(gradeBook2.toString().equals("51.3 58.8 57.5 87.1 92.6"));
	}

}
