package threeChessGame;

/**
 * 三子棋游戏测试
 */
public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        Game game = new Game(player);
        while (true) {
            //打印棋盘
            game.initialize();
            //进行游戏
            game.play();
            //结束前处理
            game.destoroy();
            //是否继续
            boolean b = player.queryContinue();
            if (!b) {
                System.out.println("欢迎下次游戏！");
                break;
            }
        }
    }
}

