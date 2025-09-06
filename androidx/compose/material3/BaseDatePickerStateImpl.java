package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\f\b!\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\n\u0010\n\u001A\u00060\bj\u0002`\t¢\u0006\u0004\b\u000B\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001A\u001A\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R$\u0010 \u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u00028F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001F¨\u0006!"}, d2 = {"Landroidx/compose/material3/BaseDatePickerStateImpl;", "", "", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Lkotlin/ranges/IntRange;Landroidx/compose/material3/SelectableDates;Ljava/util/Locale;)V", "a", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "b", "Landroidx/compose/material3/SelectableDates;", "getSelectableDates", "()Landroidx/compose/material3/SelectableDates;", "Landroidx/compose/material3/internal/CalendarModel;", "c", "Landroidx/compose/material3/internal/CalendarModel;", "getCalendarModel", "()Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "monthMillis", "getDisplayedMonthMillis", "()J", "setDisplayedMonthMillis", "(J)V", "displayedMonthMillis", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class BaseDatePickerStateImpl {
    public static final int $stable;
    public final IntRange a;
    public final SelectableDates b;
    public final CalendarModel c;
    public final MutableState d;

    public BaseDatePickerStateImpl(@Nullable Long long0, @NotNull IntRange intRange0, @NotNull SelectableDates selectableDates0, @NotNull Locale locale0) {
        CalendarMonth calendarMonth0;
        this.a = intRange0;
        this.b = selectableDates0;
        CalendarModel calendarModel0 = CalendarModel_androidKt.createCalendarModel(locale0);
        this.c = calendarModel0;
        if(long0 == null) {
            calendarMonth0 = calendarModel0.getMonth(calendarModel0.getToday());
        }
        else {
            calendarMonth0 = calendarModel0.getMonth(((long)long0));
            if(!intRange0.contains(calendarMonth0.getYear())) {
                throw new IllegalArgumentException(("The initial display month\'s year (" + calendarMonth0.getYear() + ") is out of the years range of " + intRange0 + '.').toString());
            }
        }
        this.d = SnapshotStateKt.mutableStateOf$default(calendarMonth0, null, 2, null);
    }

    @NotNull
    public final CalendarModel getCalendarModel() {
        return this.c;
    }

    public final long getDisplayedMonthMillis() {
        return ((CalendarMonth)this.d.getValue()).getStartUtcTimeMillis();
    }

    @NotNull
    public final SelectableDates getSelectableDates() {
        return this.b;
    }

    @NotNull
    public final IntRange getYearRange() {
        return this.a;
    }

    public final void setDisplayedMonthMillis(long v) {
        CalendarMonth calendarMonth0 = this.c.getMonth(v);
        IntRange intRange0 = this.a;
        if(!intRange0.contains(calendarMonth0.getYear())) {
            throw new IllegalArgumentException(("The display month\'s year (" + calendarMonth0.getYear() + ") is out of the years range of " + intRange0 + '.').toString());
        }
        this.d.setValue(calendarMonth0);
    }
}

