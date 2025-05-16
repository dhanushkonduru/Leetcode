class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing = 0;
        int curr = 1;
        int i = 0;

        while (missing < k) {
            if (i < arr.length && arr[i] == curr) {
                i++;
            } else {
                missing++;
                if (missing == k) {
                    return curr;
                }
            }
            curr++;
        }

        return curr;
    }
}
