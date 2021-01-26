package StringDemo;

import java.util.Arrays;

/**
 * String类的方法使用
 */
public class Test {
    public static void main22(String[] args) {
        String s = "H";     // 创建一个对象 "H"

        for (int i = 0; i < 10; i++) {
            s = s + i;      // 创建一个新的对象
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("H");     // 创建一个对象 "H"

        for (int i = 0; i < 10; i++) {
            sb.append(i);      // 创建一个新的对象
        }

        String s = sb.toString();

        System.out.println(s);
    }

    public static void main21(String[] args) {
        String s = "     |Hello World|     |Hello Java！|      \n";
        String a = s.trim();
        System.out.println(a);

    }


    public static void main20(String[] args) {
        String s1 = " ";
        String s2 = "";
        boolean a = s1.isEmpty();
        boolean b = s2.isEmpty();
        System.out.println(a);
        System.out.println(b);
    }

    public static void main19(String[] args) {
        String a = "hello";
        String b = "Hello";
        String c = "Hello";
        int st1 = a.compareTo(b);
        int st4 = b.compareTo(a);
        int st2 = b.compareTo(c);
        int st3 = a.compareToIgnoreCase(c);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);
    }

    public static void main18(String[] args) {
        String a = "hello";
        String b = "Hello";
        String c = "Hello";
        boolean st1 = a.equals(b);
        boolean st2 = a.equalsIgnoreCase(c);
        boolean st3 = b.equalsIgnoreCase(c);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }

    public static void main17(String[] args) {
        String a = "hello";
        String b = "hello";
        System.out.println(a == b);
        String c = new String("hello");
        System.out.println(a == c);
    }

    public static void main16(String[] args) {
        String s = "Hello World Hello Java！";
        boolean a = s.endsWith("java！");
        boolean b = s.endsWith("Java！");

        System.out.println(a);
        System.out.println(b);
    }

    public static void main15(String[] args) {
        String s = "Hello World Hello Java！";
        boolean a = s.startsWith("he");
        boolean b = s.startsWith("He");
        boolean c = s.startsWith("ll", 2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main14(String[] args) {
        String s = "Hello World";
        String t = "Hello Java！";
        String a = s.concat(t);

        System.out.println(a);
    }

    public static void main13(String[] args) {
        String s = "Hello World Hello Java！";
        boolean a = s.contains("o");
        System.out.println(a);
    }

    public static void main12(String[] args) {
        String s = "Hello World Hello Java！";
        String a = s.toUpperCase();
        System.out.println(a);
    }

    public static void main11(String[] args) {
        String s = "Hello World Hello Java！";
        String a = s.toLowerCase();
        System.out.println(a);
    }

    public static void main10(String[] args) {
        String s = "hello world hello java！";
        String[] a = s.split(" ");//以空格拆分
        String b = String.join("/", a);

        System.out.println(Arrays.toString(a));
        System.out.println(b);
    }

    public static void main9(String[] args) {
        String s = "hello world hello java！";
        String[] a = s.split(" ");//以空格拆分
        String[] b = s.split("o", s.length());//用o拆分，数组最长不超过字符串长度
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static void main8(String[] args) {
        String s = "hello world hello java！";
        String a = s.replace("o", "a");
        System.out.println(a);
        String b = s.replace('0', ' ');
        System.out.println(b);
    }

    public static void main7(String[] args) {
        String s = "hello world hello java！";
        String a = s.substring(3);
        String b = s.substring(2, 10);
        System.out.println(a);
        System.out.println(b);
    }

    public static void main6(String[] args) {
        String s = "hello world hello java！";
        int a = s.lastIndexOf('h');
        int b = s.lastIndexOf('z');
        int c = s.lastIndexOf("hello");
        int d = s.lastIndexOf("hello", 5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main5(String[] args) {
        String s = "hello world hello java！";
        int a = s.indexOf('h');
        int b = s.indexOf('z');
        int c = s.indexOf("hello");
        int d = s.indexOf("hello", 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main4(String[] args) {
        String s = "hello world";
        char[] arr = s.toCharArray();

        System.out.println(Arrays.toString(arr));
    }

    public static void main3(String[] args) {
        String s = "hello world";
        char a = s.charAt(1);
        System.out.println(a);
    }

    public static void main2(String[] args) {
        String s = "hello world";
        int a = s.length();
        System.out.println(a);
    }

    public static void main1(String[] args) {
        String str1 = "hello world";

        String str2 = new String("hello world");

        char[] arr = {'a', 'b', 'c'};
        String str3 = new String(arr);
    }


}
