package Day0117;

import java.util.Scanner;

/**
 *给定一个球体的半径，计算其体积。其中球体体积公式为 V = 4/3*πr3，其中 π= 3.1415926。
 */
public class AreaBall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r = sc.nextDouble();

        double area=(4*3.1415926*Math.pow(r,3)/3);

        System.out.printf("%.3f\n",area);
    }
}
