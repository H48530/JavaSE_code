/**
 *计算两个时间差
 */
public class Mytime {
    public int hour;
    public int min;
    public int sec;

    public Mytime(int hour, int min, int sec) {
        if (hour<0||hour>24){
            throw new RuntimeException("hour参数不合法");
        }
        if (min<0||min>=60){
            throw new RuntimeException("min参数不合法");
        }
        if (sec<0||sec>=60){
            throw new RuntimeException("sec参数不合法");
        }
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Mytime{" + "hour=" + hour + ", min=" + min + ", sec=" + sec + '}';
    }

    public Mytime(Mytime fromTime){
        this.hour = fromTime.hour;
        this.min = fromTime.min;
        this.sec = fromTime.sec;
    }
    public int methodTime(Mytime fromTime){
        if (this.compareToTime(fromTime) <= 0) {
            throw new RuntimeException("from 的时间必须当前时间之前");
        }
        Mytime fromCopy = new Mytime(fromTime);
        int count = 0;
        while (fromCopy.compareToTime(this) < 0) {
            System.out.println(fromCopy);
            fromCopy.increment();
            count++;
        }
        return count;

    }

    //考虑进位
    private void increment() {
        sec++;
        if (sec < 60) {
            return;
        }
        min++;
        sec = 0;
        if (min < 60) {
            return;
        }
        hour++;
        min =0 ;
    }

    private int compareToTime(Mytime fromTime) {
        if (hour != fromTime.hour) {
            return hour - fromTime.hour;
        }
        if (min != fromTime.min) {
            return min - fromTime.min;
        }
        return sec - fromTime.sec;
    }
}
