class Solution {
    public boolean validPalindrome(String s) {
        boolean check = true;
        int sl = s.length();
        int si = 0;
        int ei = sl-1;
        while(si<ei){
            if(s.charAt(si)!=s.charAt(ei)){
                if(check){
                    check = false;
                    boolean first = check(s,si+1,ei);
                    boolean second = check(s,si,ei-1);
                    return first || second;
                }
            }
            else{
                si++;
                ei--;
            }
        }
        return true;
    }
    public boolean check(String s,int si,int ei){
        while(si<ei){
            if(s.charAt(si)!=s.charAt(ei)) return false;
            si++;
            ei--;
        }
        return true;
    }
}