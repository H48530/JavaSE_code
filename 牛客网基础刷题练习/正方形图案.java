import java.util.Scanner;

public class 正方形图案 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

