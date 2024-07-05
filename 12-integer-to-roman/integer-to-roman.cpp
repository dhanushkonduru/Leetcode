class Solution {
public:
    string intToRoman(int num) {

        string temp = to_string(num);

        int len = temp.length();

        string ans="";

        while(num)
        {
            if(len==4)
            {
                ans+="M";
                num-=1000;
            }

            else if(len==3)
            {
                if(temp[0]=='9')
                {
                    ans+="CM";
                    num-=900;
                }

                else if(temp[0]=='4')
                {
                    ans+="CD";
                    num-=400;
                }

                else if(num>=500)
                {
                    ans+="D";
                    num-=500;
                }

                else
                {
                    ans+="C";
                    num-=100;
                }
            }

            else if(len==2)
            {
                if(temp[0]=='9')
                {
                    ans+="XC";
                    num-=90;
                }

                else if(temp[0]=='4')
                {
                    ans+="XL";
                    num-=40;
                }

                else if(num>=50)
                {
                    ans+="L";
                    num-=50;
                }

                else
                {
                    ans+="X";
                    num-=10;
                }
            }

            else
            {
                if(temp[0]=='9')
                {
                    ans+="IX";
                    num-=9;
                }

                else if(temp[0]=='4')
                {
                    ans+="IV";
                    num-=4;
                }

                else if(num>=5)
                {
                    ans+="V";
                    num-=5;
                }

                else
                {
                    ans+="I";
                    num-=1;
                }
            }

            temp = to_string(num);
            len = temp.length();
        }

        return ans;
        
    }
};