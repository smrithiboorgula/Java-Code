import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a lowercase character:");
        char inputChar = scanner.next().charAt(0);

        if (Character.isLowerCase(inputChar)) {
            char upperCaseChar = Character.toUpperCase(inputChar);
            System.out.println("Uppercase character: " + upperCaseChar);
        } else {
            System.out.println("The input is not a lowercase character.");
        }

        scanner.close();
    }
}
