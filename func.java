import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int r = m % n;
            while (r > 0) {
                m = n;
                n = r;
                r = m % n;
            }
            System.out.println(n);
        }
    }
}
