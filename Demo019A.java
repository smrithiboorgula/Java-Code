import java.util.Scanner;

public class Demo019A {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Round the number to the nearest multiple of 5
        long nearestMultipleOf5 = Math.round(number / 5.0) * 5;

        // Display the result
        System.out.println("The nearest multiple of 5 is: " + nearestMultipleOf5);

        // Close the scanner object
        scanner.close();
    }
}
