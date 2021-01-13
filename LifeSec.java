package Day1231;

import java.util.Scanner;

public class LifeSec {
    //你能活多少秒
//    问题：一年约有3.156×107s，要求输入您的年龄，显示该年龄合多少秒。
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long ret = (long) (i * (3.156 * Math.pow(10, 7)));
        System.out.println(ret);

    }
}
