class Solution {
public:
    vector<int> twoOutOfThree(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3) {
        unordered_map<int,char>mp;
        for(auto i:nums1)mp[i]='A';
        for(auto i:nums2){
            if(mp[i]=='A'||mp[i]=='C')mp[i]='C';
            else mp[i]='B';
        }
        for(auto i:nums3){
            if(mp[i]=='C'||mp[i]=='B'||mp[i]=='A')mp[i]='C';
            else mp[i]='K';
        }
        for(auto i:nums1){
            if(mp[i]=='B'||mp[i]=='K'||mp[i]=='C')mp[i]='C';
            else mp[i]='A';
        }
        vector<int>ans;
        for(auto i:mp)if(i.second=='C')ans.push_back(i.first);
        return ans;

    }
};