package Day0119;

import java.util.Scanner;

/**
 *竞选社长
 */
public class BC40 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == 'A') {
                a++;
            }
            if (ch[i] == 'B') {
                b++;
            }
        }
        if (a > b) {
            System.out.println("A");
        } else if (a < b) {
            System.out.println("B");
        } else {
            System.out.println("E");
        }
    }
}
