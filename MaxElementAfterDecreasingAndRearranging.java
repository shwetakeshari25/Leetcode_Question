import java.util.*;
public class MaxElementAfterDecreasingAndRearranging {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }
        return arr[arr.length - 1];
    }
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 2, 1};
        MaxElementAfterDecreasingAndRearranging obj =
                new MaxElementAfterDecreasingAndRearranging();
        System.out.println(obj.maximumElementAfterDecrementingAndRearranging(arr));
    }
}    

