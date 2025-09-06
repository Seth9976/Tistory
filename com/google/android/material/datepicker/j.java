package com.google.android.material.datepicker;

import androidx.core.util.Pair;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class j {
    public static Pair a(Long long0, Long long1) {
        if(long0 == null && long1 == null) {
            return Pair.create(null, null);
        }
        if(long0 == null) {
            return Pair.create(null, j.b(((long)long1)));
        }
        if(long1 == null) {
            return Pair.create(j.b(((long)long0)), null);
        }
        Calendar calendar0 = i0.f();
        Calendar calendar1 = i0.g(null);
        calendar1.setTimeInMillis(((long)long0));
        Calendar calendar2 = i0.g(null);
        calendar2.setTimeInMillis(((long)long1));
        if(calendar1.get(1) == calendar2.get(1)) {
            return calendar1.get(1) == calendar0.get(1) ? Pair.create(j.c(((long)long0), Locale.getDefault()), j.c(((long)long1), Locale.getDefault())) : Pair.create(j.c(((long)long0), Locale.getDefault()), j.d(((long)long1), Locale.getDefault()));
        }
        return Pair.create(j.d(((long)long0), Locale.getDefault()), j.d(((long)long1), Locale.getDefault()));
    }

    public static String b(long v) {
        Calendar calendar0 = i0.f();
        Calendar calendar1 = i0.g(null);
        calendar1.setTimeInMillis(v);
        return calendar0.get(1) == calendar1.get(1) ? j.c(v, Locale.getDefault()) : j.d(v, Locale.getDefault());
    }

    public static String c(long v, Locale locale0) {
        return i0.b("MMMd", locale0).format(new Date(v));
    }

    public static String d(long v, Locale locale0) {
        return i0.b("yMMMd", locale0).format(new Date(v));
    }
}

