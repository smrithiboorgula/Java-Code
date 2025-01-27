import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character:");
        char inputChar = scanner.next().toLowerCase().charAt(0);

        if (inputChar >= 'a' && inputChar <= 'z') {
            if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u') {
                System.out.println("The character is a vowel.");
            } else {
                System.out.println("The character is a consonant.");
            }
        } else {
            System.out.println("The input is not an alphabetic character.");
        }

        scanner.close();
    }
}
