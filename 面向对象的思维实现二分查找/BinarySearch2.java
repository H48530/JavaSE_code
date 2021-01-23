import java.util.Arrays;
/**
 *二维数组的二分查找实现
 */
class Range1 {
    private final int[][] array;
    private int left;
    private int right;
    private int[]arr;

    public Range1(int[][] array, int m, int n) {
        //二维数组转换为一维数组
        int[] arr= new int[m*n];
        int index = 0;
        for (int[] a : array) {
            for (int element : a) {
                arr[index++] = element;
            }
        }
//        System.out.println(Arrays.toString(arr));
        this.array = array;
        this.arr=arr;
        this.left = 0;
        this.right = arr.length-1;
    }
    public int size() {
        return right - left + 1;
    }

    //中间元素的值
    public int getMidValue() {
        return arr[getMidIndex()];
    }

    //中间元素的下标
    public int getMidIndex() {
        return (left + right) / 2;
    }

    public void discardLeftPart() {
        left = getMidIndex() + 1;
    }

    public void discardRightPart() {
        right = getMidIndex() - 1;
    }
}

public class BinarySearch2 {
    public static int binarySearch2(int[][] array, int m, int n, int target) {

        Range1 range1 = new Range1(array, m, n);

        while (range1.size() > 0) {
            int midValue = range1.getMidValue();
            if (midValue == target) {
                return range1.getMidIndex();
            } else if (midValue < target) {
                range1.discardLeftPart();
            } else {
                range1.discardRightPart();

            }
        }
        return -1;
    }
}
