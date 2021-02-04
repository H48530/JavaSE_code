package Day0119;

import java.util.Scanner;

/**
 *判断奇偶性
 */
public class BC44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num %2==0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
