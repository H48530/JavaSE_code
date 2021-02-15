package com;

import java.util.Scanner;

/**
 * 来源：牛客网  链接：https://www.nowcoder.com/questionTerminal/79c562297c0e4ff0952ef39ecde1bd6b
 * 给一个字符类型的数组chas和一个整数size，请把大小为size的左半区整体右移到右半区，右半区整体移动到左边。
 * 输入描述:
 * 输入两行，第一行一个整数，代表size,第二行一个字符串，代表chas
 * 输出描述:
 * 输出一行字符串，代表翻转后的字符串。
 * 示例1
 * 输入
 * 3
 * abcdefg
 * 输出
 * defgabc
 * 备注:
 * 时间复杂度O（n）O（n），额外空间复杂度O（1）O（1）。
 */
public class Test2 {
    //逆置字符串
    private static String reverse(String s, int begin, int end) {
        char[] arr = s.toCharArray();
        while (begin < end) {
            char tmp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = tmp;
            begin++;
            end--;
        }

        return String.valueOf(arr);
    }

    private static String func(int n, String s) {
        //判断字符串是否为空
        if (s == null || n <= 0 || n >= s.length()) {
            return null;
        }

        s = reverse(s, 0, n - 1);
        s = reverse(s, n, s.length() - 1);
        s = reverse(s, 0, s.length() - 1);

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String s = sc.next();
            String ret = func(n, s);
            System.out.println(ret);
        }
    }
}
