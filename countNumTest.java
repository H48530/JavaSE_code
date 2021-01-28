package number;

import java.util.Scanner;

/**
 * 返回的数字之和
 * 写一个递归方法，输入一个非负整数，返回组成它的数字之和
 */
public class countNumTest {
    //    public static int method(int num) {
//        int sum = 0;
//        while (num > 9) {
//            sum += num % 10;
//            num /= 10;
//        }
//        return sum + num;
//    }
    public static int method(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + method(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(method(a));

    }
}
