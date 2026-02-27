import java.util.LinkedHashSet;

/*
 * Class: CMSC203
 * Instructor: Ashique Tanveer
 * Description: Encrypts and decrypts using three different algorithms
 * Due: 03/10/2026
 * Platform/compiler: Linux, Eclipse, Java 21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

/**
 * This is a utility class that encrypts and decrypts a phrase using three different approaches.
 *
 * <p>The first approach is called the Vigenere Cipher.Vigenere encryption is a method of encrypting
 * alphabetic text based on the letters of a keyword.
 *
 * <p>The second approach is Playfair Cipher. It encrypts two letters (a digraph) at a time instead
 * of just one.
 *
 * <p>The third approach is Caesar Cipher. It is a simple replacement cypher.
 *
 * @author Huseyin Aygun
 * @version 8/3/2025
 */
public class CryptoManager {
    // Valid character range for all ciphers
    private static final char LOWER_RANGE = ' ';
    private static final char UPPER_RANGE = '_';
    private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

    // Use 64-character matrix (8X8) for Playfair cipher
    private static final String ALPHABET64 =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 !\"#$%&'()*+,-./:;<=>?@[\\]^_";

    /**
     * Makes sure every character in an input string is valid.
     *
     * @param plainText The string to be encrypted
     * @return True if the string is valid, false otherwise
     */
    public static boolean isStringInBounds(String plainText) {
        for (int i = 0; i < plainText.length(); i++) {
            if (!(plainText.charAt(i) >= LOWER_RANGE && plainText.charAt(i) <= UPPER_RANGE)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Vigenere Cipher is a method of encrypting alphabetic text based on the letters of a keyword.
     * It works as below: Choose a keyword (e.g., KEY). Repeat the keyword to match the length of
     * the plaintext. Each letter in the plaintext is shifted by the position of the corresponding
     * letter in the keyword (A = 0, B = 1, ..., Z = 25).
     *
     * @param plainText The string to be encrypted
     * @param key The encryption key
     * @return The input encrypted with the Vigenere cipher
     */
    public static String vigenereEncryption(String plainText, String key) {
        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }

        StringBuilder encryptedText = new StringBuilder();
        int keyLen = key.length();

        for (int i = 0; i < plainText.length(); i++) {
            int plainPoint = plainText.charAt(i) - LOWER_RANGE;
            int keyPoint = key.charAt(i % keyLen) - LOWER_RANGE;
            int encryptedPoint = (plainPoint + keyPoint) % RANGE;
            char encryptedChar = (char) (encryptedPoint + LOWER_RANGE);
            encryptedText.append(encryptedChar);
        }

        return encryptedText.toString();
    }

    /**
     * Vigenere Decryption.
     *
     * @param encryptedText Text encrypted with the Vigenere cipher
     * @param key the encryption key
     * @return The original plaintext string
     */
    public static String vigenereDecryption(String encryptedText, String key) {
        StringBuilder plainText = new StringBuilder();
        int keyLen = key.length();

        for (int i = 0; i < encryptedText.length(); i++) {
            int encryptedPoint = encryptedText.charAt(i) - LOWER_RANGE;
            int keyPoint = key.charAt(i % keyLen) - LOWER_RANGE;
            int plainPoint = (encryptedPoint - keyPoint + RANGE) % RANGE;
            char plainChar = (char) (plainPoint + LOWER_RANGE);
            plainText.append(plainChar);
        }

        return plainText.toString();
    }

    /**
     * Creates a matrix used in the Playfair cipher.
     *
     * @param key The encryption key
     * @return A Playfair matrix created with the key
     */
    public static char[][] createPlayfairMantrix(String key) {
        String keyAndAlpha = key + ALPHABET64;
        LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();

        for (int i = 0; i < keyAndAlpha.length(); i++) {
            charSet.add(keyAndAlpha.charAt(i));
        }

        Character[] charArray = charSet.toArray(new Character[0]);
        int charIndex = 0;
        char[][] matrix = new char[8][8];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = charArray[charIndex];
                charIndex++;
            }
        }

        return matrix;
    }

    /**
     * Splits text into an array of pairs for the Playfair cipher.
     *
     * @param text The text to split into pairs
     * @return An array of each pair of letters from the text
     */
    public static char[][] createPlayfairTextArray(String text) {
        int textLen = text.length();
        int pairCount = (int) Math.ceil(textLen / 2.0);
        char[][] textArray = new char[pairCount][2];

        for (int i = 0; i < textLen; i += 2) {
            textArray[i / 2][0] = text.charAt(i);

            // Pad with 'X' if text length is odd
            textArray[i / 2][1] = i + 1 < textLen ? text.charAt(i + 1) : 'X';
        }

        return textArray;
    }

    /**
     * Finds a pair of characters in a Playfair matrix.
     *
     * @param matrix The Playfair matrix
     * @param pair The pair to be found
     * @return A 2D array of the row and column of each character in the pair
     */
    public static int[][] findPlayfairPair(char[][] matrix, char[] pair) {
        int[][] pairPosition = new int[2][2];
        boolean firstFound = false;
        boolean secondFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == pair[0]) {
                    pairPosition[0][0] = row;
                    pairPosition[0][1] = col;
                    firstFound = true;
                }

