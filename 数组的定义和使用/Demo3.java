import java.util.Arrays;

/**
 * 1、找到数组中的最大值
 * 2、找到数组中的最小值
 * 3、计算数组中元素之和
 * 4、给定元素，将元素填充到数组中每个元素
 */
public class Demo3 {
    public static int arrayMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    public static int arrayMax(int[] array, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > array.length) {
            throw new RuntimeException("传入的参数不合法");
        }
        int max = array[fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {

            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int arrayMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
    public static int arrayMin(int[] array, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > array.length) {
            throw new RuntimeException("传入的参数不合法");
        }
        int min = array[fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {

            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static int arraySum(int[] array, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > array.length) {
            throw new RuntimeException("传入的参数不合法");
        }
        int sum =0;
        for (int i = fromIndex; i < toIndex; i++) {

            sum += array[i];
        }
        return sum;
    }

    public static int[] arrayFill(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            array[i] = key;
        }
        return array;
    }
    public static int[] arrayFill(int[] array, int fromIndex, int toIndex,int key) {
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > array.length) {
            throw new RuntimeException("传入的参数不合法");
        }
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = key;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrayMax(arr));
        System.out.println(arrayMin(arr));
        System.out.println(arraySum(arr));
        System.out.println(Arrays.toString(arrayFill(arr,1)));

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrayMax(arr1,2,5));
        System.out.println(arrayMin(arr1,2,8));
        System.out.println(arraySum(arr1,1,9));
        System.out.println(Arrays.toString(arrayFill(arr1,1,8,0)));
    }
}
