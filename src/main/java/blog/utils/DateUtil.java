package blog.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    /**
     * 标准时间
     */
    private static SimpleDateFormat standerFmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 精确到小时的时间
     */
    private static SimpleDateFormat hourFmt = new SimpleDateFormat("yyyy-MM-dd HH");

    private static final long millsecsPerDay = 1000 * 60 * 60 * 24L;
    private static final long millsecsPerSec = 1000;

    /**
     * 获取现在标准的时间字符串表示，用于数据库中存储时间
     * @return 时间的字符串表示: yyyy-MM-dd HH:mm:ss
     */
    public static String getTimeNow() {
        return standerFmt.format(new Date());
    }

    /**
     * 获取指定日期的标准时间字符串表示，用于数据库中存储时间
     * @param date  指定的日期
     * @return 时间的字符串表示: yyyy-MM-dd HH:mm:ss
     */
    public static String getTime(Date date) {
        return standerFmt.format(date);
    }

    /**
     * 获取精确到小时的时间的字符串表示
     * @param date  指定的日期
     * @return 时间的字符串表示: yyyy-MM-dd HH
     */
    public static String getTimeAtHour(Date date) {
        return hourFmt.format(date);
    }

    /**
     * 获取指定时间的小时表示
     * @param date  指定的日期
     * @return 时间的字符串表示: HH:00
     */
    public static String getHourOfTime(Date date) {
        SimpleDateFormat fmt = new SimpleDateFormat("HH:00");
        return fmt.format(date);
    }

    /**
     * 从标准时间的字符串解析出时间
     * @param standerFmtTime 标准时间的字符串表示
     * @return  日期
     * @throws ParseException 解析异常
     */
    public static Date fromString(String standerFmtTime) throws ParseException {
        return standerFmt.parse(standerFmtTime);
    }

    /**
     * 将时间转换为标准字符串
     */
    public static String intoString(Date date){
        if (date == null)return null;
        return standerFmt.format(date);
    }

    /**
     * 两个日期之间的天数间隔
     * @param fromDay   开始
     * @param toDay     结束
     * @return          相差天数
     */
    public static int countDay(Date fromDay, Date toDay) {
        if (null == toDay) {
            toDay = new Date();
        }
        return (int)(Math.abs(toDay.getTime() - fromDay.getTime()) / millsecsPerDay);
    }

    /**
     * 两个日期之间的秒间隔
     * @param fromDay   开始
     * @param toDay     结束
     * @return  相差秒数
     */
    public static long countSec(Date fromDay, Date toDay) {
        if (null == toDay) {
            toDay = new Date();
        }
        return Math.abs(toDay.getTime() - fromDay.getTime()) / millsecsPerSec;
    }

    /**
     * 获取指定日期的一周内的星期数，无论时区中的设置第一天是周一还是周日，
     * 最后的输出都是周日，一，二，三，四，五，六分别对应0,1,2,3,4,5,6
     * 区别于DAY_OF_WEEK(返回一周中的第几天，并非是下标)
     *
     * @param date 指定日期
     * @return 星期几
     */
    public static int getDayIndexOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        boolean isFirstSunday = (calendar.getFirstDayOfWeek() == Calendar.SUNDAY);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (isFirstSunday) {
            /* 如果第一天是周日，则直接减一即可 */
            dayOfWeek -= 1;
        } else {
            /* 如果第一天是周一，则将周日调为0即可 */
            if (dayOfWeek == 7){
                dayOfWeek = 0;
            }
        }

        return dayOfWeek;
    }


    /**
     * 日期格式字符串转换成时间戳
     * date 字符串日期
     * format 如：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String date2TimeStamp(String date_str){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return String.valueOf(sdf.parse(date_str).getTime()/1000);
        } catch (Exception e) {
        }
        return "";
    }
    /**
     * 日期格式字符串转换成时间戳
     *  date 字符串日期
     *  format 如：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String date2TimeHMS(String date_str){
        try {
            return String.valueOf(standerFmt.parse(date_str).getTime()/1000);
        } catch (Exception e) {
        }
        return "";
    }


}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-19 16:29
 **/
