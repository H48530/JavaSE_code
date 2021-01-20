/**
 * for循环遍历数组
 * for-each遍历数组
 */
public class Demo5 {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{4, 5, 6};
        int x=20;int y=5;
        System.out.println(x+y +""+(x+y)+y);
    }

    public static void main2(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
