/**
 * 相差多少天的计算
 */
public class MyDate {
    public int year;
    public int month;
    public int day;

    //判断合法性
    public MyDate(int year, int month, int day) {
        if (year < 1900 || year > 3000) {
            throw new RuntimeException("year参数有问题！");
        }
        if (month < 1 || month > 12) {
            throw new RuntimeException("month参数有问题！");
        }
        if (day < 1 || day > getMonthDay(year, month)) {
            throw new RuntimeException("day参数有问题！");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private int getMonthDay(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                // 利用不加 break，代码会继续向下的规则
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    //是否是闰年
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //将from的参数传进来
    public MyDate(MyDate from) {
        this.year = from.year;
        this.month = from.month;
        this.day = from.day;
    }

    @Override
    public String toString() {
        return "MyDate{" + "year=" + year + ", month=" + month + ", day=" + day + '}';
    }

    //计算相差天数：
    public int method(MyDate from) {
        if (this.compareTo(from) <= 0) {
            throw new RuntimeException("from 的日期必须当前日期之前");
        }
        MyDate fromCopy = new MyDate(from);
        int count = 0;
        while (fromCopy.compareTo(this) < 0) {
            System.out.println(fromCopy);
            fromCopy.increment();
            count++;
        }
        return count;
        //return count = between(this) - between(fromCopy);
    }

//    //以1900.1.1为基准，=计算
//    private int between(MyDate d) {
//        int year1 = 0;
//        for (int i = 1900; i < d.year; i++) {
//            if (isLeapYear(d.year)) {
//                year1 = year1 + 366;
//            } else {
//                year1 = year1 + 365;
//            }
//        }
//
//        int month1 = 0;
//        for (int i = 1; i < d.month; i++) {
//            month1 = month1 + getMonthDay(d.year, i);
//        }
//        int day1 = getMonthDay(d.year, d.month) - 1;
//
//        return year1 + month1 + day1;
//    }


    //考虑进位
    private void increment() {
        day++;
        if (day <= getMonthDay(year, month)) {
            // day 不需要考虑进位
            return;
        }
        // day 需要考虑日期进位
        month++;
        day = 1;
        if (month <= 12) {
            // month 不需要考虑进位
            return;
        }
        year++;
        month = 1;
    }

    private int compareTo(MyDate from) {
        if (year != from.year) {
            return year - from.year;
        }
        if (month != from.month) {
            return month - from.month;
        }
        return day - from.day;
    }
}
