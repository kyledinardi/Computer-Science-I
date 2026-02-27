import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Ashique Tanveer
 * Description: Tests the CryptoManager class
 * Due: 03/10/2026
 * Platform/compiler: Linux, Eclipse, Java 21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

class CryptoManagerStudentTest {

    @BeforeEach
    void setUp() throws Exception {}

    @AfterEach
    void tearDown() throws Exception {}

    @Test
    void testIsStringInBoundsValid() {
        assertTrue(CryptoManager.isStringInBounds("A"));
    }

    @Test
    void testIsStringInBoundsInvalid() {
        assertFalse(CryptoManager.isStringInBounds("a"));
    }

    @Test
    void testVigenereEncryption() {
        assertEquals(CryptoManager.vigenereEncryption("M", "D"), "1");
    }

    @Test
    void testVigenereDecryption() {
        assertEquals(CryptoManager.vigenereDecryption("1", "D"), "M");
    }

    @Test
    void testCreatePlayfairMantrix() {
        char[][] matrix = {
            {'M', 'O', 'N', 'T', 'G', 'E', 'R', 'Y'},
            {'A', 'B', 'C', 'D', 'F', 'H', 'I', 'J'},
            {'K', 'L', 'P', 'Q', 'S', 'U', 'V', 'W'},
            {'X', 'Z', '0', '1', '2', '3', '4', '5'},
            {'6', '7', '8', '9', ' ', '!', '"', '#'},
            {'$', '%', '&', '\'', '(', ')', '*', '+'},
            {',', '-', '.', '/', ':', ';', '<', '='},
            {'>', '?', '@', '[', '\\', ']', '^', '_'}
        };

        assertArrayEquals(CryptoManager.createPlayfairMantrix("MONTGOMERY"), matrix);
    }

    @Test
    void testCreatePlayfairTextArray() {
        char[][] textArray = {{'M', 'E'}, {'E', 'T'}, {' ', 'Y'}, {'O', 'U'}};
        assertArrayEquals(CryptoManager.createPlayfairTextArray("MEET YOU"), textArray);
    }

    @Test
    void testFindPlayfairPair() {
        char[][] matrix = CryptoManager.createPlayfairMantrix("MONTGOMERY");
        char[] pair = {'M', 'E'};
        int[][] pairPosition = {{0, 0}, {0, 5}};
        assertArrayEquals(CryptoManager.findPlayfairPair(matrix, pair), pairPosition);
    }

    @Test
    void testPlayfairEncryption() {
        assertEquals(CryptoManager.playfairEncryption("MEET YOU", "MONTGOMERY"), "ORRG#GEL");
    }

    @Test
    void testPlayfairDecryption() {
        assertEquals(CryptoManager.playfairDecryption("ORRG#GEL", "MONTGOMERY"), "MEET YOU");
    }

    @Test
    void testCaesarEncryption() {
        assertEquals(CryptoManager.caesarEncryption("A", 4), "E");
    }

    @Test
    void testCaesarDecryption() {
        assertEquals(CryptoManager.caesarDecryption("E", 4), "A");
    }
}
