package Day0119;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 期中考试开始了，大家都想取得好成绩，争夺前五名。从键盘输入n个学生成绩（不超过40个），输出每组排在前五高的成绩
 */
public class BC39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = n - 1; i > n - 6; i--) {

            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}
