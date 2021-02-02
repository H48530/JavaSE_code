/**
 * 实现方法 contains, 能够判定字符串中是否包含子串
 */

public class MyString2 {

    String s;
    boolean flg = true;

    public MyString2(String s) {
        this.s = s;
    }

    public boolean contains(String str) {
        char[] array1 = s.toCharArray();
        char[] array2 = str.toCharArray();
        if (array1.length < array2.length) {
            return false;
        }
        flg = true;
        for (int i = 0; i < array1.length; i++) {
            if (array2[0] == array1[i]) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[j + i] != array2[j]) {
                        flg = false;
                        break;
                    }
                }
                if (flg) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //String s = "hello world hello java！";
        MyString2 s = new MyString2("hello world hello java！");
        boolean a = s.contains("llo");
        boolean b = s.contains("java");
        boolean c = s.contains("hllo");
        boolean d = s.contains("oorld");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
