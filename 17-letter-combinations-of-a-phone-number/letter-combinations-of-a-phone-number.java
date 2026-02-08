import java.util.*;

class Solution {

    List<String> res = new ArrayList<>();
    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return res;
        backtrack(digits, 0, new StringBuilder());
        return res;
    }

    private void backtrack(String digits, int index, StringBuilder curr) {
        if (index == digits.length()) {
            res.add(curr.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            curr.append(c);
            backtrack(digits, index + 1, curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
