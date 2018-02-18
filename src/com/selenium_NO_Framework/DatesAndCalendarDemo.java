package com.selenium_NO_Framework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesAndCalendarDemo {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(sdf1.format(d));
        //        System.out.println(d.toString());
        //        System.out.println(sdf.format(c.getTime()));
        //        System.out.println(c.get(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)));;
        System.out.println(c.get(c.get(Calendar.AM_PM)));
    }

}
