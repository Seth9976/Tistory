package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010%\n\u0002\b\u000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\b\u001A\u00020\u00072\f\b\u0002\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003H&\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH&\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000B\u001A\u00020\nH&\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\fH&\u00A2\u0006\u0004\b\u0010\u0010\u0013J\u001F\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0014H&\u00A2\u0006\u0004\b\u0010\u0010\u0017J\u0017\u0010\u0018\u001A\u00020\u00142\u0006\u0010\u0012\u001A\u00020\fH&\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001C\u001A\u00020\u000F2\u0006\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u001B\u001A\u00020\u0014H&\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001F\u0010\u001F\u001A\u00020\u000F2\u0006\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u001E\u001A\u00020\u0014H&\u00A2\u0006\u0004\b\u001F\u0010\u001DJ+\u0010\"\u001A\u00020 2\u0006\u0010\u0016\u001A\u00020\u000F2\u0006\u0010!\u001A\u00020 2\f\b\u0002\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003\u00A2\u0006\u0004\b\"\u0010#J+\u0010\"\u001A\u00020 2\u0006\u0010\u0012\u001A\u00020\f2\u0006\u0010!\u001A\u00020 2\f\b\u0002\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003\u00A2\u0006\u0004\b\"\u0010$J+\u0010\'\u001A\u00020 2\u0006\u0010%\u001A\u00020\n2\u0006\u0010&\u001A\u00020 2\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003H&\u00A2\u0006\u0004\b\'\u0010(J!\u0010)\u001A\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001A\u00020 2\u0006\u0010&\u001A\u00020 H&\u00A2\u0006\u0004\b)\u0010*R\u001B\u0010\u0004\u001A\u00060\u0002j\u0002`\u00038\u0006\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R&\u00104\u001A\u000E\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010/8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0014\u00107\u001A\u00020\f8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b5\u00106R\u0014\u0010:\u001A\u00020\u00148&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b8\u00109R&\u0010?\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0<0;8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b=\u0010>\u00A8\u0006@"}, d2 = {"Landroidx/compose/material3/internal/CalendarModel;", "", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Landroidx/compose/material3/internal/DateInputFormat;", "getDateInputFormat", "(Ljava/util/Locale;)Landroidx/compose/material3/internal/DateInputFormat;", "", "timeInMillis", "Landroidx/compose/material3/internal/CalendarDate;", "getCanonicalDate", "(J)Landroidx/compose/material3/internal/CalendarDate;", "Landroidx/compose/material3/internal/CalendarMonth;", "getMonth", "(J)Landroidx/compose/material3/internal/CalendarMonth;", "date", "(Landroidx/compose/material3/internal/CalendarDate;)Landroidx/compose/material3/internal/CalendarMonth;", "", "year", "month", "(II)Landroidx/compose/material3/internal/CalendarMonth;", "getDayOfWeek", "(Landroidx/compose/material3/internal/CalendarDate;)I", "from", "addedMonthsCount", "plusMonths", "(Landroidx/compose/material3/internal/CalendarMonth;I)Landroidx/compose/material3/internal/CalendarMonth;", "subtractedMonthsCount", "minusMonths", "", "skeleton", "formatWithSkeleton", "(Landroidx/compose/material3/internal/CalendarMonth;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "(Landroidx/compose/material3/internal/CalendarDate;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "utcTimeMillis", "pattern", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "parse", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/internal/CalendarDate;", "a", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "", "b", "Ljava/util/Map;", "getFormatterCache$material3_release", "()Ljava/util/Map;", "formatterCache", "getToday", "()Landroidx/compose/material3/internal/CalendarDate;", "today", "getFirstDayOfWeek", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "getWeekdayNames", "()Ljava/util/List;", "weekdayNames", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class CalendarModel {
    public static final int $stable = 8;
    public final Locale a;
    public final LinkedHashMap b;

    public CalendarModel(@NotNull Locale locale0) {
        this.a = locale0;
        this.b = new LinkedHashMap();
    }

    @NotNull
    public abstract String formatWithPattern(long arg1, @NotNull String arg2, @NotNull Locale arg3);

    @NotNull
    public final String formatWithSkeleton(@NotNull CalendarDate calendarDate0, @NotNull String s, @NotNull Locale locale0) {
        return CalendarModel_androidKt.formatWithSkeleton(calendarDate0.getUtcTimeMillis(), s, locale0, this.b);
    }

    @NotNull
    public final String formatWithSkeleton(@NotNull CalendarMonth calendarMonth0, @NotNull String s, @NotNull Locale locale0) {
        return CalendarModel_androidKt.formatWithSkeleton(calendarMonth0.getStartUtcTimeMillis(), s, locale0, this.b);
    }

    public static String formatWithSkeleton$default(CalendarModel calendarModel0, CalendarDate calendarDate0, String s, Locale locale0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if((v & 4) != 0) {
            locale0 = calendarModel0.a;
        }
        return calendarModel0.formatWithSkeleton(calendarDate0, s, locale0);
    }

    public static String formatWithSkeleton$default(CalendarModel calendarModel0, CalendarMonth calendarMonth0, String s, Locale locale0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if((v & 4) != 0) {
            locale0 = calendarModel0.a;
        }
        return calendarModel0.formatWithSkeleton(calendarMonth0, s, locale0);
    }

    @NotNull
    public abstract CalendarDate getCanonicalDate(long arg1);

    @NotNull
    public abstract DateInputFormat getDateInputFormat(@NotNull Locale arg1);

    public static DateInputFormat getDateInputFormat$default(CalendarModel calendarModel0, Locale locale0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
        }
        if((v & 1) != 0) {
            locale0 = calendarModel0.a;
        }
        return calendarModel0.getDateInputFormat(locale0);
    }

    public abstract int getDayOfWeek(@NotNull CalendarDate arg1);

    public abstract int getFirstDayOfWeek();

    @NotNull
    public final Map getFormatterCache$material3_release() {
        return this.b;
    }

    @NotNull
    public final Locale getLocale() {
        return this.a;
    }

    @NotNull
    public abstract CalendarMonth getMonth(int arg1, int arg2);

    @NotNull
    public abstract CalendarMonth getMonth(long arg1);

    @NotNull
    public abstract CalendarMonth getMonth(@NotNull CalendarDate arg1);

    @NotNull
    public abstract CalendarDate getToday();

    @NotNull
    public abstract List getWeekdayNames();

    @NotNull
    public abstract CalendarMonth minusMonths(@NotNull CalendarMonth arg1, int arg2);

    @Nullable
    public abstract CalendarDate parse(@NotNull String arg1, @NotNull String arg2);

    @NotNull
    public abstract CalendarMonth plusMonths(@NotNull CalendarMonth arg1, int arg2);
}

