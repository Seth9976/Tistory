package com.kakao.tistory.presentation.common.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001EJ3\u0010\t\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u000B\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u0011\u0010\r\u001A\u00020\u0002*\u00020\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u0011\u0010\u0010\u001A\u00020\u000F*\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001A\u00020\u0002*\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u000EJ\u0011\u0010\u0013\u001A\u00020\u0002*\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u000EJ\r\u0010\u0014\u001A\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001A\u00020\u0002*\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u000EJ\u0011\u0010\u0017\u001A\u00020\u0002*\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u000EJ\u0011\u0010\u0018\u001A\u00020\u0002*\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u000EJ\u001F\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001B\u001A\u00020\u0002¢\u0006\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/common/utils/DateUtils;", "", "", "iso8601TimeStamp", "Ljava/time/ZonedDateTime;", "now", "dateTimeFormat", "Ljava/time/ZoneId;", "zoneId", "getRelativeDateTime", "(Ljava/lang/String;Ljava/time/ZonedDateTime;Ljava/lang/String;Ljava/time/ZoneId;)Ljava/lang/String;", "getDateTimeFormatFromISO8601", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getRelativeDay", "(Ljava/lang/String;)Ljava/lang/String;", "", "dayOfMonth", "(Ljava/lang/String;)I", "dayOfWeek", "getMonth", "currentDate", "()Ljava/lang/String;", "dotFormat", "getMonthOrEmpty", "getYearOrEmpty", "Ljava/util/Date;", "date", "format", "getDateFormat", "(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;", "DateTimeFormat", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DateUtils {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u000F\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006j\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/common/utils/DateUtils$DateTimeFormat;", "", "", "a", "Ljava/lang/String;", "getFormat", "()Ljava/lang/String;", "format", "b", "getContentDescriptionFormat", "contentDescriptionFormat", "DATE_TIME_FORMAT_yyyy_M_d", "DATE_TIME_FORMAT_M_d_HH_mm", "DATE_TIME_FORMAT_YYYY_MM_DD", "DATE_TIME_FORMAT_yyyy_M_D_HH_mm", "DATE_TIME_FORMAT_HH_mm", "DATE_TIME_FORMAT_M_d_1", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum DateTimeFormat {
        DATE_TIME_FORMAT_yyyy_M_d("yyyy. M. d.", "yyyy년 M월 d일"),
        DATE_TIME_FORMAT_M_d_HH_mm("M. d. HH:mm", "M월 d일 HH시 m분"),
        DATE_TIME_FORMAT_YYYY_MM_DD("yyyy-MM-dd", "yyyy년 M월 d일"),
        DATE_TIME_FORMAT_yyyy_M_D_HH_mm("yyyy. M. d. HH:mm", "yyyy년 M월 d일 HH시 m분"),
        DATE_TIME_FORMAT_HH_mm("HH:mm", "HH시 m분"),
        DATE_TIME_FORMAT_M_d_1("M. d.", "M월 d일");

        public final String a;
        public final String b;
        public static final DateTimeFormat[] c;
        public static final EnumEntries d;

        static {
            DateTimeFormat.c = arr_dateUtils$DateTimeFormat;
            Intrinsics.checkNotNullParameter(arr_dateUtils$DateTimeFormat, "entries");
            DateTimeFormat.d = new a(arr_dateUtils$DateTimeFormat);
        }

        public DateTimeFormat(String s1, String s2) {
            this.a = s1;
            this.b = s2;
        }

        @NotNull
        public final String getContentDescriptionFormat() {
            return this.b;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return DateTimeFormat.d;
        }

        @NotNull
        public final String getFormat() {
            return this.a;
        }
    }

    public static final int $stable;
    @NotNull
    public static final DateUtils INSTANCE;

    static {
        DateUtils.INSTANCE = new DateUtils();
    }

    @NotNull
    public final String currentDate() [...] // 潜在的解密器

    public final int dayOfMonth(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return LocalDate.parse(s).getDayOfMonth();
    }

    @NotNull
    public final String dayOfWeek(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        String s1 = LocalDate.parse(s).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN);
        return s1 == null ? "" : s1;
    }

    @NotNull
    public final String dotFormat(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ofPattern("yyyy. M. d.");
        String s1 = LocalDate.parse(s).format(dateTimeFormatter0);
        Intrinsics.checkNotNullExpressionValue(s1, "format(...)");
        return s1;
    }

    @NotNull
    public final String getDateFormat(@NotNull Date date0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(date0, "date");
        Intrinsics.checkNotNullParameter(s, "format");
        String s1 = new SimpleDateFormat(s, Locale.getDefault()).format(date0);
        Intrinsics.checkNotNullExpressionValue(s1, "format(...)");
        return s1;
    }

    public static String getDateFormat$default(DateUtils dateUtils0, Date date0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            s = "yyyy-MM-dd";
        }
        return dateUtils0.getDateFormat(date0, s);
    }

    @NotNull
    public final String getDateTimeFormatFromISO8601(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "iso8601TimeStamp");
        Intrinsics.checkNotNullParameter(s1, "dateTimeFormat");
        String s2 = LocalDateTime.from(Instant.from(DateTimeFormatter.ISO_DATE_TIME.parse(s)).atZone(ZoneId.systemDefault())).format(DateTimeFormatter.ofPattern(s1));
        Intrinsics.checkNotNullExpressionValue(s2, "format(...)");
        return s2;
    }

    @NotNull
    public final String getMonth(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        String s1 = LocalDate.parse(s).getMonth().getDisplayName(TextStyle.SHORT, Locale.KOREAN);
        Intrinsics.checkNotNullExpressionValue(s1, "getDisplayName(...)");
        return s1;
    }

    @NotNull
    public final String getMonthOrEmpty(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        LocalDate localDate0 = LocalDate.parse(s);
        return localDate0.minusDays(7L).getMonth().getValue() == localDate0.getMonth().getValue() ? "" : this.getMonth(s);
    }

    @NotNull
    public final String getRelativeDateTime(@NotNull String s, @NotNull ZonedDateTime zonedDateTime0, @NotNull String s1, @NotNull ZoneId zoneId0) {
        String s2;
        Intrinsics.checkNotNullParameter(s, "iso8601TimeStamp");
        Intrinsics.checkNotNullParameter(zonedDateTime0, "now");
        Intrinsics.checkNotNullParameter(s1, "dateTimeFormat");
        Intrinsics.checkNotNullParameter(zoneId0, "zoneId");
        try {
            ZonedDateTime zonedDateTime1 = ZonedDateTime.parse(s, DateTimeFormatter.ISO_OFFSET_DATE_TIME).withZoneSameInstant(zoneId0);
            ZonedDateTime zonedDateTime2 = zonedDateTime0.withZoneSameInstant(zoneId0);
            Duration duration0 = Duration.between(zonedDateTime1, zonedDateTime2);
            Duration duration1 = Duration.between(zonedDateTime1.toLocalDate().atStartOfDay(zoneId0), zonedDateTime2.toLocalDate().atStartOfDay(zoneId0));
            if(duration0.getSeconds() < TimeUnit.MINUTES.toSeconds(1L)) {
                s2 = "방금";
            }
            else if(duration0.getSeconds() < TimeUnit.HOURS.toSeconds(1L)) {
                s2 = duration0.toMinutes() + "분 전";
            }
            else {
                long v = duration0.getSeconds();
                TimeUnit timeUnit0 = TimeUnit.DAYS;
                if(v < timeUnit0.toSeconds(1L)) {
                    s2 = duration0.toHours() + "시간 전";
                }
                else {
                    s2 = duration1.getSeconds() >= timeUnit0.toSeconds(7L) ? zonedDateTime1.format(DateTimeFormatter.ofPattern(s1, Locale.getDefault()).withResolverStyle(ResolverStyle.STRICT)) : duration1.toDays() + "일 전";
                }
            }
            Intrinsics.checkNotNull(s2);
            return s2;
        }
        catch(Exception exception0) {
        }
        System.out.println(exception0);
        return "";
    }

    public static String getRelativeDateTime$default(DateUtils dateUtils0, String s, ZonedDateTime zonedDateTime0, String s1, ZoneId zoneId0, int v, Object object0) {
        if((v & 2) != 0) {
            zonedDateTime0 = ZonedDateTime.now();
            Intrinsics.checkNotNullExpressionValue(zonedDateTime0, "now(...)");
        }
        if((v & 4) != 0) {
            s1 = "yyyy. M. d.";
        }
        if((v & 8) != 0) {
            zoneId0 = zonedDateTime0.getZone();
            Intrinsics.checkNotNullExpressionValue(zoneId0, "getZone(...)");
        }
        return dateUtils0.getRelativeDateTime(s, zonedDateTime0, s1, zoneId0);
    }

    @NotNull
    public final String getRelativeDay(@NotNull String s) {
        String s2;
        Intrinsics.checkNotNullParameter(s, "<this>");
        String s1 = String.valueOf(LocalDateTime.now().getDayOfMonth());
        try {
            s2 = "";
            s2 = this.getDateTimeFormatFromISO8601(s, "d");
        }
        catch(Exception unused_ex) {
        }
        return Intrinsics.areEqual(s1, s2) ? "오늘" : s2;
    }

    @NotNull
    public final String getYearOrEmpty(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        LocalDate localDate0 = LocalDate.parse(s);
        int v = localDate0.minusDays(1L).getYear();
        int v1 = localDate0.getYear();
        return v == v1 ? "" : String.valueOf(v1);
    }
}

