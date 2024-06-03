public class ChallengeClass {
    public static boolean isPrime(int num, int i) {

        // First base case
        if (num < 2) {
            return false;
        }
        // Second base case
        else if (i == 1) {
            return true;
        }
        // Third base case
        else if (num%i == 0) {
            return false;
        }
        // Recursive case
        else {
            return isPrime(num, i-1);
        }
    }

    public static void main( String args[] ) {
        int input = 13;
        boolean result = isPrime(input, input/2);

        // Print if the number is prime
        if (result == true) {
            System.out.println(input + " is a prime number");
        }
        // Prints if the number is NOT a prime number
        else {
            System.out.println(input + " is NOT a prime number");
        }
    }
}
