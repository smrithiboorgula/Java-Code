public class Demo075 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 1};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}
