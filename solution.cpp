class Solution {
public:
    bool checkOnesSegment(string s) {
        bool init = true;
        for(int i = 0; i < s.length(); i++){
            if(init && s[i] == '0') init = false;
            else if(!init && s[i] == '1') return(false);
        }

        return(true);
    }
};
