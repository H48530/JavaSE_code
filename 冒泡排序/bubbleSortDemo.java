import java.util.Arrays;

/**
 * 冒泡排序
 */
public class bubbleSortDemo {
    public static void bubbleSort(int[] arr) {
        //控制趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //控制每一趟的排序
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //判断大小，将大的放在最后面
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2, 7, 8, 3, 10, 4, 0, 1, 9, 6, 5};
        //排序数组
        bubbleSort(array);
        //打印排序后的数组
        System.out.println(Arrays.toString(array));
    }
}
