package DateTime;

/**
 * 计算时间日期
 */
public class DateTime {
    private MyDate date;
    private MyTime time;

    public DateTime(DateTime datetime) {
        this.date = new MyDate(datetime.date);
        this.time = new MyTime(0, 0, 0);
    }

    public DateTime(int year, int month, int day, int hour, int minute, int second) {
        this.date = new MyDate(year, month, day);
        this.time = new MyTime(hour, minute, second);
    }

    public DateTime(int year, int month, int day) {
        this(year, month, day, 0, 0, 0);
    }

    public DateTime(MyDate date) {
        this.date = new MyDate(date);
    }

    //  向后走一秒
    public void next() {
        if (time.next()) {
            date.next();
        }
    }

    // 向前走一秒
    public void previous() {
        if (time.previous()) {
            date.previous();
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s", date, time);
    }
}



