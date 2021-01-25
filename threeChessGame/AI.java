package threeChessGame;

import java.util.Random;

/**
 * Ai类
 */
public class AI {
    private final Random random = new Random();

    public int[] getRowColumn() {
        int r = random.nextInt(3);
        int c = random.nextInt(3);

        return new int[]{r, c};
    }
}
