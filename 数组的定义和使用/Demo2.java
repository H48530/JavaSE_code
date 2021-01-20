/**
 *在数组中找到指定元素，如果找到返回下标，未找到返回-1
 */
public class Demo2 {
    public static int indexOf(long[] array, long tagre) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tagre) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5, 6};
        int b = indexOf(arr, 0);
        System.out.println(b);
    }
}