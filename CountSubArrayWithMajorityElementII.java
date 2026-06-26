public class CountSubArrayWithMajorityElementII {
    class Fenwick {
        int[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new int[n + 2];
        }
        void update(int idx, int val) {
            while (idx <= n) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }
        int query(int idx) {
            int sum = 0;
            while (idx > 0) {
                sum += bit[idx];
                idx -= idx & -idx;
            }
            return sum;
        }
    }
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        Fenwick bit = new Fenwick(2 * n + 5);
        int offset = n + 2;

        int pref = 0;
        long ans = 0;

        bit.update(offset, 1);

        for (int x : nums) {
            if (x == target)
                pref++;
            else
                pref--;

            ans += bit.query(pref + offset - 1);
            bit.update(pref + offset, 1);
        }

        return ans;
    }

public static void main(String[] args) {
    int nums[]={1,2,2,3};
    CountSubArrayWithMajorityElementII obj=new CountSubArrayWithMajorityElementII();
    System.out.println(obj.countMajoritySubarrays(nums,2 ));   
}
}
