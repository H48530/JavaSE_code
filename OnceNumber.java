public class OnceNumber {
    //    找出出现一次的数字
    //    有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字

    public static int array(int[] arr) {
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            //运用异或，找出这个只出现一次的数字
            //0和任何数异或都是 其本身  两个相同的数异或，结果为0
            ret = ret ^ arr[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8};//定义一个数组
        int ret = array(arr);//方法调用
        System.out.println(ret);
    }
}
