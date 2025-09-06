package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0001\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\n\u0012\u0006\u0010\u000E\u001A\u00020\n\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u000F¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u001D\u001A\u00020\n2\b\u0010\u0015\u001A\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001A\u00020\u00162\n\u0010\u001A\u001A\u00060\u0018j\u0002`\u0019ø\u0001\u0000¢\u0006\u0004\b\u001B\u0010\u001CR$\u0010\u0010\u001A\u0004\u0018\u00010\u000F8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0011\u001A\u0004\u0018\u00010\u000F8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b$\u0010\u001F\u001A\u0004\b%\u0010!\"\u0004\b&\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"Landroidx/compose/material3/DateInputValidator;", "", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/internal/DateInputFormat;", "dateInputFormat", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "", "errorDatePattern", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "", "currentStartDateMillis", "currentEndDateMillis", "<init>", "(Lkotlin/ranges/IntRange;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/DateInputFormat;Landroidx/compose/material3/DatePickerFormatter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/material3/internal/CalendarDate;", "dateToValidate", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "validate-XivgLIo", "(Landroidx/compose/material3/internal/CalendarDate;ILjava/util/Locale;)Ljava/lang/String;", "validate", "i", "Ljava/lang/Long;", "getCurrentStartDateMillis$material3_release", "()Ljava/lang/Long;", "setCurrentStartDateMillis$material3_release", "(Ljava/lang/Long;)V", "j", "getCurrentEndDateMillis$material3_release", "setCurrentEndDateMillis$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DateInputValidator {
    public static final int $stable;
    public final IntRange a;
    public final SelectableDates b;
    public final DateInputFormat c;
    public final DatePickerFormatter d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public Long i;
    public Long j;

    public DateInputValidator(@NotNull IntRange intRange0, @NotNull SelectableDates selectableDates0, @NotNull DateInputFormat dateInputFormat0, @NotNull DatePickerFormatter datePickerFormatter0, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @Nullable Long long0, @Nullable Long long1) {
        this.a = intRange0;
        this.b = selectableDates0;
        this.c = dateInputFormat0;
        this.d = datePickerFormatter0;
        this.e = s;
        this.f = s1;
        this.g = s2;
        this.h = s3;
        this.i = long0;
        this.j = long1;
    }

    public DateInputValidator(IntRange intRange0, SelectableDates selectableDates0, DateInputFormat dateInputFormat0, DatePickerFormatter datePickerFormatter0, String s, String s1, String s2, String s3, Long long0, Long long1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(intRange0, selectableDates0, dateInputFormat0, datePickerFormatter0, s, s1, s2, s3, ((v & 0x100) == 0 ? long0 : null), ((v & 0x200) == 0 ? long1 : null));
    }

    @Nullable
    public final Long getCurrentEndDateMillis$material3_release() {
        return this.j;
    }

    @Nullable
    public final Long getCurrentStartDateMillis$material3_release() {
        return this.i;
    }

    public final void setCurrentEndDateMillis$material3_release(@Nullable Long long0) {
        this.j = long0;
    }

    public final void setCurrentStartDateMillis$material3_release(@Nullable Long long0) {
        this.i = long0;
    }

    @NotNull
    public final String validate-XivgLIo(@Nullable CalendarDate calendarDate0, int v, @NotNull Locale locale0) {
        if(calendarDate0 == null) {
            String s = this.c.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Object[] arr_object = Arrays.copyOf(new Object[]{s}, 1);
            String s1 = String.format(this.e, arr_object);
            Intrinsics.checkNotNullExpressionValue(s1, "format(this, *args)");
            return s1;
        }
        IntRange intRange0 = this.a;
        if(!intRange0.contains(calendarDate0.getYear())) {
            Object[] arr_object1 = Arrays.copyOf(new Object[]{CalendarLocale_jvmKt.toLocalString$default(intRange0.getFirst(), 0, 0, false, 7, null), CalendarLocale_jvmKt.toLocalString$default(intRange0.getLast(), 0, 0, false, 7, null)}, 2);
            String s2 = String.format(this.f, arr_object1);
            Intrinsics.checkNotNullExpressionValue(s2, "format(this, *args)");
            return s2;
        }
        if(!InputIdentifier.equals-impl0(v, 1) || calendarDate0.getUtcTimeMillis() < (this.j == null ? 0x7FFFFFFFFFFFFFFFL : ((long)this.j))) {
            if(InputIdentifier.equals-impl0(v, 2)) {
                return calendarDate0.getUtcTimeMillis() >= (this.i == null ? 0x8000000000000000L : ((long)this.i)) ? "" : this.h;
            }
            return "";
        }
        return this.h;
    }
}

