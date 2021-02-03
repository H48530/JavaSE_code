/**
 * 实现方法 replace, 能够替换字符串中的某个部分
 */
public class MyString4 {
    String s;

    public MyString4(String s) {
        this.s = s;
    }
    public String replace(char a1, char a2) {
        char[] array1 = s.toCharArray();

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == a1) {
                array1[i] = a2;
            }
        }
        return new String(array1);
    }
    public static void main(String[] args) {
        String s1 = "hello world hello java！";

        MyString4 s = new MyString4("hello world hello java！");

        String a = s.replace('h', 'a');
        String b = s.replace('！', '.');
        String c = s.replace('l', 'q');
        String d = s.replace('h', 'b');

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
