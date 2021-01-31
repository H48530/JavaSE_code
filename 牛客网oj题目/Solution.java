import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     *
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public String solve(String s, String t) {
        // write code here
        //0.判断是否有0相加
        if (s.equals("0")) {
            return t;
        }
        //1.将字符串转换成字符数组
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        //2.转换成int数组
        int[] a1 = toIntArr(a);
        int[] b1 = toIntArr(b);
        //3.逆置数组
        int[] aInt = reverse(a1);
        int[] bInt = reverse(b1);
        int max = Math.max(aInt.length, bInt.length);
        int min = Math.min(aInt.length, bInt.length);
        int[] array = new int[max + 1];
        //4.相加
        //公共的
        int carry = 0;
        int i;
        for (i = 0; i < min; i++) {
            int r = aInt[i] + bInt[i] + carry;
            array[i] = r % 10;
            carry = r / 10;
        }
        //找到最长的数组
        int[] arrMax = aInt;
        if (aInt.length < bInt.length) {
            arrMax = bInt;
        }
        //非公共的
        for (; i < max; i++) {
            int r = arrMax[i] + carry;
            array[i] = r % 10;
            carry = r / 10;
        }
        //最后的进位
        array[max] = carry;

        //5.将数组逆置
        int[] arrayInt = reverse(array);
        //数组转字符串
        //String ret = String.valueOf(arrayInt);
        char[] arrayChar = new char[arrayInt.length];
        for (int j = 0; j < arrayInt.length; j++) {
            arrayChar[j] = (char) (arrayInt[j] + '0');
        }
        String ret = new String(arrayChar);
        //判断首位是否为0
        if (ret.charAt(0) == '0') {
            ret = ret.substring(1);
        }
        return ret;
    }

    private int[] toIntArr(char[] a) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i] - '0';
        }
        return arr;
    }

    private int[] reverse(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
        return a;
    }

    public static void main(String[] args) {

//        String s = "0";
//        String t = "0";
        // [0, 1, 1]

        String s = "1039";
        String t = "28";
//        // [7, 6, 0, 1]
        Solution solution = new Solution();
        System.out.println(solution.solve(s, t));
    }
}