package threeChessGame;

/**
 * 游戏类
 */
public class Game {
    private final Chessboard chessboard;
    private final Player player;
    private final AI ai;

    public Game(Player player) {
        this.chessboard = new Chessboard();
        this.player = player;
        this.ai = new AI();
    }

    //进入游戏
    public void initialize() {
        System.out.println("欢迎进入《三子棋》游戏");
        System.out.println("=====================================");
        System.out.println(chessboard);
    }

    //回合制游戏
    public void play() {
        while (true) {
            if (playerTurn()) {
                break;
            }
            if (aiTurn()) {
                break;
            }
        }
    }

    //游戏完成，收尾
    public void destoroy() {
        chessboard.reset();
    }

    private boolean playerTurn() {
        System.out.println("玩家下棋：");
        while (true) {
            int[] rc = player.getRowColumn();
            int row = rc[0];
            int column = rc[1];
            if (chessboard.moveCircleAt(row, column)) {
                break;
            }
            System.out.println("已有棋子，从新选择！");
        }
        System.out.println(chessboard);
        return chessboard.getState() != chessboard.CONTINUE;
    }

    private boolean aiTurn() {
        System.out.println("Ai下棋：");
        while (true) {
            int[] rc = ai.getRowColumn();
            int row = rc[0];
            int column = rc[1];
            if (chessboard.moveCrossAt(row, column)) {
                break;
            }
        }
        System.out.println(chessboard);
        return chessboard.getState() != chessboard.CONTINUE;
    }
}
