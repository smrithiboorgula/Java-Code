import java.util.*;

public class Demo057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int lastDigit = number %10;
        int firstDigit = number;
        while (firstDigit >=100) {
            firstDigit /=10;
        }
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of firstDigits and lastDigits: "+sum);
    }
}