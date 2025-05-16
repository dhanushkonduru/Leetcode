class Solution {
    public int smallestDivisor(int[] nums, int limit) {
        int l = 1;
        int h = 0;
        for (int i = 0; i < nums.length; i++) {
            h = Math.max(h, nums[i]);
        }

        int ans = h;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (getSum(nums, mid) <= limit) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    private int getSum(int[] nums, int divisor) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] + divisor - 1) / divisor;
        }
        return sum;
    }
}
