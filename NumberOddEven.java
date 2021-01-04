import java.util.Arrays;

public class NumberOddEven {
    //    奇数位于偶数之前
    //    调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    public static int[] numberOddEven(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            if (array[left] % 2 == 0) {
                if (array[right] % 2 == 1) {
                    int tmp = array[left];
                    array[left] = array[right];
                    array[right] = tmp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //调用方法，打印数组

        int[] arr2 = {1, 2, 3, 3, 5, 2, 4, 6, 5, 6, 1, 9};
        System.out.println(Arrays.toString(numberOddEven(arr)));
        System.out.println(Arrays.toString(numberOddEven(arr2)));
    }
}
