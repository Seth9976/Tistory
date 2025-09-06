package com.kakao.android.base.utils;

import com.kakao.android.base.BaseKt;
import com.kakao.android.base.R.string;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\f\b\u00C7\u0002\u0018\u00002\u00020\u0001:\u0001/J\r\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u001D\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001A\u00020\u00022\b\u0010\t\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u0002\u00A2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000E\u0010\u000FJ5\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u00102\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0015\u001A\u00020\u00022\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0015\u0010\rJ7\u0010\u0018\u001A\u00020\u00022\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001A\u001A\u00020\u00022\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u0002\u00A2\u0006\u0004\b\u001A\u0010\rJ+\u0010\u001D\u001A\u00020\u00102\u0006\u0010\u001B\u001A\u00020\u00022\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001EJ=\u0010\"\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u001F\u001A\u00020\u00022\b\b\u0002\u0010 \u001A\u00020\u00022\b\b\u0002\u0010!\u001A\u00020\u0016\u00A2\u0006\u0004\b\"\u0010#J=\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00020$2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u001F\u001A\u00020\u00022\b\b\u0002\u0010 \u001A\u00020\u0002\u00A2\u0006\u0004\b%\u0010&JG\u0010*\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\'\u001A\u00020\u00022\b\b\u0002\u0010(\u001A\u00020\u00022\b\b\u0002\u0010)\u001A\u00020\u00162\b\b\u0002\u0010!\u001A\u00020\u0016\u00A2\u0006\u0004\b*\u0010+J)\u0010,\u001A\u00020\u00162\u0006\u0010\u001B\u001A\u00020\u00022\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b,\u0010-J)\u0010.\u001A\u00020\u00162\u0006\u0010\u001B\u001A\u00020\u00022\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b.\u0010-\u00A8\u00060"}, d2 = {"Lcom/kakao/android/base/utils/DateUtils;", "", "", "getISO8601DateTimeFormat", "()Ljava/lang/String;", "iso8601TimeStamp", "dateTimeFormat", "getDateTimeFormatFromISO8601", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "dateTime", "sourceDateTimeFormat", "destinationDateTimeFormat", "getDateTimeFormat", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getCurrentDateTime", "(Ljava/lang/String;)Ljava/lang/String;", "", "dayAgo", "sourceDateTime", "getDayAgoDateTime", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getMonthAgoDateTime", "", "isMondayFirstDayOfWeek", "getMondayDateTimeOfWeek", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "getFirstDateTimeOfMonth", "dateTime1", "dateTime2", "getCompareDateTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I", "sameYearDateTimeFormat", "differentYearDateTimeFormat", "showTodayText", "getDisplayDateTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "", "getDisplayWeekDateTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "sameMonthDateTimeFormat", "differentMonthDateTimeFormat", "showMonthFirstDayOfMonth", "getDisplayDayOfMonth", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/String;", "checkSameYear", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "checkSameMonth", "DateTimeFormat", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDateUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateUtils.kt\ncom/kakao/android/base/utils/DateUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
public final class DateUtils {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006j\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/kakao/android/base/utils/DateUtils$DateTimeFormat;", "", "", "a", "Ljava/lang/String;", "getFormat", "()Ljava/lang/String;", "format", "b", "getContentDescriptionFormat", "contentDescriptionFormat", "DATE_TIME_FORMAT_yyyy_M", "DATE_TIME_FORMAT_yyyy_M_d", "DATE_TIME_FORMAT_yyyy_MM_dd", "DATE_TIME_FORMAT_M_d_1", "DATE_TIME_FORMAT_M_d_2", "DATE_TIME_FORMAT_YEAR", "DATE_TIME_FORMAT_MONTH", "DATE_TIME_FORMAT_DAY_OF_MONTH", "DATE_TIME_FORMAT_DAY_OF_WEEK", "DATE_TIME_FORMAT_WITH_UNIT_yyyy", "DATE_TIME_FORMAT_WITH_UNIT_yyyy_M", "DATE_TIME_FORMAT_WITH_UNIT_M", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum DateTimeFormat {
        DATE_TIME_FORMAT_yyyy_M("yyyy. M.", "yyyy년 M월"),
        DATE_TIME_FORMAT_yyyy_M_d("yyyy. M. d.", "yyyy년 M월 d일"),
        DATE_TIME_FORMAT_yyyy_MM_dd("yyyy-MM-dd", "yyyy년 M월 d일"),
        DATE_TIME_FORMAT_M_d_1("M. d.", "M월 d일"),
        DATE_TIME_FORMAT_M_d_2("M. d", "M월 d일"),
        DATE_TIME_FORMAT_YEAR("yyyy", "yyyy년"),
        DATE_TIME_FORMAT_MONTH("M", "M월"),
        DATE_TIME_FORMAT_DAY_OF_MONTH("d", "d일"),
        DATE_TIME_FORMAT_DAY_OF_WEEK("EEE", null, 2, null),
        DATE_TIME_FORMAT_WITH_UNIT_yyyy("yyyy년", null, 2, null),
        DATE_TIME_FORMAT_WITH_UNIT_yyyy_M("yyyy년 M월", null, 2, null),
        DATE_TIME_FORMAT_WITH_UNIT_M("M월", null, 2, null);

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

        public DateTimeFormat(String s1, String s2, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 2) != 0) {
                s2 = s1;
            }
            this(s1, s2);
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

    @NotNull
    public static final DateUtils INSTANCE;

    static {
        DateUtils.INSTANCE = new DateUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static String a(String s, String s1, String s2) {
        Calendar calendar0 = Calendar.getInstance();
        if(s != null) {
            Date date0 = new SimpleDateFormat(s1, Locale.getDefault()).parse(s);
            if(date0 == null) {
                date0 = new Date();
            }
            calendar0.setTime(date0);
        }
        calendar0.add(5, 6);
        String s3 = new SimpleDateFormat(s2, Locale.getDefault()).format(calendar0.getTime());
        Intrinsics.checkNotNullExpressionValue(s3, "format(...)");
        return s3;
    }

    public final boolean checkSameMonth(@NotNull String s, @Nullable String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "dateTime1");
        Intrinsics.checkNotNullParameter(s2, "dateTimeFormat");
        DateTimeFormat dateUtils$DateTimeFormat0 = DateTimeFormat.DATE_TIME_FORMAT_MONTH;
        String s3 = this.getDateTimeFormat(s, s2, "M");
        if(s1 != null) {
            String s4 = DateUtils.INSTANCE.getDateTimeFormat(s1, s2, dateUtils$DateTimeFormat0.getFormat());
            return s4 == null ? Intrinsics.areEqual(s3, this.getCurrentDateTime(dateUtils$DateTimeFormat0.getFormat())) : Intrinsics.areEqual(s3, s4);
        }
        return Intrinsics.areEqual(s3, this.getCurrentDateTime(dateUtils$DateTimeFormat0.getFormat()));
    }

    public static boolean checkSameMonth$default(DateUtils dateUtils0, String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        return dateUtils0.checkSameMonth(s, s1, s2);
    }

    public final boolean checkSameYear(@NotNull String s, @Nullable String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "dateTime1");
        Intrinsics.checkNotNullParameter(s2, "dateTimeFormat");
        DateTimeFormat dateUtils$DateTimeFormat0 = DateTimeFormat.DATE_TIME_FORMAT_YEAR;
        String s3 = this.getDateTimeFormat(s, s2, "yyyy");
        if(s1 != null) {
            String s4 = DateUtils.INSTANCE.getDateTimeFormat(s1, s2, dateUtils$DateTimeFormat0.getFormat());
            return s4 == null ? Intrinsics.areEqual(s3, this.getCurrentDateTime(dateUtils$DateTimeFormat0.getFormat())) : Intrinsics.areEqual(s3, s4);
        }
        return Intrinsics.areEqual(s3, this.getCurrentDateTime(dateUtils$DateTimeFormat0.getFormat()));
    }

    public static boolean checkSameYear$default(DateUtils dateUtils0, String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        return dateUtils0.checkSameYear(s, s1, s2);
    }

    public static String getAfterWeekDateTime$default(DateUtils dateUtils0, String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = "yyyy-MM-dd";
        }
        if((v & 4) != 0) {
            s2 = "yyyy-MM-dd";
        }
        dateUtils0.getClass();
        return DateUtils.a(s, s1, s2);
    }

    public final int getCompareDateTime(@NotNull String s, @Nullable String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "dateTime1");
        Intrinsics.checkNotNullParameter(s2, "dateTimeFormat");
        DateTimeFormat dateUtils$DateTimeFormat0 = DateTimeFormat.DATE_TIME_FORMAT_yyyy_MM_dd;
        String s3 = this.getDateTimeFormat(s, s2, "yyyy-MM-dd");
        if(s1 != null) {
            String s4 = DateUtils.INSTANCE.getDateTimeFormat(s1, s2, dateUtils$DateTimeFormat0.getFormat());
            return s4 == null ? s3.compareTo(this.getCurrentDateTime(dateUtils$DateTimeFormat0.getFormat())) : s3.compareTo(s4);
        }
        return s3.compareTo(this.getCurrentDateTime(dateUtils$DateTimeFormat0.getFormat()));
    }

    public static int getCompareDateTime$default(DateUtils dateUtils0, String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = "yyyy-MM-dd\'T\'HH:mm:ssXXX";
        }
        return dateUtils0.getCompareDateTime(s, s1, s2);
    }

    @NotNull
    public final String getCurrentDateTime(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "dateTimeFormat");
        String s1 = new SimpleDateFormat(s, Locale.getDefault()).format(Calendar.getInstance().getTime());
        Intrinsics.checkNotNullExpressionValue(s1, "format(...)");
        return s1;
    }

    public static String getCurrentDateTime$default(DateUtils dateUtils0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = "yyyy-MM-dd";
        }
        return dateUtils0.getCurrentDateTime(s);
    }

    @NotNull
    public final String getDateTimeFormat(@Nullable String s, @NotNull String s1, @NotNull String s2) {
        String s3;
        Intrinsics.checkNotNullParameter(s1, "sourceDateTimeFormat");
        Intrinsics.checkNotNullParameter(s2, "destinationDateTimeFormat");
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s1, Locale.getDefault());
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(s2, Locale.getDefault());
        if(s != null) {
            Date date0 = simpleDateFormat0.parse(s);
            if(date0 == null) {
                s3 = null;
            }
            else {
                Intrinsics.checkNotNull(date0);
                s3 = simpleDateFormat1.format(date0);
            }
            if(s3 == null) {
                return "";
            }
            Intrinsics.checkNotNull(s3);
            return s3;
        }
        s3 = simpleDateFormat1.format(Calendar.getInstance().getTime());
        Intrinsics.checkNotNullExpressionValue(s3, "format(...)");
        return s3;
    }

    public static String getDateTimeFormat$default(DateUtils dateUtils0, String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = "yyyy-MM-dd";
        }
        if((v & 4) != 0) {
            s2 = "yyyy-MM-dd";
        }
        return dateUtils0.getDateTimeFormat(s, s1, s2);
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
    public final String getDayAgoDateTime(int v, @Nullable String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s1, "sourceDateTimeFormat");
        Intrinsics.checkNotNullParameter(s2, "dateTimeFormat");
        Calendar calendar0 = Calendar.getInstance();
        if(s != null) {
            Date date0 = new SimpleDateFormat(s1, Locale.getDefault()).parse(s);
            if(date0 == null) {
                date0 = new Date();
            }
            calendar0.setTime(date0);
        }
        calendar0.add(5, -v);
        String s3 = new SimpleDateFormat(s2, Locale.getDefault()).format(calendar0.getTime());
        Intrinsics.checkNotNullExpressionValue(s3, "format(...)");
        return s3;
    }

    public static String getDayAgoDateTime$default(DateUtils dateUtils0, int v, String s, String s1, String s2, int v1, Object object0) {
        if((v1 & 2) != 0) {
            s = null;
        }
        if((v1 & 4) != 0) {
            s1 = "yyyy-MM-dd";
        }
        if((v1 & 8) != 0) {
            s2 = "yyyy-MM-dd";
        }
        return dateUtils0.getDayAgoDateTime(v, s, s1, s2);
    }

    @NotNull
    public final String getDisplayDateTime(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, boolean z) {
        Intrinsics.checkNotNullParameter(s, "sourceDateTime");
        Intrinsics.checkNotNullParameter(s1, "sourceDateTimeFormat");
        Intrinsics.checkNotNullParameter(s2, "sameYearDateTimeFormat");
        Intrinsics.checkNotNullParameter(s3, "differentYearDateTimeFormat");
        if(z && DateUtils.getCompareDateTime$default(this, s, null, s1, 2, null) == 0) {
            String s4 = BaseKt.getAppContext().getString(string.label_date_time_today);
            Intrinsics.checkNotNull(s4);
            return s4;
        }
        return DateUtils.checkSameYear$default(this, s, null, s1, 2, null) ? this.getDateTimeFormat(s, s1, s2) : this.getDateTimeFormat(s, s1, s3);
    }

    public static String getDisplayDateTime$default(DateUtils dateUtils0, String s, String s1, String s2, String s3, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = "yyyy-MM-dd\'T\'HH:mm:ssXXX";
        }
        if((v & 4) != 0) {
            s2 = "M. d.";
        }
        if((v & 8) != 0) {
            s3 = "yyyy. M. d.";
        }
        if((v & 16) != 0) {
            z = false;
        }
        return dateUtils0.getDisplayDateTime(s, s1, s2, s3, z);
    }

    @NotNull
    public final String getDisplayDayOfMonth(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(s, "sourceDateTime");
        Intrinsics.checkNotNullParameter(s1, "sourceDateTimeFormat");
        Intrinsics.checkNotNullParameter(s2, "sameMonthDateTimeFormat");
        Intrinsics.checkNotNullParameter(s3, "differentMonthDateTimeFormat");
        if(z1 && DateUtils.getCompareDateTime$default(this, s, s1, null, 4, null) == 0) {
            String s4 = BaseKt.getAppContext().getString(string.label_date_time_today);
            Intrinsics.checkNotNullExpressionValue(s4, "getString(...)");
            return s4;
        }
        if(DateUtils.checkSameMonth$default(this, s, null, s1, 2, null)) {
            return !z || !Intrinsics.areEqual(this.getDateTimeFormat(s, s1, "d"), "1") ? this.getDateTimeFormat(s, s1, s2) : this.getDateTimeFormat(s, s1, s3);
        }
        return z && !Intrinsics.areEqual(this.getDateTimeFormat(s, s1, "d"), "1") ? this.getDateTimeFormat(s, s1, s2) : this.getDateTimeFormat(s, s1, s3);
    }

    public static String getDisplayDayOfMonth$default(DateUtils dateUtils0, String s, String s1, String s2, String s3, boolean z, boolean z1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = "yyyy-MM-dd\'T\'HH:mm:ssXXX";
        }
        if((v & 4) != 0) {
            s2 = "d";
        }
        if((v & 8) != 0) {
            s3 = "M. d.";
        }
        boolean z2 = (v & 16) == 0 ? z : false;
        return (v & 0x20) == 0 ? dateUtils0.getDisplayDayOfMonth(s, s1, s2, s3, z2, z1) : dateUtils0.getDisplayDayOfMonth(s, s1, s2, s3, z2, false);
    }

    @NotNull
    public final String[] getDisplayWeekDateTime(@Nullable String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s1, "sourceDateTimeFormat");
        Intrinsics.checkNotNullParameter(s2, "sameYearDateTimeFormat");
        Intrinsics.checkNotNullParameter(s3, "differentYearDateTimeFormat");
        String s4 = DateUtils.getMondayDateTimeOfWeek$default(this, (s == null ? this.getCurrentDateTime(s1) : s), s1, s1, false, 8, null);
        return new String[]{DateUtils.getDisplayDateTime$default(this, s4, s1, s2, s3, false, 16, null), DateUtils.getDisplayDateTime$default(this, DateUtils.a(s4, s1, s1), s1, s2, s3, false, 16, null)};
    }

    public static String[] getDisplayWeekDateTime$default(DateUtils dateUtils0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = "yyyy-MM-dd\'T\'HH:mm:ssXXX";
        }
        if((v & 4) != 0) {
            s2 = "M. d.";
        }
        if((v & 8) != 0) {
            s3 = "yyyy. M. d.";
        }
        return dateUtils0.getDisplayWeekDateTime(s, s1, s2, s3);
    }

    @NotNull
    public final String getFirstDateTimeOfMonth(@Nullable String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s1, "sourceDateTimeFormat");
        Intrinsics.checkNotNullParameter(s2, "destinationDateTimeFormat");
        Calendar calendar0 = Calendar.getInstance();
        if(s != null) {
            Date date0 = new SimpleDateFormat(s1, Locale.getDefault()).parse(s);
            if(date0 == null) {
                date0 = new Date();
            }
            calendar0.setTime(date0);
        }
        calendar0.set(calendar0.get(1), calendar0.get(2), calendar0.getActualMinimum(5));
        String s3 = new SimpleDateFormat(s2, Locale.getDefault()).format(calendar0.getTime());
        Intrinsics.checkNotNullExpressionValue(s3, "format(...)");
        return s3;
    }

    public static String getFirstDateTimeOfMonth$default(DateUtils dateUtils0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = "yyyy-MM-dd";
        }
        if((v & 4) != 0) {
            s2 = "yyyy-MM-dd";
        }
        return dateUtils0.getFirstDateTimeOfMonth(s, s1, s2);
    }

    @NotNull
    public final String getISO8601DateTimeFormat() [...] // Inlined contents

    @NotNull
    public final String getMondayDateTimeOfWeek(@Nullable String s, @NotNull String s1, @NotNull String s2, boolean z) {
        Intrinsics.checkNotNullParameter(s1, "sourceDateTimeFormat");
        Intrinsics.checkNotNullParameter(s2, "destinationDateTimeFormat");
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setFirstDayOfWeek((z ? 2 : 1));
        if(s != null) {
            Date date0 = new SimpleDateFormat(s1, Locale.getDefault()).parse(s);
            if(date0 == null) {
                date0 = new Date();
            }
            calendar0.setTime(date0);
        }
        calendar0.set(7, 2);
        String s3 = new SimpleDateFormat(s2, Locale.getDefault()).format(calendar0.getTime());
        Intrinsics.checkNotNullExpressionValue(s3, "format(...)");
        return s3;
    }

    public static String getMondayDateTimeOfWeek$default(DateUtils dateUtils0, String s, String s1, String s2, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = "yyyy-MM-dd";
        }
        if((v & 4) != 0) {
            s2 = "yyyy-MM-dd";
        }
        if((v & 8) != 0) {
            z = true;
        }
        return dateUtils0.getMondayDateTimeOfWeek(s, s1, s2, z);
    }

    @NotNull
    public final String getMonthAgoDateTime(@Nullable String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s1, "sourceDateTimeFormat");
        Intrinsics.checkNotNullParameter(s2, "dateTimeFormat");
        Calendar calendar0 = Calendar.getInstance();
        if(s != null) {
            Date date0 = new SimpleDateFormat(s1, Locale.getDefault()).parse(s);
            if(date0 == null) {
                date0 = new Date();
            }
            calendar0.setTime(date0);
        }
        calendar0.add(2, -1);
        String s3 = new SimpleDateFormat(s2, Locale.getDefault()).format(calendar0.getTime());
        Intrinsics.checkNotNullExpressionValue(s3, "format(...)");
        return s3;
    }

    public static String getMonthAgoDateTime$default(DateUtils dateUtils0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = "yyyy-MM-dd";
        }
        if((v & 4) != 0) {
            s2 = "yyyy-MM-dd";
        }
        return dateUtils0.getMonthAgoDateTime(s, s1, s2);
    }
}

