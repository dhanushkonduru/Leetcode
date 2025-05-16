class Solution {
    public int countOccurrences(int[] nums, int x) {
        int first = findFirst(nums, x);
        if (first == -1)
            return 0;
        int last = findLast(nums, x);
        return last - first + 1;
    }

    public int findFirst(int[] nums, int x) {
        int l = 0, r = nums.length - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == x) {
                ans = mid;
                r = mid - 1;
            } else if (nums[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public int findLast(int[] nums, int x) {
        int l = 0, r = nums.length - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == x) {
                ans = mid;
                l = mid + 1;
            } else if (nums[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
