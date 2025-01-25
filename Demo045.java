public class Demo045 {
    public static void main(String[] args) {
        // Initialize two numbers
        int a = 5, b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the numbers using arithmetic operations
        a = a + b;  // a becomes the sum of a and b
        b = a - b;  // b becomes the original value of a
        a = a - b;  // a becomes the original value of b

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
