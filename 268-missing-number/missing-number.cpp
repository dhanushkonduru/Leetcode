class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int numsLength = nums.size();
        int i = 0;
        while (i < numsLength) {
            int valAtI = nums[i];
            bool belongsInRange = valAtI < numsLength;

            if (belongsInRange && valAtI != nums[valAtI]) {
                swap(nums[i], nums[valAtI]);
            } else {
                i++;
            }
        }

        for (int x = 0; x < numsLength; x++) {
            if (x != nums[x]) {
                return x;
            }
        }
        return numsLength;
    }
};