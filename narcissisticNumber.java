public class narcissisticNumber {

    public static long myPow(int n, int m) {
        int ret = 1;
        for (int i = 0; i < m; i++) {
            ret *= n;
        }
        return ret;
    }

    public static boolean isNarcissisticNumber(int n) {
        long ret = 0;
        int i = n;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            ret += myPow(d, 3);
        }
        if (ret == i) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isNarcissisticNumber(i)) {
                System.out.println(i);
            }
        }
    }
}



