public class MyArrays {
    // "[1, 2, 3, 4]"
    public static String toString(long[] array) {
        // 遍历
        String ans = "[";
        // 遍历 除了 最后一个元素之外的其余所有元素
        for (int i = 0; i < array.length - 1; i++) {
            ans = ans + array[i] + ", ";
        }

        // 把最后一个元素添加到字符串 ans 中
        // 数组中最后一个元素的下标是 array.length - 1
        // 思考 array.length 的取值范围是多少 >= 0
        if (array.length > 0) {
            ans = ans + array[array.length - 1];
        }
        ans = ans + "]";
        return ans;
    }

    public static long[] copyOf(long[] array, int newLength) {
        if (newLength < 0) {
            throw new RuntimeException("newLengthying应该大于等于0！");
        }
        long[] arr = new long[newLength];
        int size = Integer.min(array.length, newLength);
        for (int i = 0; i < size; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    public static long[] copyRangeOf(long[] array, int from, int to) {
        //判断值的合法性
        if (from < 0) {
            throw new RuntimeException("from 必须 >= 0");
        }

        if (from > to) {
            throw new RuntimeException("from 必须 <= to");
        }

        if (from > array.length) {
            throw new RuntimeException("from 必须 <= original.length");
        }
        int newLength = to - from;
        long[] arr = new long[newLength];


        int size = Integer.min(array.length - from, newLength);
        for (int i = 0; i < size; i++) {
            arr[i] = array[i + from];
        }
        return arr;
    }

    public static void bubbleSort(long[] array) {
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                flag = false;
                if (array[j] > array[j + 1]) {
                    long tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }

    public static int binarySearch(long[] array, long target) {

        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (highIndex >= lowIndex ) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (target == array[midIndex]) {
                return midIndex;
            } else if (target < array[midIndex]) {
                highIndex = midIndex - 1;
            } else {
                lowIndex = midIndex + 1;
            }
        }
        return -1;
    }
}
