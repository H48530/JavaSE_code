

/**
 * 求水仙花
 * 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，
 * 其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。
 */
public class Narcissus {
    public static void main(String[] args) {
        //因为是三位数，所以从100开始
        for (int i = 100; i <= 999; i++) {
            int a = i / 100;//百位
            int b = i / 10 % 10;//十位
            int c = i % 10;//个位
            //因为是double，所以需要强转int
            int d = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
            if (i == d) {
                System.out.println(i);
            }
        }
    }
}
