package Day1231;

import java.util.Scanner;

public class ScannerDemo {
//    一行，3科成绩，用空格分隔，范围（0~100）。

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("score1=" + a + ",score2=" + b + ",score3=" + c);
    }
}

