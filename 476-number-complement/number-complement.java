class Solution {
    public int findComplement(int num) 
    {
        int n = (int)(Math.pow(2, digits(num)) - 1); 
        return n - num;                              
    }
    
    public static int digits(int n)
    {
        int c = 0;                  
        while(n > 0)                
        {
            n = n / 2;              
            c++;                    
        }
        return c;                  
    }
}