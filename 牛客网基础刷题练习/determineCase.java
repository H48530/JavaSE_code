package Day0118;

import java.util.Scanner;

/**
 * 判断字母大小写
 */
public class determineCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char c = sc.next().charAt(0);
            System.out.println(c >= 65 && c <= 90 || c >= 97 && c <= 122 ? "YES" : "NO");
        }
    }
}
