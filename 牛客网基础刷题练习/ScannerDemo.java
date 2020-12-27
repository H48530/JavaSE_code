import java.util.Scanner;

public class ScannerDemo {//如何输入

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(sc.next());
            // System.out.println(sc.nextLine());
        }
    }


    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(word);

    }

}
