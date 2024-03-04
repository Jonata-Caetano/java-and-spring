package com.graphql.compras.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {

    private static final String PATTERN = "dd/MM/yyyy HH:mm";

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(PATTERN);

    private DateUtils() {
    }

    static {
        SIMPLE_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT-3"));
    }

    public static String formatarData(Date date) {
        return SIMPLE_DATE_FORMAT.format(date);
    }

    public static Date converterParaData(String string) {
        try {
            return SIMPLE_DATE_FORMAT.parse(string);
        } catch (ParseException e) {
            return null;
        }
    }
}
