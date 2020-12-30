import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();

            while (num > 0) {
                int a = num % 16;
                num = num / 16;
                System.out.println(a);
            }
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();

            while (num > 0) {
                int a = num % 10;
                num = num / 10;
                System.out.println(a);
            }
        }
    }
}
