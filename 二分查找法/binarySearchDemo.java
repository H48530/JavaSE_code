import java.util.Scanner;
/**
 * Java实现二分查找
 */
public class binarySearchDemo {
    public static void main(String[] args) {
        //定义一个数组，并初始化
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        //输入你要查找的数字。
        int key = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;
        int mid=0;
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
            System.out.println("找到了，下标是：" + mid);
        } else {
            System.out.println("未找到！");
        }
    }
}
