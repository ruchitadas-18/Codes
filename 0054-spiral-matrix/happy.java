public class happy {
    public static boolean isHappy(int n) {
        int m = 0;
        while (n > 0) {
            int c = n % 10;
            m += c * c;
            n /= 10;
        }
        System.out.println(m);
        if (m < 10) {
            if (m == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return isHappy(m);
        }
    }

    public static void main(String[] args) {
        int n = 1111111;
        System.out.println(isHappy(n));
    }
}
