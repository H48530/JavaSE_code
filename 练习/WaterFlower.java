public class WaterFlower {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {

            int s = 0;
            while (i > 0) {
                int d = i % 10;
                int r = 1;
                for (int j = 0; j < 3; j++) {
                    r = r * d;
                }
                // r 是 d 的三次方
                s = s + r;
                i = i / 10;
            }
            // s 是 i 的每一位的 3 次方
            if (i == s) {
                System.out.println(i);
            }
        }
    }
}
