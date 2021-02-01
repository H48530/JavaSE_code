import java.util.Arrays;

/**
 *二维数组
 */
public class Demo6 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3,4}, {4, 5, 6}, {7, 8, 9}};
       // print(a);
        System.out.println(Arrays.deepToString(a));
    }

    private static void print(int[][] a) {
        for (int[] ints : a) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void main1(String[] args) {
        int[][] a = new int[5][];
        int[] e = a[0];
        System.out.println(Arrays.toString(e));
        e[0] = 10;
    }
}
