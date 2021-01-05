
public class MyMax {
    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系

    public static int myMax(int num1, int num2) {
        //求两个整型数的最大值
        return num1 > num2 ? num1 : num2;
    }

    public static double myMax(double num1, double num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static double myMax(double num1, double num2, int num3) {
        //两个小数和一个整数的大小关系
        return myMax(myMax(num1, num2), num3);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        double c = 3.15;
        double d = 5.31;
        System.out.println(myMax(a, b));
        System.out.println(myMax(c, d));
        System.out.println(myMax(c, d, b));
    }
}
