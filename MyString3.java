/**
 * 实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
 */


import java.util.Arrays;

public class MyString3 {
    private static String[] split(String str, String s) {
        int count = 0;
        //统计字符串中目标分割符的次数
        for (int i = 0; i < str.length(); i++) {
            if (s.equals(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        String[] result = new String[++count];
        Arrays.fill(result, "");
        int t = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!s.equals(String.valueOf(str.charAt(i)))) {
                result[t] += str.charAt(i);
            } else {
                //遇到分隔符，数组下表后移
                t++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
        String str = "hello world hello java！";
        System.out.println(Arrays.toString(split(str, " ")));
        System.out.println(Arrays.toString(split(str, "e")));
        System.out.println(Arrays.toString(split(str, "l ")));
        System.out.println(Arrays.toString(split(str, "！")));
        System.out.println(Arrays.toString(split(str, "")));
    }
}
