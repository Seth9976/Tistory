package androidx.core.text.util;

import android.os.Build.VERSION;
import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import l3.f;

@RequiresApi(21)
public final class LocalePreferences {
    public static class CalendarType {
        @RestrictTo({Scope.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface CalendarTypes {
        }

        public static final String CHINESE = "chinese";
        public static final String DANGI = "dangi";
        public static final String DEFAULT = "";
        public static final String GREGORIAN = "gregorian";
        public static final String HEBREW = "hebrew";
        public static final String INDIAN = "indian";
        public static final String ISLAMIC = "islamic";
        public static final String ISLAMIC_CIVIL = "islamic-civil";
        public static final String ISLAMIC_RGSA = "islamic-rgsa";
        public static final String ISLAMIC_TBLA = "islamic-tbla";
        public static final String ISLAMIC_UMALQURA = "islamic-umalqura";
        public static final String PERSIAN = "persian";

    }

    public static class FirstDayOfWeek {
        @RestrictTo({Scope.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface Days {
        }

        public static final String DEFAULT = "";
        public static final String FRIDAY = "fri";
        public static final String MONDAY = "mon";
        public static final String SATURDAY = "sat";
        public static final String SUNDAY = "sun";
        public static final String THURSDAY = "thu";
        public static final String TUESDAY = "tue";
        public static final String WEDNESDAY = "wed";

    }

    public static class HourCycle {
        @RestrictTo({Scope.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface HourCycleTypes {
        }

        public static final String DEFAULT = "";
        public static final String H11 = "h11";
        public static final String H12 = "h12";
        public static final String H23 = "h23";
        public static final String H24 = "h24";

    }

    public static class TemperatureUnit {
        @RestrictTo({Scope.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface TemperatureUnits {
        }

        public static final String CELSIUS = "celsius";
        public static final String DEFAULT = "";
        public static final String FAHRENHEIT = "fahrenhe";
        public static final String KELVIN = "kelvin";

    }

    public static final String[] a;

    static {
        LocalePreferences.a = new String[]{"BS", "BZ", "KY", "PR", "PW", "US"};
    }

    @NonNull
    public static String getCalendarType() {
        return LocalePreferences.getCalendarType(true);
    }

    @NonNull
    public static String getCalendarType(@NonNull Locale locale0) {
        return LocalePreferences.getCalendarType(locale0, true);
    }

    @NonNull
    public static String getCalendarType(@NonNull Locale locale0, boolean z) {
        String s = locale0.getUnicodeLocaleType("ca");
        if(s == null) {
            s = z ? null : "";
        }
        return s == null ? f.a(locale0) : s;
    }

    @NonNull
    public static String getCalendarType(boolean z) {
        return LocalePreferences.getCalendarType(f.b(), z);
    }

    @NonNull
    public static String getFirstDayOfWeek() {
        return LocalePreferences.getFirstDayOfWeek(true);
    }

    @NonNull
    public static String getFirstDayOfWeek(@NonNull Locale locale0) {
        return LocalePreferences.getFirstDayOfWeek(locale0, true);
    }

    @NonNull
    public static String getFirstDayOfWeek(@NonNull Locale locale0, boolean z) {
        String s = locale0.getUnicodeLocaleType("fw");
        if(s == null) {
            s = z ? null : "";
        }
        if(s == null) {
            int v = Calendar.getInstance(locale0).getFirstDayOfWeek();
            return v < 1 || v > 7 ? "" : new String[]{"sun", "mon", "tue", "wed", "thu", "fri", "sat"}[v - 1];
        }
        return s;
    }

    @NonNull
    public static String getFirstDayOfWeek(boolean z) {
        return LocalePreferences.getFirstDayOfWeek(f.b(), z);
    }

    @NonNull
    public static String getHourCycle() {
        return LocalePreferences.getHourCycle(true);
    }

    @NonNull
    public static String getHourCycle(@NonNull Locale locale0) {
        return LocalePreferences.getHourCycle(locale0, true);
    }

    @NonNull
    public static String getHourCycle(@NonNull Locale locale0, boolean z) {
        String s = locale0.getUnicodeLocaleType("hc");
        if(s == null) {
            s = z ? null : "";
        }
        if(s != null) {
            return s;
        }
        if(Build.VERSION.SDK_INT >= 33) {
            return a.a(locale0);
        }
        return DateFormat.getBestDateTimePattern(locale0, "jm").contains("H") ? "h23" : "h12";
    }

    @NonNull
    public static String getHourCycle(boolean z) {
        return LocalePreferences.getHourCycle(f.b(), z);
    }

    @NonNull
    public static String getTemperatureUnit() {
        return LocalePreferences.getTemperatureUnit(true);
    }

    @NonNull
    public static String getTemperatureUnit(@NonNull Locale locale0) {
        return LocalePreferences.getTemperatureUnit(locale0, true);
    }

    @NonNull
    public static String getTemperatureUnit(@NonNull Locale locale0, boolean z) {
        String s = locale0.getUnicodeLocaleType("mu");
        if(s == null) {
            s = z ? null : "";
        }
        if(s != null) {
            return s;
        }
        if(Build.VERSION.SDK_INT >= 33) {
            return a.b(locale0);
        }
        String s1 = locale0.getCountry();
        return Arrays.binarySearch(LocalePreferences.a, s1) < 0 ? "celsius" : "fahrenhe";
    }

    @NonNull
    public static String getTemperatureUnit(boolean z) {
        return LocalePreferences.getTemperatureUnit(f.b(), z);
    }
}

