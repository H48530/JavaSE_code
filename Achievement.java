package Day1231;

import java.util.Scanner;

public class Achievement {
    //依次输入一个学生的3科成绩，在屏幕上输出该学生的总成绩以及平均成绩
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        double ret = num1 + num2 + num3;
        System.out.printf("%.2f\n", ret);
        System.out.printf("%.2f\n", ret / 3);
    }
}
