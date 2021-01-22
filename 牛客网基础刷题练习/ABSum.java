package Day0118;

import java.util.Scanner;

/**
 * 计算进制之间的加法
 */
public class ABSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();

        String num1=str1.substring(2,str1.length());
        String num2=str2.substring(1,str2.length());

        int a=Integer.valueOf(num1,16);
        int b=Integer.valueOf(num2,8);
        System.out.println(a+b);
    }
}
