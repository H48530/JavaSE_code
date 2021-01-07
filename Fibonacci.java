import java.util.Scanner;

public class Fibonacci {
    //    斐波那契数
    //    求斐波那契数列的第n项。(迭代实现)
    //    1 1 2 3 5 8 13 21 ...
    public static int fib(int num) {
        if (num <= 2) {//当小于2的时候，直接返回 1
            return 1;
        } else {
            int first = 1;
            int second = 1;
            int third = 0;
            while (num > 2) {
                //当大于2，每次前两项的和相加
                third = first + second;
                first = second;
                second = third;
                num--;
            }
            return third;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(fib(num));
    }
}
