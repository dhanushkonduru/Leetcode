class Solution {
public:
    vector<int> diffWaysToCompute(string exp) {
        bool flag = true;
        vector<int>res;
        for(int i=0;i<exp.length();i++){
            if(!isdigit(exp[i])){
                flag = false;
                vector<int>left = diffWaysToCompute(exp.substr(0,i));
                vector<int>right = diffWaysToCompute(exp.substr(i+1));
                for(int k=0;k<left.size();k++){
                    for(int j=0;j<right.size();j++){
                        if(exp[i]=='+'){
                            res.push_back(left[k] + right[j]);
                        }
                        if(exp[i] == '-'){
                            res.push_back(left[k] - right[j]);
                        }
                        if(exp[i] == '*'){
                            res.push_back(left[k]*right[j]);
                        }
                    }
                }
            }
        }
        if(flag){
            res.push_back(stoi(exp));
        }
        return res;
    }
};