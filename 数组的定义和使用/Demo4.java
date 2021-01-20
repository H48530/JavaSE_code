/**
 * 数组的定义
 * 长度
 * 下标越界问题
 */
public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[5]);//访问5号下标，可是5号下标并没有
    }

    public static void main1(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int a = arr.length;
        System.out.println(a);//数组的长度
        System.out.println(arr[0]);//打印0号下标数据
    }
}
