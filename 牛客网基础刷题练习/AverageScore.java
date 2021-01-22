package Day0118;

import java.util.Scanner;

/**
 * 计算平均成绩
 */
public class AverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        double sum=(a+b+c+d+e)/5.0;
        System.out.printf("%.1f\n",sum);
    }
}
