import java.util.Scanner;

public class PalindromeChecker {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Remove spaces and convert to lowercase for uniform comparison
            String cleanedString = inputString.replaceAll("\\s+", "").toLowerCase();

            // Check if the string is a palindrome
            boolean isPalindrome = true;
            int length = cleanedString.length();
            for (int i = 0; i < length / 2; i++) {
                if (cleanedString.charAt(i) != cleanedString.charAt(length - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print the result
            if (isPalindrome) {
                System.out.println("The string \"" + inputString + "\" is a palindrome.");
            } else {
                System.out.println("The string \"" + inputString + "\" is not a palindrome.");
            }

            // Close the scanner
            scanner.close();
        }
    }


