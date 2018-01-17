package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by nzm on 15/12/28.
 */
public class CalendarUtils {

    private static final String TIME_ZONE = "GMT+8";

    public static Calendar getCurrentTime() {
        return Calendar.getInstance(TimeZone.getTimeZone(TIME_ZONE));
    }

    /**
     * 获取12个小时以后的时间
     *
     * @return
     */
    public static Calendar getAfter24HoursTime() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(TIME_ZONE));
        calendar.add(Calendar.HOUR, 24);
        return calendar;
    }

    /**
     * 时间戳转换成时间
     *
     * @param time
     * @return
     */
    public static String getForMatDate(long time) {
        DateFormat formatter = new SimpleDateFormat("yyyyMMddhhmmss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    /**
     * 日期字符转化为Calendar
     *
     * @param date
     * @return
     * @throws Exception
     */
    public static Calendar dateToCalendarDevelop(String date)throws Exception {


        DateFormat formatter = null;
        if (date.length()> 11) {
            formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        } else {
            formatter = new SimpleDateFormat("yyyy-MM-dd");
        }
        if (date.contains("年")) {
            date = date.replaceAll("年", "-").replaceAll("月", "-").replaceAll("日", "");
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(TIME_ZONE));
        Date daystart = formatter.parse(date);
        calendar.setTime(daystart);
        System.out.println("develop新增 ");
        return calendar;

    }

}
