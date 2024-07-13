import java.util.List;

class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int bitSize = 1 << n; 
        int res = 0;

        for (int i = 0; i < bitSize; i++) {
            int curr = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {  
                    curr ^= nums[j];
                }
            }
            res += curr; 
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 3};
        System.out.println(sol.subsetXORSum(nums1));  

        int[] nums2 = {5, 1, 6};
        System.out.println(sol.subsetXORSum(nums2));  

        int[] nums3 = {3, 4, 5, 6, 7, 8};
        System.out.println(sol.subsetXORSum(nums3));  
    }
}
