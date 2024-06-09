import java.util.Scanner;

public class FactorFFinder {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter an integer
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Print all factors of the number
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

            // Close the scanner
            scanner.close();
        }
    }


