package com.graphql.compras.utils;

import lombok.AllArgsConstructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


@AllArgsConstructor
public class DateUtils {

    private static final String PATTERN = "dd/MM/yyyy HH:mm";

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(PATTERN);

    static {
        SIMPLE_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT-3"));
    }

    public static String toString(Date d) {
        return SIMPLE_DATE_FORMAT.format(d);
    }

    public static Date toDate(String s) {
        try {
            return SIMPLE_DATE_FORMAT.parse(s);
        } catch (ParseException e) {
            return null;
        }
    }
}
