import java.util.Arrays;

/**
 * binarySearch的使用
 * 二分查找
 */
public class binarySearchDemo {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        //调用binarySearch方法
        int ret = Arrays.binarySearch(arr, 55);
        //打印下标
        System.out.println("下标是：" + ret);
    }
}
