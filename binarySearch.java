package PracticeDay101;

public class binarySearch {
    //二分查找
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < key) {
                left = mid + 1;
            } else if (array[mid] == key) {
                return mid;
            } else {
                right = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("下标是：" + binarySearch(arr, 8));
    }
}
