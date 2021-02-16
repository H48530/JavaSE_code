package com;

import java.util.Scanner;

/**
 * 来源：牛客网链接：https://www.nowcoder.com/questionTerminal/784efd40ed8e465a84821c8f3970b7b5
 * 输入一个字符串，求出该字符串包含的字符集合
 * 输入描述:
 * 每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
 * 输出描述:
 * 每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。
 * 示例1
 * 输入
 * abcqweracb
 * 输出
 * abcqwer
 */
public class Test3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            StringBuilder ret = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                String tmp = ret.toString();
                if (!tmp.contains(ch + "")) {
                    ret.append(ch);
                }
            }
            System.out.println(ret);
        }
    }
}
