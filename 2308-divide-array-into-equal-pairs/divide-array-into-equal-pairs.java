class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int x : nums)
            maps.put(x, maps.getOrDefault(x, 0) + 1);
        for (Map.Entry<Integer, Integer> s : maps.entrySet()) {
            if (s.getValue() % 2 != 0)
                return false;
        }
        return 7 == 7; // Tribute to thala
    }
}