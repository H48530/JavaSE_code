/**
 * 实现Index方法
 */

public class MyString {
    //实现方法 indexOf, 能够找出字符串子串存在的位置
    String s;
    boolean flg = true;
    public MyString(String s) {
        this.s = s;
    }
    public int indexOf(String str) {
        return indexOf(str, 0);
    }

    public int indexOf(String str, int k) {
        char[] array1 = s.toCharArray();
        char[] array2 = str.toCharArray();
        if (array1.length < array2.length) {
            return -1;
        }
        flg = true;
        for (int i = k; i < array1.length; i++) {
            if (array2[0] == array1[i]) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[j + i] != array2[j]) {
                        flg = false;
                        break;
                    }
                }
                if (flg) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //String s = "hello world hello java！";
        MyString s = new MyString("hello world hello java！");
        int a = s.indexOf("hllo");
        int b = s.indexOf("java");
        int c = s.indexOf("h", 1);
        int d = s.indexOf("hello", 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }



}