                if (matrix[row][col] == pair[1]) {
                    pairPosition[1][0] = row;
                    pairPosition[1][1] = col;
                    secondFound = true;
                }

                // Break out of inner loop if both are found
                if (firstFound && secondFound) {
                    break;
                }
            }

            // Break out of outer loop if both are found
            if (firstFound && secondFound) {
                break;
            }
        }

        return pairPosition;
    }

    /**
     * Playfair Cipher encrypts two letters at a time instead of just one. It works as follows: A
     * matrix (8X8 in our case) is built using a keyword Plaintext is split into letter pairs (e.g.,
     * ME ET YO UR). Encryption rules depend on the positions of the letters in the matrix: Same
     * row: replace each letter with the one to its right. Same column: replace each with the one
     * below. Rectangle: replace each letter with the one in its own row but in the column of the
     * other letter in the pair.
     *
     * @param plainText The string to be encrypted
     * @param key The encryption key
     * @return The input encrypted with the Playfair cipher
     */
    public static String playfairEncryption(String plainText, String key) {
        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }

        StringBuilder encryptedText = new StringBuilder();
        char[][] matrix = createPlayfairMantrix(key);
        char[][] plainArray = createPlayfairTextArray(plainText);

        for (char[] pair : plainArray) {
            int[][] pairPosition = findPlayfairPair(matrix, pair);

            int row1 = pairPosition[0][0];
            int row2 = pairPosition[1][0];
            int col1 = pairPosition[0][1];
            int col2 = pairPosition[1][1];

            if (row1 == row2) {
                encryptedText.append(matrix[row1][(col1 + 1) % matrix[0].length]);
                encryptedText.append(matrix[row1][(col2 + 1) % matrix[0].length]);
            } else if (col1 == col2) {
                encryptedText.append(matrix[(row1 + 1) % matrix.length][col1]);
                encryptedText.append(matrix[(row2 + 1) % matrix.length][col1]);
            } else {
                encryptedText.append(matrix[row1][col2]);
                encryptedText.append(matrix[row2][col1]);
            }
        }

        return encryptedText.toString();
    }

    //
    /**
     * Playfair Decryption.
     *
     * @param encryptedText Text encrypted with the Playfair cipher
     * @param key the encryption key
     * @return The original plaintext string
     */
    public static String playfairDecryption(String encryptedText, String key) {
        StringBuilder plainText = new StringBuilder();
        char[][] matrix = createPlayfairMantrix(key);
        char[][] encryptedArray = createPlayfairTextArray(encryptedText);

        for (char[] pair : encryptedArray) {
            int[][] pairPosition = findPlayfairPair(matrix, pair);

            int row1 = pairPosition[0][0];
            int row2 = pairPosition[1][0];
            int col1 = pairPosition[0][1];
            int col2 = pairPosition[1][1];

            if (row1 == row2) {
                plainText.append(matrix[row1][(col1 - 1 + matrix[0].length) % matrix[0].length]);
                plainText.append(matrix[row1][(col2 - 1 + matrix[0].length) % matrix[0].length]);
            } else if (col1 == col2) {
                plainText.append(matrix[(row1 - 1 + matrix.length) % matrix.length][col1]);
                plainText.append(matrix[(row2 - 1 + matrix.length) % matrix.length][col2]);
            } else {
                plainText.append(matrix[row1][col2]);
                plainText.append(matrix[row2][col1]);
            }
        }

        if (plainText.charAt(plainText.length() - 1) == 'X') {
            plainText.setLength(plainText.length() - 1);
        }

        return plainText.toString();
    }

    /**
     * Caesar Cipher is a simple substitution cipher that replaces each letter in a message with a
     * letter some fixed number of positions down the alphabet. For example, with a shift of 3, 'A'
     * would become 'D', 'B' would become 'E', and so on.
     *
     * @param plainText The string to be encrypted
     * @param key The encryption key
     * @return The input encrypted with the Caesar cipher
     */
    public static String caesarEncryption(String plainText, int key) {
        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            int encryptedCharNormalized = plainText.charAt(i) - LOWER_RANGE + key;
            int encryptedChar = encryptedCharNormalized % RANGE + LOWER_RANGE;
            encryptedText.append((char) encryptedChar);
        }

        return encryptedText.toString();
    }

    /**
     * Caesar Decryption.
     *
     * @param encryptedText Text encrypted with the Caesar cipher
     * @param key the encryption key
     * @return The original plaintext string
     */
    public static String caesarDecryption(String encryptedText, int key) {
        StringBuilder plainText = new StringBuilder();

        for (int i = 0; i < encryptedText.length(); i++) {
            int plainCharNormalized = encryptedText.charAt(i) - LOWER_RANGE - key + RANGE;
            int plainChar = plainCharNormalized % RANGE + LOWER_RANGE;
            plainText.append((char) plainChar);
        }

        return plainText.toString();
    }
}
