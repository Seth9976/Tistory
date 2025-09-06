package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils {
    public static final TimeZone a;

    static {
        ISO8601Utils.a = TimeZone.getTimeZone("UTC");
    }

    public static boolean a(String s, int v, char c) {
        return v < s.length() && s.charAt(v) == c;
    }

    public static void b(StringBuilder stringBuilder0, int v, int v1) {
        String s = Integer.toString(v);
        for(int v2 = v1 - s.length(); v2 > 0; --v2) {
            stringBuilder0.append('0');
        }
        stringBuilder0.append(s);
    }

    public static int c(int v, int v1, String s) {
        int v4;
        int v2;
        if(v < 0 || v1 > s.length() || v > v1) {
            throw new NumberFormatException(s);
        }
        if(v < v1) {
            v2 = v + 1;
            int v3 = Character.digit(s.charAt(v), 10);
            if(v3 < 0) {
                throw new NumberFormatException("Invalid number: " + s.substring(v, v1));
            }
            v4 = -v3;
        }
        else {
            v4 = 0;
            v2 = v;
        }
        while(v2 < v1) {
            int v5 = Character.digit(s.charAt(v2), 10);
            if(v5 < 0) {
                throw new NumberFormatException("Invalid number: " + s.substring(v, v1));
            }
            v4 = v4 * 10 - v5;
            ++v2;
        }
        return -v4;
    }

    public static String format(Date date0) {
        return ISO8601Utils.format(date0, false, ISO8601Utils.a);
    }

    public static String format(Date date0, boolean z) {
        return ISO8601Utils.format(date0, z, ISO8601Utils.a);
    }

    public static String format(Date date0, boolean z, TimeZone timeZone0) {
        GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0, Locale.US);
        gregorianCalendar0.setTime(date0);
        StringBuilder stringBuilder0 = new StringBuilder((z ? 4 : 0) + 19 + (timeZone0.getRawOffset() == 0 ? 1 : 6));
        ISO8601Utils.b(stringBuilder0, gregorianCalendar0.get(1), 4);
        int v = 45;
        stringBuilder0.append('-');
        ISO8601Utils.b(stringBuilder0, gregorianCalendar0.get(2) + 1, 2);
        stringBuilder0.append('-');
        ISO8601Utils.b(stringBuilder0, gregorianCalendar0.get(5), 2);
        stringBuilder0.append('T');
        ISO8601Utils.b(stringBuilder0, gregorianCalendar0.get(11), 2);
        stringBuilder0.append(':');
        ISO8601Utils.b(stringBuilder0, gregorianCalendar0.get(12), 2);
        stringBuilder0.append(':');
        ISO8601Utils.b(stringBuilder0, gregorianCalendar0.get(13), 2);
        if(z) {
            stringBuilder0.append('.');
            ISO8601Utils.b(stringBuilder0, gregorianCalendar0.get(14), 3);
        }
        int v1 = timeZone0.getOffset(gregorianCalendar0.getTimeInMillis());
        if(v1 != 0) {
            int v2 = Math.abs(v1 / 60000 / 60);
            int v3 = Math.abs(v1 / 60000 % 60);
            if(v1 >= 0) {
                v = 43;
            }
            stringBuilder0.append(((char)v));
            ISO8601Utils.b(stringBuilder0, v2, 2);
            stringBuilder0.append(':');
            ISO8601Utils.b(stringBuilder0, v3, 2);
            return stringBuilder0.toString();
        }
        stringBuilder0.append('Z');
        return stringBuilder0.toString();
    }

    public static Date parse(String s, ParsePosition parsePosition0) throws ParseException {
        int v20;
        int v18;
        int v17;
        int v16;
        int v14;
        int v11;
        try {
            int v = parsePosition0.getIndex();
            int v1 = v + 4;
            int v2 = ISO8601Utils.c(v, v1, s);
            if(ISO8601Utils.a(s, v1, '-')) {
                v1 = v + 5;
            }
            int v3 = v1 + 2;
            int v4 = ISO8601Utils.c(v1, v3, s);
            if(ISO8601Utils.a(s, v3, '-')) {
                v3 = v1 + 3;
            }
            int v5 = v3 + 2;
            int v6 = ISO8601Utils.c(v3, v5, s);
            boolean z = ISO8601Utils.a(s, v5, 'T');
            if(!z && s.length() <= v5) {
                GregorianCalendar gregorianCalendar0 = new GregorianCalendar(v2, v4 - 1, v6);
                gregorianCalendar0.setLenient(false);
                parsePosition0.setIndex(v5);
                return gregorianCalendar0.getTime();
            }
            if(z) {
                int v7 = v3 + 5;
                int v8 = ISO8601Utils.c(v3 + 3, v7, s);
                if(ISO8601Utils.a(s, v7, ':')) {
                    v7 = v3 + 6;
                }
                int v9 = v7 + 2;
                int v10 = ISO8601Utils.c(v7, v9, s);
                if(ISO8601Utils.a(s, v9, ':')) {
                    v9 = v7 + 3;
                }
                if(s.length() <= v9 || (s.charAt(v9) == 43 || s.charAt(v9) == 45 || s.charAt(v9) == 90)) {
                    v18 = v10;
                    v16 = 0;
                    v11 = 0;
                    v5 = v9;
                    v17 = v8;
                }
                else {
                    v11 = ISO8601Utils.c(v9, v9 + 2, s);
                    if(v11 > 59 && v11 < 0x3F) {
                        v11 = 59;
                    }
                    if(ISO8601Utils.a(s, v9 + 2, '.')) {
                        int v12 = v9 + 4;
                        while(v12 < s.length()) {
                            int v13 = s.charAt(v12);
                            if(v13 >= 0x30 && v13 <= 57) {
                                ++v12;
                                continue;
                            }
                            v14 = v12;
                            goto label_40;
                        }
                        v14 = s.length();
                    label_40:
                        int v15 = Math.min(v14, v9 + 6);
                        v16 = ISO8601Utils.c(v9 + 3, v15, s);
                        switch(v15 - (v9 + 3)) {
                            case 1: {
                                v16 *= 100;
                                break;
                            }
                            case 2: {
                                v16 *= 10;
                            }
                        }
                        v17 = v8;
                        v5 = v14;
                        v18 = v10;
                    }
                    else {
                        v17 = v8;
                        v5 = v9 + 2;
                        v18 = v10;
                        v16 = 0;
                    }
                }
            }
            else {
                v17 = 0;
                v18 = 0;
                v16 = 0;
                v11 = 0;
            }
            if(s.length() <= v5) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            int v19 = s.charAt(v5);
            TimeZone timeZone0 = ISO8601Utils.a;
            if(v19 == 90) {
                v20 = v5 + 1;
            }
            else {
                if(v19 != 43 && v19 != 45) {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator \'" + ((char)v19) + "\'");
                }
                String s1 = s.substring(v5);
                s1 = s1.length() >= 5 ? s.substring(v5) : s1 + "00";
                v20 = v5 + s1.length();
                if(!"+0000".equals(s1) && !"+00:00".equals(s1)) {
                    timeZone0 = TimeZone.getTimeZone(("GMT" + s1));
                    String s2 = timeZone0.getID();
                    if(!s2.equals("GMT" + s1) && !s2.replace(":", "").equals("GMT" + s1)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + ("GMT" + s1) + " given, resolves to " + timeZone0.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar1 = new GregorianCalendar(timeZone0);
            gregorianCalendar1.setLenient(false);
            gregorianCalendar1.set(1, v2);
            gregorianCalendar1.set(2, v4 - 1);
            gregorianCalendar1.set(5, v6);
            gregorianCalendar1.set(11, v17);
            gregorianCalendar1.set(12, v18);
            gregorianCalendar1.set(13, v11);
            gregorianCalendar1.set(14, v16);
            parsePosition0.setIndex(v20);
            return gregorianCalendar1.getTime();
        }
        catch(IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException indexOutOfBoundsException0) {
        }
        String s3 = indexOutOfBoundsException0.getMessage();
        ParseException parseException0 = new ParseException("Failed to parse date [" + (s == null ? null : "\"" + s + '\"') + "]: " + (s3 != null && !s3.isEmpty() ? indexOutOfBoundsException0.getMessage() : "(" + indexOutOfBoundsException0.getClass().getName() + ")"), parsePosition0.getIndex());
        parseException0.initCause(indexOutOfBoundsException0);
        throw parseException0;
    }
}

