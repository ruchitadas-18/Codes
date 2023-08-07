class Solution {
    public int strStr(String haystack, String needle) {
        int hl=haystack.length();
        int nl=needle.length();
        if(hl<nl) return -1;
        for(int i=0; i<hl-nl+1; i++){
            int j=0;
            while(j<nl && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==nl){
                return i;
            }
        }
        return -1;
    }
}