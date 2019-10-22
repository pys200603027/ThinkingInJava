package function.io;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 时间判断
 */
public class TimeUtils {

    public static final int DAY = 86400000;

    public static boolean isToday(final long millis) {
        long wee = getWeeOfToday();
        return millis >= wee && millis < wee + DAY;
    }

    private static long getWeeOfToday() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTimeInMillis();
    }

    /**
     * @param oldTime 较小的时间
     * @param newTime 较大的时间 (如果为空   默认当前时间 ,表示和当前时间相比)
     * @return -1 ：同一天.    0：昨天 .   1 ：至少是前天.
     * @throws ParseException 转换异常
     * @author LuoB.
     */
    public static int isYeaterday(Date oldTime, Date newTime) throws ParseException {
        if (newTime == null) {
            newTime = new Date();
        }
        //将下面的 理解成  yyyy-MM-dd 00：00：00 更好理解点
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String todayStr = format.format(newTime);
        Date today = format.parse(todayStr);

        //昨天 86400000=24*60*60*1000 一天
        if ((today.getTime() - oldTime.getTime()) > 0 && (today.getTime() - oldTime.getTime()) <= DAY) {
            return 0;
        } else if ((today.getTime() - oldTime.getTime()) <= 0) { //至少是今天
            return -1;
        } else { //至少是前天
            return 1;
        }
    }

    /**
     * 时区格式化的问题：当两个时间相减后，得到剩余毫秒，如果想格式化，需要重置时区
     */
    @Test
    public void testTime() {
        System.out.println(System.currentTimeMillis());
        //2018-10-23 18:01:56
//        long timeLeft = 1540288916000L - System.currentTimeMillis();
        long timeLeft = 1571831637000L - System.currentTimeMillis();
        System.out.println(timeLeft);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        System.out.println(simpleDateFormat.format(timeLeft));


        while (true) {
            long l = 1571831637000L - System.currentTimeMillis();
            System.out.println(timeFormat(l));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 时间格式化显示 小时：分钟：秒
     * 大于一天累积小时
     *
     * @param l
     * @return
     */
    private String timeFormat(long l) {
        long day = l / (24 * 60 * 60 * 1000);
        long hour = (l / (60 * 60 * 1000) - day * 24);
        long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        if (day > 0) {
            hour = hour + day * 24;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(fixNumZero(hour)).append(":");
        sb.append(fixNumZero(min)).append(":");
        sb.append(fixNumZero(s));
        return sb.toString();
    }

    private String fixNumZero(long time) {
        if (time <= 0) {
            return "00";
        } else if (time < 10) {
            return "0" + time;
        }
        return String.valueOf(time);
    }


    /**
     * 20天
     */
    public static final int DAY_20 = 20 * 24 * 60 * 60 * 1000;

    /**
     * 13天
     */
    public static final int DAY_13 = 13 * 24 * 60 * 60 * 1000;

    /**
     * 7天
     */
    public static final int DAY_7 = 7 * 24 * 60 * 60 * 1000;
    /**
     * 1天
     */
    public static final int DAY_1 = 1 * 24 * 60 * 60 * 1000;
    /**
     * 1小时
     */
    public static final int HOUR_1 = 60 * 60 * 1000;

    /**
     * 30分钟
     */
    public static final int MINUTE_30 = 30 * 60 * 1000;

    /**
     * 1分钟
     */
    public static final int MINUTE_1 = 60 * 1000;

    /**
     * 30秒
     */
    public static final int SECOND_30 = 30 * 1000;


    public static String timeFormat(long timeStamp, long currentTime) {
        long timeGap = currentTime - timeStamp;

        if (timeGap >= DAY_20) {
            return new SimpleDateFormat("yyyy年MM月dd日").format(timeStamp);
        } else if (timeGap < DAY_20 && timeGap >= DAY_13) {
            return "3周前";
        } else if (timeGap < DAY_13 && timeGap >= DAY_7) {
            return "2周前";
        } else if (timeGap < DAY_7 && timeGap >= DAY_1) {
            //小于7天 大于1天
            int day = (int) (timeGap / DAY_1);
            return day + "天";
        } else if (timeGap < DAY_1) {
            //小于1天
            if (timeGap >= HOUR_1) {

                float hours = (float) ((timeGap) * 1.0 / (HOUR_1));
                System.out.println("hour:" + hours);
                //N个小时30分钟
                float HOURS_HAFL = ((int) hours * HOUR_1 + MINUTE_30);
                long hh = (long) HOURS_HAFL;
                System.out.println("haft:" + hh + ",gap:" + timeGap);

                if (timeGap >= HOURS_HAFL) {
                    if (hours >= 23) {
                        return "一天前";
                    } else {
                        //超过半小时
                        return ((int) hours + 1) + "小时";
                    }
                } else {
                    return (int) hours + "小时";
                }
            } else {
                //小于一小时 & 大于一分钟
                if (timeGap >= MINUTE_1) {

                    //多少分钟
                    float minutes = (float) ((timeGap) * 1.0 / (MINUTE_1));
                    System.out.println("min:" + minutes);

                    //N分钟30秒
                    float MINUTES_HAFL = ((int) minutes * MINUTE_1 + SECOND_30);

                    System.out.println("haft:" + MINUTES_HAFL + ",gap:" + timeGap);

                    if (timeGap >= MINUTES_HAFL) {
                        if (minutes >= 59) {
                            return "1小时前";
                        } else {
                            return ((int) minutes + 1) + "分钟前";
                        }
                    } else {
                        return (int) minutes + "分钟前";
                    }
                } else {
                    return "刚刚";
                }
            }
        }
        return new SimpleDateFormat("yyyy年MM月dd日").format(timeStamp);
    }

    /**
     * 测试时间格式化
     */
    @Test
    public void test2() {
        long now = System.currentTimeMillis() + MINUTE_1 * 60 * 23 + MINUTE_1 * 30;

        long old = System.currentTimeMillis();


        System.out.println(now - old);

        System.out.println(timeFormat(old, now));

    }


}
