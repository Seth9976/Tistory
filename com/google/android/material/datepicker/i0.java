package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import com.google.android.material.R.string;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public abstract class i0 {
    public static final AtomicReference a;

    static {
        i0.a = new AtomicReference();
    }

    public static long a(long v) {
        Calendar calendar0 = i0.g(null);
        calendar0.setTimeInMillis(v);
        return i0.c(calendar0).getTimeInMillis();
    }

    public static DateFormat b(String s, Locale locale0) {
        DateFormat dateFormat0 = DateFormat.getInstanceForSkeleton(s, locale0);
        dateFormat0.setTimeZone(TimeZone.getTimeZone("UTC"));
        dateFormat0.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return dateFormat0;
    }

    public static Calendar c(Calendar calendar0) {
        Calendar calendar1 = i0.g(calendar0);
        Calendar calendar2 = i0.g(null);
        calendar2.set(calendar1.get(1), calendar1.get(2), calendar1.get(5));
        return calendar2;
    }

    public static SimpleDateFormat d() {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(((SimpleDateFormat)java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y"), Locale.getDefault());
        simpleDateFormat0.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        simpleDateFormat0.setLenient(false);
        return simpleDateFormat0;
    }

    public static String e(Resources resources0, SimpleDateFormat simpleDateFormat0) {
        String s = simpleDateFormat0.toPattern();
        String s1 = resources0.getString(string.mtrl_picker_text_input_year_abbr);
        String s2 = resources0.getString(string.mtrl_picker_text_input_month_abbr);
        String s3 = resources0.getString(string.mtrl_picker_text_input_day_abbr);
        if(Locale.getDefault().getLanguage().equals("ko")) {
            s = s.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return s.replace("d", s3).replace("M", s2).replace("y", s1);
    }

    public static Calendar f() {
        h0 h00 = (h0)i0.a.get();
        Calendar calendar0 = Calendar.getInstance();
        calendar0.set(11, 0);
        calendar0.set(12, 0);
        calendar0.set(13, 0);
        calendar0.set(14, 0);
        calendar0.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar0;
    }

    public static Calendar g(Calendar calendar0) {
        Calendar calendar1 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if(calendar0 == null) {
            calendar1.clear();
            return calendar1;
        }
        calendar1.setTimeInMillis(calendar0.getTimeInMillis());
        return calendar1;
    }
}

