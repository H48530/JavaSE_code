package Day0119;

/**
 * 变种水仙花数 - Lily Number：把任意的数字，从中间拆分成两个数字，比如1461 可以拆分成（1和461）,（14和61）,
 * （146和1),如果所有拆分后的乘积之和等于自身，则是一个Lily Number。
 * 例如：
 * 655 = 6 * 55 + 65 * 5
 * 1461 = 1*461 + 14*61 + 146*1
 * 求出 5位数中的所有 Lily Number。
 */
public class BC38 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 99999; i++) {
            int num = i;
            int a = i / 10000;
            int b = i % 10000;
            int c = i / 1000;
            int d = i % 1000;
            int e = i / 100;
            int f = i % 100;
            int g = i / 10;
            int h = i % 10;

            if (a * b + c * d + e * f + g * h == num) {
                System.out.printf("%d ",num);
            }
        }
    }
}
