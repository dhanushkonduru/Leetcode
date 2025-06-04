class Solution {
    List<String> res;
    String digits;
    String[] map;
    public List<String> letterCombinations(String digits) {
        this.res = new ArrayList<>();
        this.digits = digits;
        if(digits.length() == 0) return res;
        this.map = new String[]{
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        backtrack(new StringBuilder(),0);
        return res;
    }
    
    void backtrack(StringBuilder temp, int n){
        if(n==digits.length()){
            res.add(temp.toString());
            return;
        }
        String letters = map[digits.charAt(n) - '0'];
        for(int j = 0; j<letters.length(); j++){
            temp.append(letters.charAt(j));
            backtrack(temp,n+1);     // go to the next digit, not the letter
            temp.deleteCharAt(temp.length()-1);
        }
        
    }
}