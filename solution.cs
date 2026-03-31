public class Solution {
    public bool CheckOnesSegment(string s) {
        bool init = true;
        for(int i = 0; i < s.Length; i++){
            if(init && s[i] == '0') init = false;
            else if(!init && s[i] == '1') return(false);
        }

        return(true);
    }
}
