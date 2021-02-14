package com;

import java.util.Scanner;

/**
 * 来源：牛客网  链接：https://www.nowcoder.com/questionTerminal/e45e078701ab4e4cb49393ae30f1bb04
 * 接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 * 输入描述:
 * 输入一行，为一个只包含小写字母的字符串。
 * 输出描述:
 * 输出该字符串反转后的字符串。
 * 示例1
 * 输入
 * abcd
 * 输出
 * dcba
 */
public class Test1 {
    private static String resver(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ret = resver(s);
        System.out.println(ret);
    }
}
