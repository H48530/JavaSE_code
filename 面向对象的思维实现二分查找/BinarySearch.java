/**
 * 用面向对象的思想实现二分查找
 */
class Range {
    private final int[] array;
    private int left;
    private int right;

    public Range(int[] array) {
        this.array = array;
        this.left = 0;
        this.right = array.length - 1;
    }

    public int size() {
        return right - left + 1;
    }

    //中间元素的值
    public int getMidValue() {
        return array[getMidIndex()];
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

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        //将数组抽象成区间对象
        Range range = new Range(array);

        //当区间还有数时，查找还得继续
        while (range.size() > 0) {
            //获取中间元素
            int midValue = range.getMidValue();
            if (midValue == target) {
                return range.getMidIndex();
            } else if (midValue < target) {
                //丢掉左半边
                range.discardLeftPart();
            } else {
                //丢掉右半边
                range.discardRightPart();
            }
        }
        return -1;
    }
}
