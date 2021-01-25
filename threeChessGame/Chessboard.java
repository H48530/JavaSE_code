package threeChessGame;

import java.util.Arrays;

/**
 *
 */
public class Chessboard {
    private static final int i1 = 0;
    private static final int p = 1;
    private static final int a = 2;
    private final int[][] array = {{i1, i1, i1}, {i1, i1, i1}, {i1, i1, i1}};

    public boolean moveCircleAt(int row, int column) {
        if (array[row][column] != i1) {
            return false;
        }
        array[row][column] = p;
        return true;
    }

    public boolean moveCrossAt(int row, int column) {
        if (array[row][column] != i1) {
            return false;
        }
        array[row][column] = a;
        return true;
    }

    public static final int CIRCLE_WIN = 0;     // p赢
    public static final int CROSS_WIN = 1;      // a赢
    public static final int DRAW = 2;           // 平局
    public static final int CONTINUE = 3;       // 游戏继续

    public int getState() {
        //行
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2]) {
                if (array[i][0] == p) {
                    return CIRCLE_WIN;
                } else if (array[i][0] == a) {
                    return CROSS_WIN;
                }
            }
        }
        //列
        for (int i = 0; i < 3; i++) {
            if (array[0][i] == array[1][i] && array[1][i] == array[2][i]) {
                if (array[0][i] == p) {
                    return CIRCLE_WIN;
                } else if (array[0][i] == a) {
                    return CROSS_WIN;
                }
            }
        }
        //斜线
        if (array[0][0] == array[1][1] && array[1][1] == array[2][2]) {
            if (array[1][1] == p) {
                return CIRCLE_WIN;
            } else if (array[1][1] == a) {
                return CROSS_WIN;
            }
        }
        if (array[0][2] == array[1][1] && array[1][1] == array[2][0]) {
            if (array[1][1] == p) {
                return CIRCLE_WIN;
            } else if (array[1][1] == a) {
                return CROSS_WIN;
            }
        }
        // 没人获胜
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == i1) {
                    return CONTINUE;
                }
            }
        }

        return DRAW;
    }

    private static String show(int i) {
        switch (i) {
            case i1:
                return " ";
            case p:
                return "X";
            case a:
                return "O";
            default:
                return " ";
        }
    }

    @Override
    public String toString() {
        String s = "-----\n";
        for (int i = 0; i < 2; i++) {
            s += String.format("%s|%s|%s\n", show(array[i][0]), show(array[i][1]), show(array[i][2]));
            s += "-----\n";
        }
        s += String.format("%s|%s|%s\n", show(array[2][0]), show(array[2][1]), show(array[2][2]));
        s += "-----\n";
        return s;
    }

    public void reset() {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(array[i], i1);
        }
    }
}

