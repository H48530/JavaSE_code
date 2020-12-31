package Day1231;

import java.util.Scanner;

public class BMI {

    //    计算BMI指数（身体质量指数）。BMI指数（即身体质量指数，简称体质指数又称体重，英文为Body Mass Index，简称BMI），
    //    是用体重公斤数除以身高米数平方得出的数字，是目前国际上常用的衡量人体胖瘦程度以及是否健康的一个标准。
    //    主要用于统计用途，当我们需要比较及分析一个人的体重对于不同高度的人所带来的健康影响时，BMI值是一个中立而可靠的指标。
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int weight=sc.nextInt();
        int height=sc.nextInt();
        double ret=weight/Math.pow(height/100.0,2);
        System.out.printf("%.2f\n",ret);

    }
}
