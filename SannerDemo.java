package Practice1228;

import java.util.Scanner;

public class SannerDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        while (sc.hasNextInt()){
            int i = sc.nextInt();//输入数字i
            System.out.println(i);//打印数字i
        }

    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println(i);   //读取int型的数据
//
        //读取字符串
        String s2 = sc.next();
        System.out.println(s2);
        //读取一行数据
        String s1 = sc.nextLine();
        System.out.println(s1);

    }

    public static void main1(String[] args) {
        System.out.println("hello world!");
        System.out.print("hello world!");

        String str = "hello world";
        System.out.printf("%s\n", str);
    }
}