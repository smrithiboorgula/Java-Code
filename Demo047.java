import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // To handle negative numbers, we use Math.abs() to get the absolute value
        number = Math.abs(number);

        // Initialize the count variable
        int count = 0;

        // Count digits by dividing the number by 10 repeatedly
        while (number != 0) {
            number /= 10;  // Divide the number by 10
            count++;       // Increment count for each digit
        }

        // If the number was 0, it has 1 digit
        if (count == 0) {
            count = 1;
        }

        // Output the result
        System.out.println("The number has " + count + " digits.");

        // Close the scanner
        scanner.close();
    }
}
