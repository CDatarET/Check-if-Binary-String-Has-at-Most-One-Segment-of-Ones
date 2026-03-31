class Solution {
    public boolean checkOnesSegment(String s) {
        boolean init = true;
        for(int i = 0; i < s.length(); i++){
            if(init){
                if(s.charAt(i) == '0'){
                    init = false;
                }
            }
            else{
                if(s.charAt(i) == '1'){
                    return(false);
                }
            }
        }

        return(true);
    }
}
