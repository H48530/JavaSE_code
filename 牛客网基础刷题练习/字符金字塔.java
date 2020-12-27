import java.util.Scanner;

public class 字符金字塔 {
    public static void main0(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        char a = i.charAt(0);
        for (int count = 0; count < 5; count++) {
            for (int b = 0; b < 4 - count; b++) {
                System.out.print(" ");
            }
            for (int b = 0; b < count + 1; b++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char n = str.charAt(0);

        int count = 0;
        while (count < 5) {
            for (int i = 0; i < 4 - count; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count + 1; j++) {
                System.out.print( n+" ");
            }
            System.out.println();
            count++;
        }
    }
}
