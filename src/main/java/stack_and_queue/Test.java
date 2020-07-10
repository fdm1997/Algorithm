package stack_and_queue;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author fdm
 * @Date 2020/7/10 11:11
 * @description：
 */
public class Test {

    public static Date getFirstDay(int year, int month) {
        // 获取Calendar类的实例
        Calendar c = Calendar.getInstance();
        // 设置年份
        c.set(Calendar.YEAR, year);
        // 设置月份，因为月份从0开始，所以用month - 1
        c.set(Calendar.MONTH, month - 1);
        //将小时至0
        c.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c.set(Calendar.MINUTE, 0);
        //将秒至0
        c.set(Calendar.SECOND,0);
        //将毫秒至0
        c.set(Calendar.MILLISECOND, 0);
        // 设置日期
        c.set(Calendar.DAY_OF_MONTH, 1);

        return c.getTime();
    }

    public static Date getLastDay(int year, int month) {
        // 获取Calendar类的实例
        Calendar c = Calendar.getInstance();
        // 设置年份
        c.set(Calendar.YEAR, year);
        // 设置月份，因为月份从0开始，所以用month - 1
        c.set(Calendar.MONTH, month - 1);
        // 获取当前时间下，该月的最大日期的数字
        int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        //将小时至23
        c.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至59
        c.set(Calendar.MINUTE, 59);
        //将秒至59
        c.set(Calendar.SECOND, 59);
        //将毫秒至999
        c.set(Calendar.MILLISECOND, 999);
        // 将获取的最大日期数设置为Calendar实例的日期数
        c.set(Calendar.DAY_OF_MONTH, lastDay);

        return  c.getTime();
    }

    public static void main(String[] args) {
    }
}
