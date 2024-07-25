class Solution {
    public boolean hasAlternatingBits(int n) 
    {
        int prevBit = n % 2;

        n /= 2;

        while (n > 0)
        {
            if (n % 2 == prevBit) return false;
            else prevBit = n % 2;

            n /= 2;
        }

        return true;
    }
}