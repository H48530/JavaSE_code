import java.util.Arrays;

/**
 * 定义数组
 */

public class Demo1 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));

        for (int b : a) {
            System.out.print(b + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main2(String[] args) {

        int[] a = new int[5];
        System.out.println(a.length);

        //int b = a[5];
        System.out.println();
    }

    public static void main1(String[] args) {
        //定义并初始化
        int[] a = {1, 2, 3, 4, 5};

        // System.out.println(a);

    }
}
