/**
 * 整数类型
 */
public class IntegerType {

    //double 型
    public static void main(String[] args) {
        double num = 12.5;
        System.out.println(num);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

    }

    //float 型
    public static void main4(String[] args) {
        float num = 10.3f;
        System.out.println(num);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

    }

    //long 类型
    public static void main3(String[] args) {
        long num = 10L;
        System.out.println(num);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE + 1);
        System.out.println(Long.MIN_VALUE - 1);
    }


    //int 类型
    public static void main2(String[] args) {
        int a = 123;
        System.out.println(a);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);

    }

    //short类型
    public static void main1(String[] args) {
        short a = 123;
        System.out.println(a);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

    }

    //byte类型
    public static void main0(String[] args) {
//        byte a = 0;
//        System.out.println(a);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE + 1);
        System.out.println(Byte.MIN_VALUE - 1);

    }
}
