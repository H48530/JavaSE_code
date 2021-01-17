import java.util.Arrays;

/**
 * 我们知道在冒泡排序中，n个数据，需要比较n-1趟，每趟比上一次少1个数据。
 * 但是，当我们遇到待排序的数组时候，已经有序，或者近乎有序的时候，不需要移动数据，或者移动很少的数据，但是按照上面的排序，仍需要移动很多趟。
 * 那么如何解决这个问题呢？
 * 我们可以定义一个Boolean的flag，当一次排序没有交换过数据，那么证明数组已经有序。
 */
public class bubbleSortDemo1 {

    public static void bubbleSort(int[] arr) {
        boolean flag = true;
        //控制趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //进来先修改，不然会不进行排序
            flag = false;
            //控制每一趟的排序
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //判断大小，将大的放在最后面
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
                if (flag == true) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        //int[] array = {2, 7, 8, 3, 10, 4, 0, 1, 9, 6, 5};
        int[] array = {1, 2, 4, 3, 5, 6, 7, 8, 9};
        //排序数组
        bubbleSort(array);
        //打印排序后的数组
        System.out.println(Arrays.toString(array));

    }

}
