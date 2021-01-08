import java.util.Scanner;

public class Factorial {
    //求 N 的阶乘
    public static int factorial(int num) {
        int ret = 1;
        for (int i = 1; i <= num; i++) {
            ret *= i;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
}
