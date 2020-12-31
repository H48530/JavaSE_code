package Day1231;

import java.util.Scanner;

public class Count {

    //    问题：KiKi今年5岁了，已经能够认识100以内的非负整数，并且并且能够进行 100 以内的非负整数的加法计算。
//    不过，BoBo老师发现KiKi在进行大于等于100的正整数的计算时，规则如下：
//    只保留该数的最后两位，例如：对KiKi来说1234等价于34；
//    如果计算结果大于等于 100， 那么KIKI也仅保留计算结果的最后两位，如果此两位中十位为0，则只保留个位。
//    例如：45+80 = 25
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ret = num1 + num2;
        if (ret >= 100) {
            ret = ret % 100;
        }
        System.out.println(ret);
    }
}
