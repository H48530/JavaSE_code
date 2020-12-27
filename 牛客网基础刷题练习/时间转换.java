import java.util.Scanner;

public class 时间转换 {
    public static void main(String[] args) {
        //3661
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int num = 3661;
        int h = num / 3600;
        int m = num % 3600 / 60;
        int s = num % 60;
        System.out.println(h + " " + m + " " + s);

    }
}
