import java.util.Scanner;

public class Demo039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character:");
        char inputChar = scanner.next().charAt(0);

        if (Character.isUpperCase(inputChar)) {
            System.out.println("The character is uppercase.");
        } else if (Character.isLowerCase(inputChar)) {
            System.out.println("The character is lowercase.");
        } else {
            System.out.println("The input is not an alphabetic character.");
        }

        scanner.close();
    }
}
