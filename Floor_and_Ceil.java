import java.util.Arrays;

class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int floor = -1, ceil = -1;
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= x) {
                floor = nums[mid];
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        l = 0;
        r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= x) {
                ceil = nums[mid];
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return new int[] { floor, ceil };
    }
}