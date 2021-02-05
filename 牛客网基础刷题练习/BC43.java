package Day0119;

import java.util.Scanner;

/**
 *及格分数
 */
public class BC43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num >=60 && num <= 100) {
                System.out.println("Pass");
            }else {
                System.out.println("Fail");
            }
        }
    }
}
