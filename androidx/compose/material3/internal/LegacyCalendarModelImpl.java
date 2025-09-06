package androidx.compose.material3.internal;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B\u0013\u0012\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u001B\u0010\b\u001A\u00020\u00072\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003H\u0016\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0013J\u001F\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0017J\u0017\u0010\u0018\u001A\u00020\u00142\u0006\u0010\u0012\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001C\u001A\u00020\u000F2\u0006\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u001B\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001F\u0010\u001F\u001A\u00020\u000F2\u0006\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u001E\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u001F\u0010\u001DJ+\u0010#\u001A\u00020!2\u0006\u0010 \u001A\u00020\n2\u0006\u0010\"\u001A\u00020!2\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003H\u0016\u00A2\u0006\u0004\b#\u0010$J!\u0010%\u001A\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001A\u00020!2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010\'\u001A\u00020!H\u0016\u00A2\u0006\u0004\b\'\u0010(R\u001A\u0010-\u001A\u00020\u00148\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R,\u00104\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0/0.8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0014\u00107\u001A\u00020\f8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b5\u00106\u00A8\u00069"}, d2 = {"Landroidx/compose/material3/internal/LegacyCalendarModelImpl;", "Landroidx/compose/material3/internal/CalendarModel;", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Landroidx/compose/material3/internal/DateInputFormat;", "getDateInputFormat", "(Ljava/util/Locale;)Landroidx/compose/material3/internal/DateInputFormat;", "", "timeInMillis", "Landroidx/compose/material3/internal/CalendarDate;", "getCanonicalDate", "(J)Landroidx/compose/material3/internal/CalendarDate;", "Landroidx/compose/material3/internal/CalendarMonth;", "getMonth", "(J)Landroidx/compose/material3/internal/CalendarMonth;", "date", "(Landroidx/compose/material3/internal/CalendarDate;)Landroidx/compose/material3/internal/CalendarMonth;", "", "year", "month", "(II)Landroidx/compose/material3/internal/CalendarMonth;", "getDayOfWeek", "(Landroidx/compose/material3/internal/CalendarDate;)I", "from", "addedMonthsCount", "plusMonths", "(Landroidx/compose/material3/internal/CalendarMonth;I)Landroidx/compose/material3/internal/CalendarMonth;", "subtractedMonthsCount", "minusMonths", "utcTimeMillis", "", "pattern", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "parse", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/internal/CalendarDate;", "toString", "()Ljava/lang/String;", "c", "I", "getFirstDayOfWeek", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "d", "Ljava/util/List;", "getWeekdayNames", "()Ljava/util/List;", "weekdayNames", "getToday", "()Landroidx/compose/material3/internal/CalendarDate;", "today", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLegacyCalendarModelImpl.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,241:1\n69#2,6:242\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl\n*L\n61#1:242,6\n*E\n"})
public final class LegacyCalendarModelImpl extends CalendarModel {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J=\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\n\u0010\b\u001A\u00060\u0006j\u0002`\u00072\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u000E\u001A\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/internal/LegacyCalendarModelImpl$Companion;", "", "", "utcTimeMillis", "", "pattern", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "", "cache", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;", "Ljava/util/TimeZone;", "utcTimeZone", "Ljava/util/TimeZone;", "getUtcTimeZone$material3_release", "()Ljava/util/TimeZone;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nLegacyCalendarModelImpl.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,241:1\n361#2,7:242\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.jvm.kt\nandroidx/compose/material3/internal/LegacyCalendarModelImpl$Companion\n*L\n192#1:242,7\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final String formatWithPattern(long v, @NotNull String s, @NotNull Locale locale0, @NotNull Map map0) {
            StringBuilder stringBuilder0 = b.t(s);
            stringBuilder0.append(locale0.toLanguageTag());
            String s1 = stringBuilder0.toString();
            SimpleDateFormat simpleDateFormat0 = map0.get(s1);
            if(simpleDateFormat0 == null) {
                simpleDateFormat0 = new SimpleDateFormat(s, locale0);
                simpleDateFormat0.setTimeZone(LegacyCalendarModelImpl.Companion.getUtcTimeZone$material3_release());
                map0.put(s1, simpleDateFormat0);
            }
            Calendar calendar0 = Calendar.getInstance(this.getUtcTimeZone$material3_release());
            calendar0.setTimeInMillis(v);
            return simpleDateFormat0.format(calendar0.getTimeInMillis());
        }

        @NotNull
        public final TimeZone getUtcTimeZone$material3_release() {
            return LegacyCalendarModelImpl.e;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int c;
    public final List d;
    public static final TimeZone e;

    static {
        LegacyCalendarModelImpl.Companion = new Companion(null);
        LegacyCalendarModelImpl.$stable = 8;
        LegacyCalendarModelImpl.e = TimeZone.getTimeZone("UTC");
    }

    public LegacyCalendarModelImpl(@NotNull Locale locale0) {
        super(locale0);
        int v = 7;
        int v1 = (Calendar.getInstance(locale0).getFirstDayOfWeek() + 6) % 7;
        if(v1 != 0) {
            v = v1;
        }
        this.c = v;
        List list0 = k.createListBuilder();
        String[] arr_s = new DateFormatSymbols(locale0).getWeekdays();
        String[] arr_s1 = new DateFormatSymbols(locale0).getShortWeekdays();
        List list1 = ArraysKt___ArraysKt.drop(arr_s, 2);
        int v2 = list1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            list0.add(new Pair(((String)list1.get(v3)), arr_s1[v3 + 2]));
        }
        list0.add(new Pair(arr_s[1], arr_s1[1]));
        this.d = k.build(list0);
    }

    public final CalendarMonth a(Calendar calendar0) {
        int v = 7;
        int v1 = (calendar0.get(7) + 6) % 7;
        if(v1 != 0) {
            v = v1;
        }
        int v2 = v - this.getFirstDayOfWeek();
        return new CalendarMonth(calendar0.get(1), calendar0.get(2) + 1, calendar0.getActualMaximum(5), (v2 >= 0 ? v - this.getFirstDayOfWeek() : v2 + 7), calendar0.getTimeInMillis());
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public String formatWithPattern(long v, @NotNull String s, @NotNull Locale locale0) {
        return LegacyCalendarModelImpl.Companion.formatWithPattern(v, s, locale0, this.getFormatterCache$material3_release());
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarDate getCanonicalDate(long v) {
        Calendar calendar0 = Calendar.getInstance(LegacyCalendarModelImpl.e);
        calendar0.setTimeInMillis(v);
        calendar0.set(11, 0);
        calendar0.set(12, 0);
        calendar0.set(13, 0);
        calendar0.set(14, 0);
        return new CalendarDate(calendar0.get(1), calendar0.get(2) + 1, calendar0.get(5), calendar0.getTimeInMillis());
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public DateInputFormat getDateInputFormat(@NotNull Locale locale0) {
        DateFormat dateFormat0 = DateFormat.getDateInstance(3, locale0);
        Intrinsics.checkNotNull(dateFormat0, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return CalendarModelKt.datePatternAsInputFormat(((SimpleDateFormat)dateFormat0).toPattern());
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    public int getDayOfWeek(@NotNull CalendarDate calendarDate0) {
        Calendar calendar0 = Calendar.getInstance(TimeZone.getDefault());
        calendar0.clear();
        calendar0.set(1, calendarDate0.getYear());
        calendar0.set(2, calendarDate0.getMonth() - 1);
        calendar0.set(5, calendarDate0.getDayOfMonth());
        int v = (calendar0.get(7) + 6) % 7;
        return v == 0 ? 7 : v;
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    public int getFirstDayOfWeek() {
        return this.c;
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarMonth getMonth(int v, int v1) {
        Calendar calendar0 = Calendar.getInstance(LegacyCalendarModelImpl.e);
        calendar0.clear();
        calendar0.set(1, v);
        calendar0.set(2, v1 - 1);
        calendar0.set(5, 1);
        return this.a(calendar0);
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarMonth getMonth(long v) {
        Calendar calendar0 = Calendar.getInstance(LegacyCalendarModelImpl.e);
        calendar0.setTimeInMillis(v);
        calendar0.set(5, 1);
        calendar0.set(11, 0);
        calendar0.set(12, 0);
        calendar0.set(13, 0);
        calendar0.set(14, 0);
        return this.a(calendar0);
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarMonth getMonth(@NotNull CalendarDate calendarDate0) {
        return this.getMonth(calendarDate0.getYear(), calendarDate0.getMonth());
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarDate getToday() {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.set(11, 0);
        calendar0.set(12, 0);
        calendar0.set(13, 0);
        calendar0.set(14, 0);
        int v = calendar0.get(15);
        int v1 = calendar0.get(16);
        return new CalendarDate(calendar0.get(1), calendar0.get(2) + 1, calendar0.get(5), calendar0.getTimeInMillis() + ((long)(v1 + v)));
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public List getWeekdayNames() {
        return this.d;
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarMonth minusMonths(@NotNull CalendarMonth calendarMonth0, int v) {
        if(v <= 0) {
            return calendarMonth0;
        }
        Calendar calendar0 = Calendar.getInstance(LegacyCalendarModelImpl.e);
        calendar0.setTimeInMillis(calendarMonth0.getStartUtcTimeMillis());
        calendar0.add(2, -v);
        return this.a(calendar0);
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @Nullable
    public CalendarDate parse(@NotNull String s, @NotNull String s1) {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s1);
        TimeZone timeZone0 = LegacyCalendarModelImpl.e;
        simpleDateFormat0.setTimeZone(timeZone0);
        simpleDateFormat0.setLenient(false);
        try {
            Date date0 = simpleDateFormat0.parse(s);
            if(date0 == null) {
                return null;
            }
            Calendar calendar0 = Calendar.getInstance(timeZone0);
            calendar0.setTime(date0);
            return new CalendarDate(calendar0.get(1), calendar0.get(2) + 1, calendar0.get(5), calendar0.getTimeInMillis());
        }
        catch(ParseException unused_ex) {
            return null;
        }
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarMonth plusMonths(@NotNull CalendarMonth calendarMonth0, int v) {
        if(v <= 0) {
            return calendarMonth0;
        }
        Calendar calendar0 = Calendar.getInstance(LegacyCalendarModelImpl.e);
        calendar0.setTimeInMillis(calendarMonth0.getStartUtcTimeMillis());
        calendar0.add(2, v);
        return this.a(calendar0);
    }

    @Override
    @NotNull
    public String toString() {
        return "LegacyCalendarModel";
    }
}

