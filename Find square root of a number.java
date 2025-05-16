class Solution {
    public long floorSqrt(long n) {
        long l = 0, r = n;
        long ans = 0;

        while (l <= r) {
            long mid = l + (r - l) / 2;

            if (mid * mid <= n) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
}
