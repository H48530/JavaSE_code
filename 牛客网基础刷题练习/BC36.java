package Day0118;

import java.util.Scanner;

/**
 * 题目描述
 * BMI指数（即身体质量指数）是用体重公斤数除以身高米数平方得出的数字，
 * 是目前国际上常用的衡量人体胖瘦程度以及是否健康的一个标准。例如：一个人的身高为1.75米，体重为68千克，他的BMI=68/(1.75^2)=22.2（千克/米^2）。
 * 当BMI指数为18.5～23.9时属正常，否则表示身体存在健康风险。编程判断人体健康情况。
 */
public class BC36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            double wei = sc.nextDouble();
            double hei = sc.nextDouble();
            double bmi = wei / (hei * hei);
            System.out.println(bmi >= 18.5 && bmi <= 23.9 ? "Normal" : "Abnormal");
        }
    }
}
