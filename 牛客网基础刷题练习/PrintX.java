import java.util.Scanner;

public class PrintX {

    //打印x图案
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {//循环输入
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {//控制行
                for (int j = 1; j <= num; j++) {//控制列
                    if (i == j || j == (num - i + 1)) {//当下标相同，或者下标相差为num-i+1的打印*
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
