package binary_Serch;

/**
 * Range 区间
 */
public class Range {
    private final int[][] array;
    private final int columns;

    private int lowRow;
    private int lowColumn;

    private int highRow;
    private int highColumn;

    public Range(int[][] array, int rows, int columns) {
        this.array = array;
        this.columns = columns;

        this.lowRow = 0;
        this.lowColumn = 0;
        this.highRow = rows - 1;
        this.highColumn = columns - 1;
    }

    //获取区间元素
    public int size() {
        return (columns - lowColumn) + ((highRow - lowRow - 1) * columns) + (highColumn + 1);
    }

    //获取中间元素的值
    public int getMiddleValue() {
        int[] index = getMiddleIndex();
        int row = index[0];
        int col = index[1];

        return array[row][col];
    }

    //获取中间元素的下标
    public int[] getMiddleIndex() {
        int halfSize = size() / 2;
        int middleRow = lowRow;
        int middleColumn = lowColumn;
        middleColumn += halfSize;
        // middleColumn 还不是一个合法下标
        while (middleColumn >= columns) {
            middleRow++;
            middleColumn -= columns;
        }
        return new int[]{middleRow, middleColumn};
    }

    //丢掉左边
    public void discardLeftPart() {
        int[] index = getMiddleIndex();
        int row = index[0];
        int col = index[1];
        lowRow = row;
        lowColumn = col + 1;
        if (lowColumn >= columns) {
            lowRow++;
            lowColumn = 0;
        }
    }

    //丢掉右边
    public void discardRightPart() {
        int[] index = getMiddleIndex();
        int row = index[0];
        int col = index[1];
        highRow = row;
        highColumn = col - 1;
        if (highColumn < 0) {
            highRow--;
            highColumn = columns - 1;
        }
    }
}
