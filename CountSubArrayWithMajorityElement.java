import java.util.*;

class CountSubArrayWithMajorityElement {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int balance = 0;

            for (int j = i; j < n; j++) {
                if (nums[j] == target) {
                    balance++;
                } else {
                    balance--;
                }

                if (balance > 0) {
                    ans++;
                }
            }
        }

        return ans;
    }
public static void main(String[] args) {
    int nums[]={1,2,2,3};
    CountSubArrayWithMajorityElement obj=new CountSubArrayWithMajorityElement();
    System.out.println(obj.countMajoritySubarrays(nums,2 ));

}   
}