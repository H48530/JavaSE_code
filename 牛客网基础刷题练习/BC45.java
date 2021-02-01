package Day0119;

import java.util.Scanner;

/**
 *最高分数
 */
public class BC45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            System.out.println(Integer.max(num3, Integer.max(num1, num2)));
        }
    }
}
