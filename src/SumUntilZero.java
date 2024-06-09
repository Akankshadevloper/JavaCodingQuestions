import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
                // Create a Scanner object to read input from the user
                Scanner scanner = new Scanner(System.in);

                int sum = 0;
                int number;

                // Use a while loop to keep taking inputs until the user enters 0
                while (true) {
                    // Prompt the user to enter an integer
                    System.out.print("Enter an integer (0 to stop): ");
                    number = scanner.nextInt();

                    // If the user enters 0, break the loop
                    if (number == 0) {
                        break;
                    }

                    // Add the entered number to the sum
                    sum += number;
                }

                // Print the sum of all entered numbers
                System.out.println("The sum of all entered numbers is: " + sum);

                // Close the scanner
                scanner.close();
            }
    }
