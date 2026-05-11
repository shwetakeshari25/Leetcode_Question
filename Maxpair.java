class Maxpair {
    public int largestDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num = num / 10;
        }
        return maxDigit;
    }
    public int maxSum(int[] nums) {
        int maxSum = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int d1 = largestDigit(nums[i]);
                int d2 = largestDigit(nums[j]);
                if (d1 == d2) {
                    maxSum = Math.max(maxSum, nums[i] + nums[j]);
                }
            }
        }
        return maxSum;
    }
    public static void main(String args[]) {
        int nums[] = {51, 71, 17, 24, 42};
        Maxpair obj = new Maxpair();
        System.out.println(obj.maxSum(nums));
    }
}