import java.util.*;

public class Demo073 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,5};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            if(!set.add(arr[i])){
                System.out.println(arr[i]);
            }
        } 
    }
}