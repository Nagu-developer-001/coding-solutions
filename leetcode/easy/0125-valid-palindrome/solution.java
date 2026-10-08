class Solution {
    public boolean isAlphaNumeric(char ch){
        if(ch>='0' && ch<='9'||
           Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z'){
            return true;
           }
        return false;
    }
    public boolean isPalindrome(String s) {
        int n = s.length();
        int st = 0,end=n-1;
        while(st<end){
            if(!isAlphaNumeric(s.charAt(st))){
                st++;
                continue;
            }
            else if(!isAlphaNumeric(s.charAt(end))){
                end--;
                continue;
            }
            else{
                if(Character.toLowerCase(s.charAt(st))!=
                Character.toLowerCase(s.charAt(end))) return false;
            }
            st++;
            end--;
        }
        return true;
    }
}