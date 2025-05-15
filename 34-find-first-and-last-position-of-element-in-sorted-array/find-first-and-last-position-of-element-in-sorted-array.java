class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findFirst(nums, target);
        int end = findLast(nums, target);
        return new int[] { start, end };
    }

    private int findFirst(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int index = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                index = mid;
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return index;
    }

    private int findLast(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int index = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                index = mid;
                l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return index;
    }
}
