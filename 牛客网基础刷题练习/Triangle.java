package Day1231;

import java.util.Scanner;

public class Triangle {
    //根据给出的三角形3条边a, b, c（0 < a, b, c < 100,000），计算三角形的周长和面积。

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double cir = a + b + c;

        double area = 0.5*a * b * ((((a * a) + (b * b)) - (c * c)) / (2.0 * a * b));
        System.out.printf("circumference=%.2f area=%.2f",cir,area);


    }
}
