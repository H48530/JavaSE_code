import java.util.Scanner;

/**
 * 二分查找方法实现
 */
public class binarySearchDemo1 {
    public static int myBinarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] < key) {
                left = mid + 1;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                break;
            }
        }
        if (left <= right) {
            //如果找到，返回下标
            return mid;
        } else {
            //如果没找到，返回-1
            return -1;
        }
    }

    public static void main(String[] args) {
        //定义一个数组，并初始化
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        //输入你要查找的数字。
        int key = sc.nextInt();
        System.out.println(myBinarySearch(arr, key));

    }
}
