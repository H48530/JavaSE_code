import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    //猜数字游戏
    //生成随机数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int bound = 1;
        int time = 1;
        System.out.println("请输入你想玩的难度，0——>简单、1——>中等、2——>困难");
        int input = sc.nextInt();
        switch (input) {
            case 0:
                bound = 10;
                time = 20;
                break;
            case 1:
                bound = 100;
                time = 10;
                break;
            case 2:
                bound = 1000;
                time = 5;
                break;
            default:
                bound = 10;
                time = 20;
                break;
        }
        int i = rand.nextInt(bound) + 1;//生成的随机数
        System.out.println(i);//方便游戏的进行，我们可以将这个随机数打印出来

        while (time > 0 && sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num == i) {
                System.out.println("猜中了！");
                break;
            } else if (num > i) {
                System.out.println("猜大了！");
            } else {
                System.out.println("猜小了！");
            }
            time--;
            System.out.println("剩余" + time + "次！");
        }

    }


    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int i = rand.nextInt(100) + 1;//生成0-100的随机数
        System.out.println(i);//方便游戏的进行，我们可以将这个随机数打印出来

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num == i) {
                System.out.println("猜中了！");
                break;
            } else if (num > i) {
                System.out.println("猜大了！");
            } else {
                System.out.println("猜小了！");
            }

        }

    }


    public static void main0(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();//rand随机数生成器
        int i = rand.nextInt(100);//默认生成的范围是：[0,100)
        System.out.println(i);

        int guessCount = 1;

        while (sc.hasNextInt() && guessCount < 5) {//可以猜5次
            int n = sc.nextInt();
            if (n == i) {
                System.out.println("猜对了！");
                break;
            } else if (n < i) {
                System.out.println("猜小了！");
            } else {
                System.out.println("猜大了！");
            }
            guessCount++;

        }
    }
}
