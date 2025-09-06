package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.Locale;
import kotlin.ranges.IntRange;

public final class q7 extends BaseDatePickerStateImpl implements DatePickerState {
    public final MutableState e;
    public final MutableState f;
    public static final DatePickerStateImpl.Companion g;

    static {
        q7.g = new DatePickerStateImpl.Companion(null);
    }

    public q7(Locale locale0, Long long0, Long long1, IntRange intRange0, int v, SelectableDates selectableDates0) {
        super(long1, intRange0, selectableDates0, locale0);
        CalendarDate calendarDate0;
        if(long0 == null) {
            calendarDate0 = null;
        }
        else {
            calendarDate0 = this.getCalendarModel().getCanonicalDate(((long)long0));
            if(!intRange0.contains(calendarDate0.getYear())) {
                throw new IllegalArgumentException(("The provided initial date\'s year (" + calendarDate0.getYear() + ") is out of the years range of " + intRange0 + '.').toString());
            }
        }
        this.e = SnapshotStateKt.mutableStateOf$default(calendarDate0, null, 2, null);
        this.f = SnapshotStateKt.mutableStateOf$default(DisplayMode.box-impl(v), null, 2, null);
    }

    @Override  // androidx.compose.material3.DatePickerState
    public final int getDisplayMode-jFl-4v0() {
        return ((DisplayMode)this.f.getValue()).unbox-impl();
    }

    @Override  // androidx.compose.material3.DatePickerState
    public final Long getSelectedDateMillis() {
        CalendarDate calendarDate0 = (CalendarDate)this.e.getValue();
        return calendarDate0 == null ? null : calendarDate0.getUtcTimeMillis();
    }

    @Override  // androidx.compose.material3.DatePickerState
    public final void setDisplayMode-vCnGnXg(int v) {
        Long long0 = this.getSelectedDateMillis();
        if(long0 != null) {
            this.setDisplayedMonthMillis(this.getCalendarModel().getMonth(long0.longValue()).getStartUtcTimeMillis());
        }
        DisplayMode displayMode0 = DisplayMode.box-impl(v);
        this.f.setValue(displayMode0);
    }

    @Override  // androidx.compose.material3.DatePickerState
    public final void setSelectedDateMillis(Long long0) {
        MutableState mutableState0 = this.e;
        if(long0 != null) {
            CalendarDate calendarDate0 = this.getCalendarModel().getCanonicalDate(((long)long0));
            if(!this.getYearRange().contains(calendarDate0.getYear())) {
                throw new IllegalArgumentException(("The provided date\'s year (" + calendarDate0.getYear() + ") is out of the years range of " + this.getYearRange() + '.').toString());
            }
            mutableState0.setValue(calendarDate0);
            return;
        }
        mutableState0.setValue(null);
    }
}

