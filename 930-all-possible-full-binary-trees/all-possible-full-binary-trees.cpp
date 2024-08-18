class Solution {
public:
    unordered_map<int,vector<TreeNode*>> mp;
     vector<TreeNode*> allPossibleFBT(int n) {
        vector<TreeNode*> ans;
        if(n%2==0) return ans;
        if(mp.find(n)!=mp.end()){
            return mp[n];
        }
        if(n==1) {
            ans.push_back(new TreeNode(0));
            return ans;
        }

        for(int i=1;i<n;i+=2){
            vector<TreeNode*> leftTrees= allPossibleFBT(i);
            vector<TreeNode*> rightTrees= allPossibleFBT(n-i-1);
            for(auto lt: leftTrees){
                for(auto rt: rightTrees){
                    TreeNode* root= new TreeNode(0);
                    root->left= lt;
                    root->right= rt;
                    ans.push_back(root);
                }
            }

        }
        mp[n]=ans;
        return ans;
        
    }
};