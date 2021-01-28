package exchangeArray;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        ExchangeArray arr1 = new ExchangeArray(a);
        arr1.method(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
