import java.util.Arrays;
import java.util.Scanner;

/**
 * 调用Arrays中的binarySearch方法
 */
public class binarySearchDemo2 {

    public static void main(String[] args) {
        //定义一个数组，并初始化
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        //输入你要查找的数字。
        int key = sc.nextInt();
        //调用方法：
        System.out.println(Arrays.binarySearch(arr, key));
        
    }
}
