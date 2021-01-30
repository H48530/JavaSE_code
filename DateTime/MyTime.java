package DateTime;
/**
 * 计算时间
 */
public class MyTime {
    private int hour;
    private int min;
    private int sec;

    public MyTime(MyTime time) {
        this.hour = time.hour;
        this.min = time.min;
        this.sec = time.sec;
    }

    public MyTime(int hour, int min, int sec) {
        cheak(hour, min, sec);
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    //往后走1秒
    public boolean next() {
        sec++;
        if (sec < 60) {
            return false;
        }
        min++;
        sec = 0;
        if (min < 60) {
            return false;
        }
        hour++;
        min = 0;
        if (hour < 24) {
            return false;
        }
        hour = 0;
        return true;
    }

    //往前走1秒
    public boolean previous() {
        sec--;
        if (sec >= 0) {
            return false;
        }
        min--;
        sec = 59;
        if (min >= 0) {
            return false;
        }
        hour--;
        min = 59;
        if (hour >= 0) {
            return false;
        }
        hour = 23;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }

    //合法性校验
    private static void cheak(int hour, int min, int sec) {
        if (hour < 0 || hour >= 24) {
            throw new RuntimeException("hour参数有问题");
        }
        if (min < 0 || min >= 60) {
            throw new RuntimeException("min参数有问题");
        }
        if (sec < 0 || sec >= 60) {
            throw new RuntimeException("sec参数有问题");
        }
    }
}
