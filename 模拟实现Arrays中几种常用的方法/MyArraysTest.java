public class MyArraysTest {
    public static void main(String[] args) {
        //test1();
        // test2();
        //test3();
        // test4();
        test5();
        long[] a1={1,2};
        long[] a2={1,2};
    }

    private static void test5() {
        long[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // -1, 10 应该返回 -1
        // [1, 9] 返回 [0, 8]
        for (long target = -1; target <= 10; target++) {
            System.out.println(MyArrays.binarySearch(array, target));
        }
    }

    private static void test4() {
        long[] original = {1, 2, 3};
        MyArrays.bubbleSort(original);
        System.out.println(MyArrays.toString(original));

    }

    private static void test3() {
        long[] original = {1, 2, 3};

        long[] c1 = MyArrays.copyRangeOf(original, 0, 0);
        System.out.println(MyArrays.toString(c1));  // []

        long[] c2 = MyArrays.copyRangeOf(original, 0, 1);
        System.out.println(MyArrays.toString(c2));  // [1]

        long[] c3 = MyArrays.copyRangeOf(original, 0, 3);
        System.out.println(MyArrays.toString(c3));  // [1, 2, 3]

        long[] c4 = MyArrays.copyRangeOf(original, 1, 1);
        System.out.println(MyArrays.toString(c4));  // []

        long[] c5 = MyArrays.copyRangeOf(original, 1, 2);
        System.out.println(MyArrays.toString(c5));  // [2]

        long[] c6 = MyArrays.copyRangeOf(original, 1, 3);
        System.out.println(MyArrays.toString(c6));  // [2, 3]

        long[] c7 = MyArrays.copyRangeOf(original, 0, 5);
        System.out.println(MyArrays.toString(c7));  // [1, 2, 3, 0, 0]

        long[] c8 = MyArrays.copyRangeOf(original, 3, 5);
        System.out.println(MyArrays.toString(c8));  // [0, 0]

        // TODO: 可以测试下一些参数错误的情况等
    }

    private static void test2() {
        long[] original = {1, 2, 3};

        long[] c1 = MyArrays.copyOf(original, 1);
        System.out.println(MyArrays.toString(c1));  // [1]
        long[] c2 = MyArrays.copyOf(original, 3);
        System.out.println(MyArrays.toString(c2));  // [1, 2, 3]
        long[] c3 = MyArrays.copyOf(original, 4);
        System.out.println(MyArrays.toString(c3));  // [1, 2, 3, 0]
    }

    private static void test1() {
        long[] array;
        String s;

        array = new long[0];
        s = MyArrays.toString(array);
        System.out.println(s);

        array = new long[5];
        s = MyArrays.toString(array);
        System.out.println(s);

        array = new long[]{1, 2, 3, 4, 5};
        s = MyArrays.toString(array);
        System.out.println(s);
    }
}
