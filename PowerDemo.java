package Day1231;

import java.util.Scanner;

public class PowerDemo {
    //    不使用累计乘法的基础上，通过移位运算（<<）实现2的n次方的计算。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            int ret = 2 << num-1;
            System.out.println(ret);
        }
    }
}
