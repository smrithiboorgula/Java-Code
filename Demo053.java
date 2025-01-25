import java.util.Scanner;

public class Demo053 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is not a Strong Number.");
        }
    }

    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
