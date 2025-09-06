package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.Locale;
import kotlin.ranges.IntRange;

public final class r8 extends BaseDatePickerStateImpl implements DateRangePickerState {
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;
    public static final DateRangePickerStateImpl.Companion h;

    static {
        r8.h = new DateRangePickerStateImpl.Companion(null);
    }

    public r8(Locale locale0, Long long0, Long long1, Long long2, IntRange intRange0, int v, SelectableDates selectableDates0) {
        super(long2, intRange0, selectableDates0, locale0);
        this.e = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.setSelection(long0, long1);
        this.g = SnapshotStateKt.mutableStateOf$default(DisplayMode.box-impl(v), null, 2, null);
    }

    @Override  // androidx.compose.material3.DateRangePickerState
    public final int getDisplayMode-jFl-4v0() {
        return ((DisplayMode)this.g.getValue()).unbox-impl();
    }

    @Override  // androidx.compose.material3.DateRangePickerState
    public final Long getSelectedEndDateMillis() {
        CalendarDate calendarDate0 = (CalendarDate)this.f.getValue();
        return calendarDate0 == null ? null : calendarDate0.getUtcTimeMillis();
    }

    @Override  // androidx.compose.material3.DateRangePickerState
    public final Long getSelectedStartDateMillis() {
        CalendarDate calendarDate0 = (CalendarDate)this.e.getValue();
        return calendarDate0 == null ? null : calendarDate0.getUtcTimeMillis();
    }

    @Override  // androidx.compose.material3.DateRangePickerState
    public final void setDisplayMode-vCnGnXg(int v) {
        Long long0 = this.getSelectedStartDateMillis();
        if(long0 != null) {
            this.setDisplayedMonthMillis(this.getCalendarModel().getMonth(long0.longValue()).getStartUtcTimeMillis());
        }
        DisplayMode displayMode0 = DisplayMode.box-impl(v);
        this.g.setValue(displayMode0);
    }

    @Override  // androidx.compose.material3.DateRangePickerState
    public final void setSelection(Long long0, Long long1) {
        CalendarDate calendarDate0 = null;
        CalendarDate calendarDate1 = long0 == null ? null : this.getCalendarModel().getCanonicalDate(((long)long0));
        if(long1 != null) {
            calendarDate0 = this.getCalendarModel().getCanonicalDate(((long)long1));
        }
        if(calendarDate1 != null && !this.getYearRange().contains(calendarDate1.getYear())) {
            throw new IllegalArgumentException(("The provided start date year (" + calendarDate1.getYear() + ") is out of the years range of " + this.getYearRange() + '.').toString());
        }
        if(calendarDate0 != null && !this.getYearRange().contains(calendarDate0.getYear())) {
            throw new IllegalArgumentException(("The provided end date year (" + calendarDate0.getYear() + ") is out of the years range of " + this.getYearRange() + '.').toString());
        }
        if(calendarDate0 != null) {
            if(calendarDate1 == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.");
            }
            if(calendarDate1.getUtcTimeMillis() > calendarDate0.getUtcTimeMillis()) {
                throw new IllegalArgumentException("The provided end date appears before the start date.");
            }
        }
        this.e.setValue(calendarDate1);
        this.f.setValue(calendarDate0);
    }
}

