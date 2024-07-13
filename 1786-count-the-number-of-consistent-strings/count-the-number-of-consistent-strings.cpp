class Solution 
{
public:
    int countConsistentStrings(string allowed, vector<string>& words) 
    {
        int map=0, count = 0, consistent;
        for(char c:allowed)
        {
            map = map | (1<<c-'a');
        }
        for(string &s:words)
        {
            consistent = 1;
            for(char &c:s)
            {
                if((map & (1<<c-'a')) == 0)
                {
                    consistent = 0;
                    break;
                }
            }
            count += consistent;
        }
        return count;
    }
};