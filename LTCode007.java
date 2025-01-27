public class LTCode007 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        LTCode007 solution = new LTCode007();
        
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] digits3 = {9};
        int[] result3 = solution.plusOne(digits3);
        for (int num : result3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
