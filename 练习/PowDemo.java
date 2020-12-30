public class PowDemo {

    public static long myPow(int n, int m) {
        int ret = 1;
        for (int i = 0; i < m; i++) {
            ret *= n;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(myPow(3, 3));
    }
}
