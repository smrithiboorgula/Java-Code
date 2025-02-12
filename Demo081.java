public class Demo081 {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        System.out.print(arr[n - 1] + " ");
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
    }
}
