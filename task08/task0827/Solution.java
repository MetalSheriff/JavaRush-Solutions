package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }
    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd YYYY", Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dateFormat.parse(date));

        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        if(dayOfYear % 2 == 0)
            return false;
        else
            return true;
    }
}
