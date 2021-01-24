package binary_Serch;

/**
 * 二维数组的二分查找
 */
public class binary_Search {
    //返回一个下标放在一维数组中
    public static int[] search(int[][] array, int rows, int columns, long target) {
        Range range = new Range(array, rows, columns);

        while (range.size() > 0) {
            int middleValue = range.getMiddleValue();
            if (target == middleValue) {
                return range.getMiddleIndex();
            } else if (target < middleValue) {
                range.discardRightPart();
            } else {
                range.discardLeftPart();
            }
        }
        // 只要返回特殊值表示没有找到即可
        return new int[]{-1, -1};
    }
}
