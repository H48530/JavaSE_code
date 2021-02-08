package Day0119;

import java.util.Scanner;

/**
 * KiKi非常喜欢网购，在一家店铺他看中了一件衣服，他了解到，如果今天是“双11”（11月11日）则这件衣服打7折，
 * “双12” （12月12日）则这件衣服打8折，如果有优惠券可以额外减50元（优惠券只能在双11或双12使用），求KiKi最终所花的钱数。
 */
public class BC37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 0;
        while (sc.hasNextDouble()) {
            double price = sc.nextDouble();
            double mon = sc.nextDouble();
            double date = sc.nextDouble();
            double a = sc.nextDouble();

            if (mon == 11 && date == 11) {
                money = price * 0.7;
                if (a == 1) {
                    money -= 50;
                }
                break;
            } else if (mon == 12 && date == 12) {
                money = price * 0.8;
                if (a == 1) {
                    money -= 50;
                }
                break;
            } else {
                money = price;
            }
        }
        if (money <= 0) {
            money = 0;
        }
        System.out.printf("%.2f\n", money);
    }
}
