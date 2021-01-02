public class CountNum9 {
    //计算1——100中，数字9出现的次数
    public static int count9(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == 9) {
                count++;
            }
            num /= 10;
        }

//        if (num % 10 == 9 || num / 10 == 9)   {// 19
//            count++;
//        }
        return count;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += count9(i);
        }
        System.out.println(sum);
    }
}
