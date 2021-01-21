/**
 *
 */
public class MyDateTest {

    public static void main(String[] args) {
        MyDate from = new MyDate(2019, 1, 1);
        MyDate to = new MyDate(2020, 1, 3);

        System.out.println(to.method(from));
        System.out.printf("从 %s 到 %s 经过了 %d 天\n",from, to, to.method(from));
    }
}
