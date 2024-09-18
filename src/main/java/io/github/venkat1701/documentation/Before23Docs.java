package io.github.venkat1701.documentation;

/**
 * The {@code Before23Docs} class provides utility methods
 * for performing basic mathematical operations and string manipulations.
 *
 * <p>Each method is documented with HTML tags to provide
 * a structured and easily understandable documentation.
 *
 * <p>Methods included:
 * <ul>
 *   <li>Add two numbers</li>
 *   <li>Concatenate two strings</li>
 *   <li>Find the maximum of two integers</li>
 * </ul>
 *
 * @author Venkat
 */
public class Before23Docs {

    /**
     * Adds two integers and returns the result.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The sum of {@code a} and {@code b}
     *
     * <p>Example usage:
     * <pre>
     * {@code
     * int result = Before23Docs.add(5, 10);
     * System.out.println(result);  // Outputs 15
     * }
     * </pre>
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Concatenates two strings and returns the combined result.
     *
     * @param str1 The first string
     * @param str2 The second string
     * @return The concatenated string
     *
     * <p>Example usage:
     * <pre>
     * {@code
     * String result = Before23Docs.concatenate("Hello", " World");
     * System.out.println(result);  // Outputs "Hello World"
     * }
     * </pre>
     */
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    /**
     * Returns the maximum of two integers.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The greater of {@code a} and {@code b}
     *
     * <p>Example usage:
     * <pre>
     * {@code
     * int result = Before23Docs.max(3, 7);
     * System.out.println(result);  // Outputs 7
     * }
     * </pre>
     */
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
