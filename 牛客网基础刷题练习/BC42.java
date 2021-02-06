package Day0119;

import java.util.Scanner;

/**
 *完美成绩
 */
public class BC42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num >= 90 && num <= 100) {
                System.out.println("Perfect");
            }
        }
    }
}
