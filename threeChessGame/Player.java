package threeChessGame;

import java.util.Scanner;

/**
 * 玩家类
 */
public class Player {
    private final Scanner sc = new Scanner(System.in);

    public int[] getRowColumn() {
        System.out.println("输入需要下的位置：[0-2]");
        int r, c;
        while (true) {
            System.out.print(">>>");
            r = sc.nextInt();
            c = sc.nextInt();
            if (r >= 0 && r <= 2 && c >= 0 && c <= 2) {
                break;
            }
            System.out.println("范围是0-2，请重新输入：");
        }
        return new int[]{r, c};
    }

    public boolean queryContinue() {
        System.out.println("是否再来一局？true/false");
        System.out.print(">>>");
        return sc.nextBoolean();
    }
}
