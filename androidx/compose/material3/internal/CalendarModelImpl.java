package androidx.compose.material3.internal;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(26)
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 82\u00020\u0001:\u00018B\u0013\u0012\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u001B\u0010\b\u001A\u00020\u00072\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003H\u0016\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0013J\u001F\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0017J\u0017\u0010\u0018\u001A\u00020\u00142\u0006\u0010\u0012\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001C\u001A\u00020\u000F2\u0006\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u001B\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001F\u0010\u001F\u001A\u00020\u000F2\u0006\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u001E\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u001F\u0010\u001DJ+\u0010#\u001A\u00020!2\u0006\u0010 \u001A\u00020\n2\u0006\u0010\"\u001A\u00020!2\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003H\u0016\u00A2\u0006\u0004\b#\u0010$J!\u0010%\u001A\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001A\u00020!2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010\'\u001A\u00020!H\u0016\u00A2\u0006\u0004\b\'\u0010(R\u001A\u0010-\u001A\u00020\u00148\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R,\u00104\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0/0.8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0014\u00107\u001A\u00020\f8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b5\u00106\u00A8\u00069"}, d2 = {"Landroidx/compose/material3/internal/CalendarModelImpl;", "Landroidx/compose/material3/internal/CalendarModel;", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Landroidx/compose/material3/internal/DateInputFormat;", "getDateInputFormat", "(Ljava/util/Locale;)Landroidx/compose/material3/internal/DateInputFormat;", "", "timeInMillis", "Landroidx/compose/material3/internal/CalendarDate;", "getCanonicalDate", "(J)Landroidx/compose/material3/internal/CalendarDate;", "Landroidx/compose/material3/internal/CalendarMonth;", "getMonth", "(J)Landroidx/compose/material3/internal/CalendarMonth;", "date", "(Landroidx/compose/material3/internal/CalendarDate;)Landroidx/compose/material3/internal/CalendarMonth;", "", "year", "month", "(II)Landroidx/compose/material3/internal/CalendarMonth;", "getDayOfWeek", "(Landroidx/compose/material3/internal/CalendarDate;)I", "from", "addedMonthsCount", "plusMonths", "(Landroidx/compose/material3/internal/CalendarMonth;I)Landroidx/compose/material3/internal/CalendarMonth;", "subtractedMonthsCount", "minusMonths", "utcTimeMillis", "", "pattern", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "parse", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/internal/CalendarDate;", "toString", "()Ljava/lang/String;", "c", "I", "getFirstDayOfWeek", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "d", "Ljava/util/List;", "getWeekdayNames", "()Ljava/util/List;", "weekdayNames", "getToday", "()Landroidx/compose/material3/internal/CalendarDate;", "today", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/internal/CalendarModelImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,232:1\n11335#2:233\n11670#2,3:234\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/internal/CalendarModelImpl\n*L\n68#1:233\n68#1:234,3\n*E\n"})
public final class CalendarModelImpl extends CalendarModel {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J=\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\n\u0010\b\u001A\u00060\u0006j\u0002`\u00072\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u000E\u001A\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/internal/CalendarModelImpl$Companion;", "", "", "utcTimeMillis", "", "pattern", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "", "cache", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;", "Ljava/time/ZoneId;", "utcTimeZoneId", "Ljava/time/ZoneId;", "getUtcTimeZoneId$material3_release", "()Ljava/time/ZoneId;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/internal/CalendarModelImpl$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,232:1\n361#2,7:233\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/internal/CalendarModelImpl$Companion\n*L\n194#1:233,7\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final String formatWithPattern(long v, @NotNull String s, @NotNull Locale locale0, @NotNull Map map0) {
            String s1 = "P:" + s + locale0.toLanguageTag();
            DateTimeFormatter dateTimeFormatter0 = map0.get(s1);
            if(dateTimeFormatter0 == null) {
                dateTimeFormatter0 = DateTimeFormatter.ofPattern(s, locale0).withDecimalStyle(DecimalStyle.of(locale0));
                map0.put(s1, dateTimeFormatter0);
            }
            Intrinsics.checkNotNull(dateTimeFormatter0, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return Instant.ofEpochMilli(v).atZone(this.getUtcTimeZoneId$material3_release()).toLocalDate().format(dateTimeFormatter0);
        }

        @NotNull
        public final ZoneId getUtcTimeZoneId$material3_release() {
            return CalendarModelImpl.e;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int c;
    public final ArrayList d;
    public static final ZoneId e;

    static {
        CalendarModelImpl.Companion = new Companion(null);
        CalendarModelImpl.$stable = 8;
        CalendarModelImpl.e = ZoneId.of("UTC");
    }

    public CalendarModelImpl(@NotNull Locale locale0) {
        super(locale0);
        this.c = WeekFields.of(locale0).getFirstDayOfWeek().getValue();
        DayOfWeek[] arr_dayOfWeek = DayOfWeek.values();
        ArrayList arrayList0 = new ArrayList(arr_dayOfWeek.length);
        for(int v = 0; v < arr_dayOfWeek.length; ++v) {
            DayOfWeek dayOfWeek0 = arr_dayOfWeek[v];
            arrayList0.add(TuplesKt.to(dayOfWeek0.getDisplayName(TextStyle.FULL, locale0), dayOfWeek0.getDisplayName(TextStyle.NARROW, locale0)));
        }
        this.d = arrayList0;
    }

    public final CalendarMonth a(LocalDate localDate0) {
        int v = localDate0.getDayOfWeek().getValue() - this.getFirstDayOfWeek();
        if(v < 0) {
            v += 7;
        }
        long v1 = localDate0.atTime(LocalTime.MIDNIGHT).atZone(CalendarModelImpl.e).toInstant().toEpochMilli();
        return new CalendarMonth(localDate0.getYear(), localDate0.getMonthValue(), localDate0.lengthOfMonth(), v, v1);
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public String formatWithPattern(long v, @NotNull String s, @NotNull Locale locale0) {
        return CalendarModelImpl.Companion.formatWithPattern(v, s, locale0, this.getFormatterCache$material3_release());
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarDate getCanonicalDate(long v) {
        LocalDate localDate0 = Instant.ofEpochMilli(v).atZone(CalendarModelImpl.e).toLocalDate();
        return new CalendarDate(localDate0.getYear(), localDate0.getMonthValue(), localDate0.getDayOfMonth(), localDate0.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * 1000L);
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public DateInputFormat getDateInputFormat(@NotNull Locale locale0) {
        return CalendarModelKt.datePatternAsInputFormat(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale0), locale0));
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    public int getDayOfWeek(@NotNull CalendarDate calendarDate0) {
        return LocalDate.of(calendarDate0.getYear(), calendarDate0.getMonth(), calendarDate0.getDayOfMonth()).getDayOfWeek().getValue();
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    public int getFirstDayOfWeek() {
        return this.c;
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarMonth getMonth(int v, int v1) {
        return this.a(LocalDate.of(v, v1, 1));
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarMonth getMonth(long v) {
        return this.a(Instant.ofEpochMilli(v).atZone(CalendarModelImpl.e).withDayOfMonth(1).toLocalDate());
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarMonth getMonth(@NotNull CalendarDate calendarDate0) {
        return this.a(LocalDate.of(calendarDate0.getYear(), calendarDate0.getMonth(), 1));
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarDate getToday() {
        LocalDate localDate0 = LocalDate.now();
        return new CalendarDate(localDate0.getYear(), localDate0.getMonthValue(), localDate0.getDayOfMonth(), localDate0.atTime(LocalTime.MIDNIGHT).atZone(CalendarModelImpl.e).toInstant().toEpochMilli());
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public List getWeekdayNames() {
        return this.d;
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarMonth minusMonths(@NotNull CalendarMonth calendarMonth0, int v) {
        return v > 0 ? this.a(Instant.ofEpochMilli(calendarMonth0.getStartUtcTimeMillis()).atZone(CalendarModelImpl.e).toLocalDate().minusMonths(((long)v))) : calendarMonth0;
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @Nullable
    public CalendarDate parse(@NotNull String s, @NotNull String s1) {
        DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ofPattern(s1);
        try {
            LocalDate localDate0 = LocalDate.parse(s, dateTimeFormatter0);
            return new CalendarDate(localDate0.getYear(), localDate0.getMonth().getValue(), localDate0.getDayOfMonth(), localDate0.atTime(LocalTime.MIDNIGHT).atZone(CalendarModelImpl.e).toInstant().toEpochMilli());
        }
        catch(DateTimeParseException unused_ex) {
            return null;
        }
    }

    @Override  // androidx.compose.material3.internal.CalendarModel
    @NotNull
    public CalendarMonth plusMonths(@NotNull CalendarMonth calendarMonth0, int v) {
        return v > 0 ? this.a(Instant.ofEpochMilli(calendarMonth0.getStartUtcTimeMillis()).atZone(CalendarModelImpl.e).toLocalDate().plusMonths(((long)v))) : calendarMonth0;
    }

    @Override
    @NotNull
    public String toString() {
        return "CalendarModel";
    }
}

