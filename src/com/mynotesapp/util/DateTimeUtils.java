package com.mynotesapp.util;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTimeUtils {
    public static String getCurrentTimestamp(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
