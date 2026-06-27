import java.util.*;

public class MaxNoOfElementInSubset {

    public int maximumLength(int[] nums) {
        HashMap<Long, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put((long) num, freq.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;

        // Special case for 1
        if (freq.containsKey(1L)) {
            int cnt = freq.get(1L);
            ans = Math.max(ans, (cnt % 2 == 0) ? cnt - 1 : cnt);
        }

        for (long x : freq.keySet()) {
            if (x == 1) {
                continue;
            }

            long cur = x;
            int len = 0;

            while (freq.containsKey(cur) && freq.get(cur) >= 2) {
                len += 2;

                // Prevent overflow before squaring
                if (cur > 31622) {
                    break;
                }

                cur = cur * cur;
            }

            if (freq.containsKey(cur) && freq.get(cur) >= 1) {
                len++;
            } else {
                len--;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MaxNoOfElementInSubset obj = new MaxNoOfElementInSubset();
        int result = obj.maximumLength(nums);

        System.out.println("Maximum Length = " + result);

        sc.close();
    }
}
