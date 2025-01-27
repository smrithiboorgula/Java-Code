import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an uppercase character:");
        char inputChar = scanner.next().charAt(0);

        if (Character.isUpperCase(inputChar)) {
            char lowerCaseChar = Character.toLowerCase(inputChar);
            System.out.println("Lowercase character: " + lowerCaseChar);
        } else {
            System.out.println("The input is not an uppercase character.");
        }

        scanner.close();
    }
}
