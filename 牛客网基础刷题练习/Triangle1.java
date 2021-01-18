package Day0117;

import java.util.Scanner;

/**
 * 根据给出的三角形3条边a, b, c（0 < a, b, c < 100,000），计算三角形的周长和面积。
 * 三角形面积 p=(a+b+c)/2   S=sqrt[p(p-a)(p-b)(p-c)]
 */
public class Triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double cir = a + b + c;
        double p = cir / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("circumference=%.2f area=%.2f" , cir , area);

    }
}
