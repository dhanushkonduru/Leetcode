class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int oddLen  = expand(s, i, i);       // odd length  "aba"
            int evenLen = expand(s, i, i + 1);   // even length "bb"

            int maxLen = Math.max(oddLen, evenLen);

            if (maxLen > end - start + 1) {
                start = i - (maxLen - 1) / 2;
                end   = i + maxLen / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of palindrome found
    }
}