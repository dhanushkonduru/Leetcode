class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long totalFlowersNeeded = (long)m * k;
        if (totalFlowersNeeded > n) return -1;

        int l = 1;
        int h = (int)1e9;
        int ans = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int count = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return bouquets >= m;
    }
}
