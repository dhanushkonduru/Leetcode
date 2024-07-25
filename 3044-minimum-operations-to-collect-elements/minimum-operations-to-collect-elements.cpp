class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        vector<int>arr(k+1,0);
        int ans = 0,n=nums.size(),num = 0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<=k&&arr[nums[i]]==0){
                arr[nums[i]]=1;
                num++;
            }
            ans++;
            if(num == k){
                break;
            }
        }
        for(int i:arr){
            cout<<i<<" ";
        }
        return ans;
    }
};