//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//version 1.0
//author tarun
//usecase 1: welcome page

/**
 * MAIN CLASS - UseCase1PalindromeApp
 * Use Case 1 : Application entry and welcome page
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System
 *
 * At this stage, the application:
 * -starts execution fromt he main() method
 * -dislays a welcome messages
 * -shows application version
 *
 * no palindrome logic is implemented uet
 *
 *the goal is to e
 *git add App/src/PalindromeCheckerApp.java
 **/

/**
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * Use Case 2: Hardcoded Palindrome Validation
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        String reversed = "";


        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Word to check: " + input);
        System.out.println("Reversed word: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}
