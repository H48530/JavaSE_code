/**
 *二维数组的二分查找
 */
public class BinarySearch2Test {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8},{9,10,11,12}};
        int a = BinarySearch2.binarySearch2(arr,3,4 ,10);
        System.out.println(a);
    }
}
