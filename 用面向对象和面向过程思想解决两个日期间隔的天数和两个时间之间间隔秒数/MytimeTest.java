/**
 *测试
 */
public class MytimeTest {
    public static void main(String[] args) {
        Mytime fromTime=new Mytime(9,10,23);
        Mytime toTime=new Mytime(10,10,38);
        System.out.printf("从 %s 到 %s 经过了 %d 秒\n",fromTime, toTime, toTime.methodTime(fromTime));
    }
}
