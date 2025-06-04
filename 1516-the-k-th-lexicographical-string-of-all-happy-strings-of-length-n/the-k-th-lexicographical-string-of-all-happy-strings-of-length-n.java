public class Solution {
    List<String> happyStrings = new ArrayList<>();

    public String getHappyString(int n, int k) {
        backtrack(n, "", ' ');
        return k <= happyStrings.size() ? happyStrings.get(k - 1) : "";
    }

    private void backtrack(int n, String current, char prevChar) {
        if (current.length() == n) {
            happyStrings.add(current);
            return;
        }

        char[] letters = {'a', 'b', 'c'};
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != prevChar) {
                backtrack(n, current + letters[i], letters[i]);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getHappyString(1, 3));
        System.out.println(solution.getHappyString(1, 4)); 
        System.out.println(solution.getHappyString(3, 9)); 
    }
}
