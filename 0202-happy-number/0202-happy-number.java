class Solution {
    public boolean isHappy(int n) {
        int m = 0;
        while (n > 0) {
            int c = n % 10;
            m += c * c;
            n /= 10;
        }
        
        if (m < 10) {
            if (m == 1 || m==7) {
                return true;
            } else {
                return false;
            }
        } else {
            return isHappy(m);
        }
    }
}