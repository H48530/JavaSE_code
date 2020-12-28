package D1228;

import java.util.Scanner;

public class PrintDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            for (int i = a; i > 0; i--) {
                for (int j = 0; j <= a - i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
