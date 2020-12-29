package Practice1229;

import java.util.Scanner;

/**
 * 方法的定义和使用，以及方法重载
 */

public class Methods {
    //方法的标准格式
//    public static 方法返回值 方法名(形参列表){
//        方法指令;
//        return 返回值;
//    }
    public static int MyMax(int x, int y) {
        return x > y ? x : y;
    }

    public static int ThreeMax(int x, int y, int z) {
        //调用两个数的最大值，三个数的最大值
        return MyMax(MyMax(x, y), z);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(ThreeMax(a, b, c));
    }


//    public static int MyMax(int x, int y) {
//        return x > y ? x : y;
//    }

    public static void main1(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(MyMax(a, b));
    }
}
