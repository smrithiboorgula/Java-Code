public class Demo076 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 1};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        System.out.println("The second maximum number is: " + secondMax);
    }
}