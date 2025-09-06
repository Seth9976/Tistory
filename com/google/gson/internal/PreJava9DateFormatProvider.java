package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class PreJava9DateFormatProvider {
    public static DateFormat getUSDateFormat(int v) {
        switch(v) {
            case 0: {
                return new SimpleDateFormat("EEEE, MMMM d, y", Locale.US);
            }
            case 1: {
                return new SimpleDateFormat("MMMM d, y", Locale.US);
            }
            case 2: {
                return new SimpleDateFormat("MMM d, y", Locale.US);
            }
            case 3: {
                return new SimpleDateFormat("M/d/yy", Locale.US);
            }
            default: {
                throw new IllegalArgumentException("Unknown DateFormat style: " + v);
            }
        }
    }

    public static DateFormat getUSDateTimeFormat(int v, int v1) {
        String s1;
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        switch(v) {
            case 0: {
                s = "EEEE, MMMM d, yyyy";
                break;
            }
            case 1: {
                s = "MMMM d, yyyy";
                break;
            }
            case 2: {
                s = "MMM d, yyyy";
                break;
            }
            case 3: {
                s = "M/d/yy";
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown DateFormat style: " + v);
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" ");
        switch(v1) {
            case 0: 
            case 1: {
                s1 = "h:mm:ss a z";
                break;
            }
            case 2: {
                s1 = "h:mm:ss a";
                break;
            }
            case 3: {
                s1 = "h:mm a";
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown DateFormat style: " + v1);
            }
        }
        stringBuilder0.append(s1);
        return new SimpleDateFormat(stringBuilder0.toString(), Locale.US);
    }
}

