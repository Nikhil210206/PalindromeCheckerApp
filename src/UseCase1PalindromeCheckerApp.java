/**
 * UseCase1PalindromeCheckerApp
 *
 * UC1: Application Entry & Welcome Message
 * Displays application name and version at startup.
 */

public class UseCase1PalindromeCheckerApp {

    // Application constants
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "Version 1.0";

    /**
     * Main Method - Entry point of the Java application
     * JVM starts execution from here
     */
    public static void main(String[] args) {

        // Display Welcome Message
        System.out.println("=====================================");
        System.out.println("     Welcome to " + APP_NAME);
        System.out.println("            " + VERSION);
        System.out.println("=====================================");
        System.out.println("This application checks whether a given string is a palindrome.");
        System.out.println();
        System.out.println("Program initialized successfully.");
    }
}
