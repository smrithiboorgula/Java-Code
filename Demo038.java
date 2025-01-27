import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character:");
        char inputChar = scanner.next().charAt(0);

        if (Character.isUpperCase(inputChar)) {
            System.out.println("The character is in uppercase: " + inputChar);
            System.out.println("Converted to lowercase: " + Character.toLowerCase(inputChar));
        } else if (Character.isLowerCase(inputChar)) {
            System.out.println("The character is in lowercase: " + inputChar);
            System.out.println("Converted to uppercase: " + Character.toUpperCase(inputChar));
        } else {
            System.out.println("The input is not an alphabetic character.");
        }

        scanner.close();
    }
}
