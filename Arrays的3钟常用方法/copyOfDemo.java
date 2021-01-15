import java.util.Arrays;

/**
 *copyOf的用法
 */
public class copyOfDemo {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        //定义arr2接受拷贝的数组元素
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        //打印拷贝的元素
        System.out.println(Arrays.toString(arr2));
    }
}
