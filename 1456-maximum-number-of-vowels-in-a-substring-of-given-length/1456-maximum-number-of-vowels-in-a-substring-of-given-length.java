class Solution {
    
    int vowel_On(char c){
        if(c=='a' | c== 'e' | c=='i' | c=='o' | c=='u'){
            return 1;
        }
        return 0;
    }
    public int maxVowels(String s, int k) {
        int cur_Vowel=0, max_vow =0;
        for(int i=0; i<s.length(); i++){
            cur_Vowel += vowel_On(s.charAt(i));
            if(i>=k){
                cur_Vowel -= vowel_On(s.charAt(i-k));
            }
            max_vow = Math.max(max_vow, cur_Vowel);
        }
        return max_vow;
    }
}