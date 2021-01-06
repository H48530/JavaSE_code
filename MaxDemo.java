
public class MaxDemo {
    //    创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //    要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算

    public static int max2(int num1, int num2) {
        //求两个数的最大值
        //三目操作符
        return num1 > num2 ? num1 : num2;
    }

    public static int max3(int a, int b, int c) {
        //求三个数的最大值
        return max2(max2(a, b), c);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 7;
        System.out.println(max2(a, b));
        System.out.println(max3(a, b, c));
    }
}
