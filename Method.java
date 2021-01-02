public class Method {
//    计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/n 的值（n 一定是偶数）

    public static double method(double num) {
        return 1 / num;
    }

    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 100; i += 2) {
            sum += method(i);
        }
        for (int i = 2; i <= 100; i += 2) {
            sum -= method(i);
        }
        System.out.println(sum);
    }
}
