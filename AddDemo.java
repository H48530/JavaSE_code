package Practice1229;

import java.util.Scanner;

public class AddDemo {
    public static int Add(int a, int b) {
        return a + b;
    }
    public static int Add(int a, int b,int c) {
        return a + b;
    }

    public static double Add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Add(a, b));

        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println(Add(c, d));
    }
}
