package Day0117;

import java.util.Scanner;

/**
 * BoBo买了一箱酸奶，里面有n盒未打开的酸奶，KiKi喜欢喝酸奶，
 * 第一时间发现了酸奶。KiKi每h分钟能喝光一盒酸奶，
 * 并且KiKi在喝光一盒酸奶之前不会喝另一个，
 * 那么经过m分钟后还有多少盒未打开的酸奶？
 */
public class DrinkMill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int m = sc.nextInt();
            int x = 0;
            if (m % h == 0) {
                x = n - m / h;
            } else {
                x = n - m / h - 1;

            }
            if (x < 0) {
                x = 0;
            }
            System.out.println(x);

        }
    }
}
