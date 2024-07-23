class Solution {
    public char repeatedCharacter(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(s.charAt(i))){
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }
        return s.charAt(0);
    }
}