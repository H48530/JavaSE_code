import java.util.Arrays;

/**
 *利用Arrays工具进行排序
 */
public class bubbleSortDemo2 {

    public static void main(String[] args) {
        int[] array = {2, 7, 8, 3, 10, 4, 0, 1, 9, 6, 5};
        //int[] array = {1, 2, 4, 3, 5, 6, 7, 8, 9};
        //排序数组
        Arrays.sort(array);
        //打印排序后的数组
        System.out.println(Arrays.toString(array));
    }

}
