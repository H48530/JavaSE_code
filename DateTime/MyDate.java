package DateTime;
/**
 *计算日期
 */
public class MyDate {
    private int year;
    private int mon;
    private int day;

    public MyDate(MyDate Date) {
        this.year = Date.year;
        this.mon = Date.mon;
        this.day = Date.day;
    }

    public MyDate(int year, int mon, int day) {
        //判断参数的合法性
        cheak(year, mon, day);
        this.year = year;
        this.mon = mon;
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d", year, mon, day);
    }


    private void cheak(int year, int mon, int day) {
        //校验参数的合法性
        if (mon < 1 || mon > 12) {
            throw new RuntimeException("mon的范围是1-12");
        }
        int days = getMonYear(year, mon);
        if (day < 1 || day > days) {
            throw new RuntimeException("day的范围是1-" + days);
        }

    }

    private static int getMonYear(int year, int mon) {
        if (mon == 2 && IsleapYear(year)) {
            return 29;
        }
        return DAY[mon - 1];
    }

    private static boolean IsleapYear(int year) {
        return (year % 4 == 0 && year % 400 != 0) || (year % 400 == 0);
    }

    private static final int[] DAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //往后走一天
    public void next() {
        day++;
        if (day <= getMonYear(year, mon)) {
            return;
        }
        mon++;
        day = 1;
        if (mon <= 12) {
            return;
        }
        year++;
        mon = 1;
    }

    //往前走一天
    public void previous() {
        day--;
        if (day > 0) {
            return;
        }
        mon--;
        if (mon > 0) {
            day = getMonYear(year, mon);
            return;
        }
        year--;
        mon = 12;
        day = getMonYear(year, mon);
    }
}
