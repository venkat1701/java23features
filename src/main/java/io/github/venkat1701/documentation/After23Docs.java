package io.github.venkat1701.documentation;

/**
 * The `After23Docs` class provides utility methods
 * for performing basic mathematical operations and string manipulations.
 *
 * ## Methods Overview
 * - Add two numbers
 * - Concatenate two strings
 * - Find the maximum of two integers
 *
 * Each method is documented with Markdown syntax to provide
 * a structured and easily readable documentation.
 *
 * @author Venkat
 */
public class After23Docs {

    /**
     * Adds two integers and returns the result.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of `a` and `b`.
     *
     * ### Example usage:
     * ```java
     * int result = After23Docs.add(5, 10);
     * System.out.println(result);  // Outputs 15
     * ```
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Concatenates two strings and returns the combined result.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return The concatenated string.
     *
     * ### Example usage:
     * ```java
     * String result = After23Docs.concatenate("Hello", " World");
     * System.out.println(result);  // Outputs "Hello World"
     * ```
     */
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    /**
     * Returns the maximum of two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The greater of `a` and `b`.
     *
     * ### Example usage:
     * ```java
     * int result = After23Docs.max(3, 7);
     * System.out.println(result);  // Outputs 7
     * ```
     */
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
