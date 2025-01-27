import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Initialize the first two terms of the Fibonacci series
        int firstTerm = 0, secondTerm = 1;

        // Print the Fibonacci series
        System.out.println("Fibonacci Series up to " + terms + " terms:");

        for (int i = 1; i <= terms; ++i) {
            // Print the current term
            System.out.print(firstTerm + " ");

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;

            // Update the terms for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        // Close the scanner object
        scanner.close();
    }
}
