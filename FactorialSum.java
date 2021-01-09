import java.util.Scanner;

public class FactorialSum {
//    求1！+2！+3！+4！+........+n!的和

    public static int factorial(int num) {
        //求阶乘
        int ret = 1;
        for (int i = 1; i <= num; i++) {
            ret *= i;
        }
        return ret;
    }

    public static int sum(int num) {
        //求阶乘和
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += factorial(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}


